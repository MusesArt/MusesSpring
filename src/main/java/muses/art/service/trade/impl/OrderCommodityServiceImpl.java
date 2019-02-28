package muses.art.service.trade.impl;

import muses.art.dao.trade.CartDao;
import muses.art.dao.trade.OrderCommodityDao;
import muses.art.entity.commodity.Commodity;
import muses.art.entity.trade.Cart;
import muses.art.entity.trade.OrderCommodity;
import muses.art.service.trade.OrderCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class OrderCommodityServiceImpl implements OrderCommodityService {

    @Autowired
    private OrderCommodityDao orderCommodityDao;
    @Autowired
    private CartDao cartDao;

    @Override
    public Boolean add(List<Integer> cartIds, Integer orderId) {
        if (cartIds == null) return false;
        cartIds.forEach(cardId-> {
            OrderCommodity orderCommodity = new OrderCommodity();
            Cart cart = cartDao.get(Cart.class, cardId);
            Commodity commodity = cart.getCommodity();
            orderCommodity.setBrief(commodity.getBrief());
            orderCommodity.setCommodityId(commodity.getId());
            orderCommodity.setPrice(commodity.getDiscountPrice());
            orderCommodity.setNumber(cart.getNumber());
            orderCommodity.setOrderId(orderId);
            orderCommodity.setAddTime(new Timestamp(System.currentTimeMillis()));
            orderCommodityDao.save(orderCommodity);
        });
        return true;
    }

    @Override
    public Boolean delete(Integer orderId) {
        String SQL = "from Cart where orderId=:oid";
        Map<String, Object> map = new HashMap<>();
        map.put("oid", orderId);
        List<OrderCommodity> orderCommodities = orderCommodityDao.find(SQL, map);
        if (orderCommodities.isEmpty()) return false;
        orderCommodities.forEach(orderCommodity -> orderCommodityDao.delete(orderCommodity));
        return true;
    }
}
