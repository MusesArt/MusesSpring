package muses.art.service.trade;

import muses.art.entity.trade.OrderCommodity;

public interface OrderCommodityService {
    /**
     *
     * @param orderCommodity
     * @return
     */
    Boolean add(OrderCommodity orderCommodity);

    /**
     * @param id 订购的商品id
     * @return
     */
    Boolean delete(Integer id);
}
