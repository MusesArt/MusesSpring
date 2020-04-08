package muses.art.service.trade.impl;

import muses.art.dao.commodity.CommodityDao;
import muses.art.dao.trade.CartDao;
import muses.art.dao.trade.OrderCommodityDao;
import muses.art.dao.trade.ParameterDao;
import muses.art.entity.commodity.Commodity;
import muses.art.entity.commodity.Parameter;
import muses.art.entity.trade.Cart;
import muses.art.entity.trade.OrderCommodity;
import muses.art.model.trade.OrderFromCommodityModel;
import muses.art.service.trade.OrderCommodityService;
import org.springframework.beans.BeanUtils;
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

    @Autowired
    private CommodityDao commodityDao;

    @Autowired
    private ParameterDao parameterDao;

    @Override
    public Boolean add(List<Integer> cartIds, Integer orderId) {
        if (cartIds == null) return false;
        cartIds.forEach(cardId-> {
            OrderCommodity orderCommodity = new OrderCommodity();
            Cart cart = cartDao.get(Cart.class, cardId);
            Commodity commodity = cart.getCommodity();
            BeanUtils.copyProperties(cart, orderCommodity);
            orderCommodity.setPrice(commodity.getDiscountPrice());
            orderCommodity.setTitle(commodity.getName());
            orderCommodity.setOrderId(orderId);
            orderCommodity.setAddTime(new Timestamp(System.currentTimeMillis()));
            orderCommodityDao.save(orderCommodity);
        });
        return true;
    }

    @Override
    public Boolean delete(Integer orderId) {
        String SQL = "from OrderCommodity where orderId=:oid";
        Map<String, Object> map = new HashMap<>();
        map.put("oid", orderId);
        List<OrderCommodity> orderCommodities = orderCommodityDao.find(SQL, map);
        if (orderCommodities.isEmpty()) return false;
        orderCommodities.forEach(orderCommodity -> orderCommodityDao.delete(orderCommodity));
        return true;
    }

    @Override
    public Boolean copy(OrderFromCommodityModel orderFromCommodityModel, Integer orderId) {
        OrderCommodity orderCommodity = new OrderCommodity();
        BeanUtils.copyProperties(orderFromCommodityModel, orderCommodity);
        Commodity commodity = commodityDao.get(Commodity.class, orderFromCommodityModel.getCommodityId());
        orderCommodity.setTitle(commodity.getName());
        orderCommodity.setOrderId(orderId);
        orderCommodity.setAddTime(new Timestamp(System.currentTimeMillis()));
        orderCommodity.setPrice(commodity.getDiscountPrice()*orderFromCommodityModel.getNumber());
        orderCommodity.setImage(getImage(commodity, orderFromCommodityModel.getParameter()));
        orderCommodityDao.save(orderCommodity);
        return true;
    }


    private String getImage(Commodity commodity, String param) {
        String image = null;
        if (param != null) {
            String[] params = param.split(",");
            for (int i = 0; i < params.length; i++) { // 遍历所有属性
                Parameter parameter = parameterDao.get(Parameter.class, Integer.valueOf(params[i]));
                if (parameter != null && parameter.getImage() != null) { // 若属性有图，则将该图作为购物车图像
                    image = parameter.getImage(); // 设置图像
                    break;
                }
            }
        }
        if (image == null) { // 没有从属性中找到图像
            image = commodity.getCoverImage(); // 使用商品封面图像作为购物车图像
        }
        return image;
    }
}
