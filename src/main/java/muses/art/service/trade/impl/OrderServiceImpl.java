package muses.art.service.trade.impl;

import muses.art.dao.trade.OrderDao;
import muses.art.service.trade.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
}
