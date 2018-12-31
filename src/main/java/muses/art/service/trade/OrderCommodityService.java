package muses.art.service.trade;

public interface OrderCommodityService {
    /**
     * @param orderId
     * @param commodityId
     * @return
     */
    Boolean add(Integer orderId, Integer commodityId);

    /**
     * @param id 订购的商品id
     * @return
     */
    Boolean delete(Integer id);
}
