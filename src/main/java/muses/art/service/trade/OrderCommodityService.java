package muses.art.service.trade;

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
}
