package muses.art.dao.trade.impl;

import muses.art.dao.common.impl.BaseDaoImpl;
import muses.art.dao.trade.OrderDao;
import muses.art.entity.trade.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl extends BaseDaoImpl<Order> implements OrderDao {
}
