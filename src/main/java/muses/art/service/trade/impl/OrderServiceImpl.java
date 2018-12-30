package muses.art.service.trade.impl;

import muses.art.dao.trade.OrderDao;
import muses.art.entity.trade.Order;
import muses.art.model.trade.OrderModel;
import muses.art.service.trade.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

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
    public Boolean updateOrder(Integer id, String payStatus, Date payTime) {
        Order order = orderDao.get(Order.class, id);
        if (order == null) return false;
        order.setPayStatus(payStatus);
        order.setPayTime(payTime);
        orderDao.update(order);
        return true;
    }

    @Override
    public Boolean createOrder(OrderModel orderModel) {
        Order order = orderDao.getModelMapper().map(orderModel, Order.class);
        orderDao.save(order);
        return true;
    }
}
