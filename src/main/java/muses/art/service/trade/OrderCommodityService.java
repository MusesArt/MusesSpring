package muses.art.service.trade;

import muses.art.model.trade.OrderFromCommodityModel;

import java.util.List;

public interface OrderCommodityService {
    /**
     *
     * @param cartIds 购物车id
     * @param orderId 订单id
     * @return
     */
    Boolean add(List<Integer> cartIds, Integer orderId);

    /**
     * @param orderId 订单id
     * @return
     */
    Boolean delete(Integer orderId);

    Boolean copy(OrderFromCommodityModel orderFromCommodityModel, Integer orderId);
}
