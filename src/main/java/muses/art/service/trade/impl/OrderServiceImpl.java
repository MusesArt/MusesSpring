package muses.art.service.trade.impl;

import muses.art.dao.trade.CartDao;
import muses.art.dao.trade.OrderDao;
import muses.art.entity.trade.Cart;
import muses.art.entity.trade.Order;
import muses.art.model.trade.OrderFromCartModel;
import muses.art.model.trade.OrderModel;
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

    @Override
    public Float calculateAmount(List<Integer> cartIds) {
        if (cartIds.isEmpty())return null;
        AtomicReference<Float> amount = new AtomicReference<>(0f);
        cartIds.forEach(cartId-> {
            Cart cart = cartDao.get(Cart.class, cartId);
            amount.updateAndGet(v -> v + cart.getNumber() * cart.getCommodity().getDiscountPrice());
        });
        return null;
    }

    @Override
    public List<OrderModel> listOrders(Integer userId) {
        String SQL = "from Order where userId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", userId);
        List<Order> orders = orderDao.find(SQL, map);
        if (orders.isEmpty()) return null;
        List<OrderModel> orderModels = new ArrayList<>();
        orders.forEach(order -> orderModels.add(orderDao.getModelMapper().map(order, OrderModel.class)));
        return orderModels;
    }

    @Override
    public Boolean deleteOrder(Integer id) {
        Order order = orderDao.get(Order.class, id);
        if (order == null) return false;
        orderDao.delete(order);
        return true;
    }

    @Override
    public Boolean updateOrder(Integer id, String payStatus) {
        Order order = orderDao.get(Order.class, id);
        if (order == null) return false;
        order.setPayStatus(payStatus);
        if (payStatus == "payed") order.setPayTime(new Timestamp(System.currentTimeMillis()));
        orderDao.update(order);
        return true;
    }

    @Override
    public Integer createOrderFromCart(OrderFromCartModel orderFromCartModel, int userId) {
        Integer addressId = orderFromCartModel.getAddressId();
        if (addressId==null) return null;
        Order order = new Order();
        order.setUserId(userId);
        order.setPayStatus("-1");
        order.setAddressId(addressId);
        order.setOrderAmount(calculateAmount(orderFromCartModel.getCartIds()));
        order.setOrderSN(UUID.randomUUID().toString().replace("-", ""));
        orderDao.save(order);
        return order.getId();
    }

    @Override
    public Boolean addOrderOfNoPay(OrderModel orderModel, int userId, int addressId) {
        Order order = new Order();
        BeanUtils.copyProperties(orderModel, order);
        order.setUserId(userId);
        order.setPayStatus("待支付");
        order.setAddressId(addressId);
        orderDao.save(order);
        return true;
    }

    @Override
    public Boolean addOrderOfPay(OrderModel orderModel, int userId, int addressId) {
        Order order = new Order();
        BeanUtils.copyProperties(orderModel, order);
        order.setUserId(userId);
        order.setPayStatus("已支付");
        order.setAddressId(addressId);
        orderDao.save(order);
        return true;
    }

    @Override
    public Boolean updateOrderStatus(int id) {
        Order order = orderDao.get(Order.class, id);
        order.setPayStatus("已支付");
        orderDao.update(order);
        return true;
    }

    @Override
    public Boolean cancelOrder(int id) {
        Order order = orderDao.get(Order.class, id);
        order.setPayStatus("请求取消");
        orderDao.update(order);
        return true;
    }

    @Override
    public Boolean updateOrder(OrderModel orderModel) {
        Order order = new Order();
        BeanUtils.copyProperties(orderModel, order);
        orderDao.update(order);
        return true;
    }

    @Override
    public OrderModel getOrderById(int id) {
        Order order = orderDao.get(Order.class,id);
        OrderModel orderModel = new OrderModel();
        BeanUtils.copyProperties(order,orderModel);
        return orderModel;
    }

    @Override
    public List<OrderModel> listOrder(int userId, int start, int max) {
        String hql = "from Order o where o.user.id=:userId";
        Map<String,Object> map = new HashMap<>();
        map.put("userId", userId);
        List<Order> orders = orderDao.find(hql,map,start,max);
        List<OrderModel> orderModels = new ArrayList<OrderModel>();
        for(Order order : orders) {
            OrderModel orderModel = new OrderModel();
            BeanUtils.copyProperties(order,orderModel);
            orderModels.add(orderModel);
        }
        return orderModels;
    }

}
