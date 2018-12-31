package muses.art.service.trade.impl;

import muses.art.dao.trade.OrderDao;
import muses.art.entity.trade.Order;
import muses.art.model.trade.OrderModel;
import muses.art.service.trade.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;


    @Override
    public List<OrderModel> listOrders(Integer userId) {
        String SQL = "from Order where userId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", userId);
        List<Order> orders = orderDao.find(SQL, map);
        if (orders.isEmpty()) return null;
        List<OrderModel> orderModels = new ArrayList<>();
        return orderDao.getModelMapper().map(orders, orderModels.getClass());
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
        order.setPayTime(new Timestamp(System.currentTimeMillis()));
        orderDao.update(order);
        return true;
    }

    @Override
    public Boolean createOrder(OrderModel orderModel) {
        Order order = orderDao.getModelMapper().map(orderModel, Order.class);
        if (orderDao.get(Order.class, order.getId()) != null) return false;
        orderDao.save(order);
        return true;
    }
    
        @Override
    public boolean addOrderOfNoPay(OrderModel orderModel, int userId, int addressId) {
        Order  order = new Order();
        BeanUtils.copyProperties(orderModel,order);
        order.setUserId(userId);
        order.setPayStatus("待支付");
        order.setAddressId(addressId);
        orderDao.save(order);
        return true;
    }

    @Override
    public boolean addOrderOfPay(OrderModel orderModel, int userId, int addressId) {
        Order  order = new Order();
        BeanUtils.copyProperties(orderModel,order);
        order.setUserId(userId);
        order.setPayStatus("已支付");
        order.setAddressId(addressId);
        orderDao.save(order);
        return true;
    }

    @Override
    public boolean updateOrderStatus(int id) {
        Order order = orderDao.get(Order.class,id);
        order.setPayStatus("已支付");
        orderDao.update(order);
        return true;
    }

    @Override
    public boolean cancelOrder(int id) {
        Order order = orderDao.get(Order.class,id);
        order.setPayStatus("请求取消");
        orderDao.update(order);
        return true;
    }

    @Override
    public boolean updateOrder(OrderModel orderModel) {
        Order order = new Order();
        BeanUtils.copyProperties(orderModel,order);
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
