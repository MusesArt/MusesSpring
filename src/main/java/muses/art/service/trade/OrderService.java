package muses.art.service.trade;

import muses.art.model.trade.OrderModel;

import java.util.Date;
import java.util.List;


public interface OrderService {

    /**
     * @param userId 用户id
     * @return
     */
    List<OrderModel> listOrders(Integer userId);

    /**
     * @param id 订单id
     * @return
     */
    Boolean deleteOrder(Integer id);

    /**
     * @param id        订单id
     * @param payStatus 支付状态
     * @param payTime   支付时间
     * @return
     */
    Boolean updateOrder(Integer id, String payStatus, Date payTime);

    /**
     * @param orderModel
     * @return
     */
    Boolean createOrder(OrderModel orderModel);

}
