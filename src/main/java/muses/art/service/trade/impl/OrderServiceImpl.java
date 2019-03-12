package muses.art.service.trade.impl;

import muses.art.dao.trade.AddressDao;
import muses.art.dao.trade.CartDao;
import muses.art.dao.trade.OrderCommodityDao;
import muses.art.dao.trade.OrderDao;
import muses.art.entity.trade.Address;
import muses.art.entity.trade.Cart;
import muses.art.entity.trade.Order;
import muses.art.entity.trade.OrderCommodity;
import muses.art.model.base.PageModel;
import muses.art.model.trade.OrderCommodityModel;
import muses.art.model.trade.OrderFromCartModel;
import muses.art.model.trade.OrderModel;
import muses.art.model.trade.SimpleOrderModel;
import muses.art.service.trade.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.sql.Timestamp;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Autowired
    private CartDao cartDao;

    @Autowired
    private AddressDao addressDao;

    @Autowired
    private OrderCommodityDao orderCommodityDao;

    @Override
    public Float calculateAmount(List<Integer> cartIds) {
        if (cartIds.isEmpty())return null;
        AtomicReference<Float> amount = new AtomicReference<>(0f);
        cartIds.forEach(cartId-> {
            Cart cart = cartDao.get(Cart.class, cartId);
            if (cart != null) {
                amount.updateAndGet(v -> v + cart.getNumber() * cart.getCommodity().getDiscountPrice());
            }
        });
        return amount.get();
    }

    @Override
    public PageModel<OrderModel> listOrders(Integer userId, Integer status, Integer page) {
        String SQL = "from Order where userId=:id and status=:status";
        Map<String, Object> map = new HashMap<>();
        map.put("id", userId);
        map.put("status", status);
        List<Order> orders = orderDao.find(SQL, map, page, 5);
        if (orders.isEmpty()) return null;
        List<OrderModel> orderModels = new ArrayList<>();
        orders.forEach(order -> {
            OrderModel orderModel = new OrderModel();
            BeanUtils.copyProperties(order, orderModel);
            String HQL = "from OrderCommodity where orderId=:orderId";
            Map<String, Object> map1 = new HashMap<>();
            map1.put("orderId", order.getId());
            List<OrderCommodity> orderCommodities = orderCommodityDao.find(HQL, map1);
            List<OrderCommodityModel> orderCommodityModels = new ArrayList<>();
            for (OrderCommodity o : orderCommodities) {
                OrderCommodityModel orderCommodityModel = new OrderCommodityModel();
                BeanUtils.copyProperties(o, orderCommodityModel);
                orderCommodityModels.add(orderCommodityModel);
            }
            orderModel.setOrderCommodityModels(orderCommodityModels);
            orderModels.add(orderModel);
        });
        PageModel<OrderModel> pageModel = new PageModel<>();
        pageModel.setDataList(orderModels);
        return pageModel;
    }

    @Override
    public Boolean deleteOrder(Integer id) {
        Order order = orderDao.get(Order.class, id);
        if (order == null) return false;
        orderDao.delete(order);
        return true;
    }

    @Override
    public Boolean updateOrder(Integer id, Integer status) {
        Order order = orderDao.get(Order.class, id);
        if (order == null) {
            return false;
        }
        order.setStatus(status);
        order.setPayTime(new Timestamp(System.currentTimeMillis()));
        orderDao.update(order);
        return true;
    }

    @Override
    public SimpleOrderModel createOrderFromCart(OrderFromCartModel orderFromCartModel, int userId) {
        Integer addressId = orderFromCartModel.getAddressId();
        if (addressId==null) return null;
        Order order = new Order();
        order.setUserId(userId);
        order.setStatus(0); // 未付款
        Address address = addressDao.get(Address.class, addressId);
        order.setAddress(address.toString());
        order.setOrderAmount(calculateAmount(orderFromCartModel.getCartIds()));
        order.setOrderSN(UUID.randomUUID().toString().replace("-", ""));
        orderDao.save(order);
        SimpleOrderModel simpleOrderModel = new SimpleOrderModel();
        BeanUtils.copyProperties(order, simpleOrderModel);
        return simpleOrderModel;
    }

}
