package muses.art.service.trade;

import muses.art.model.trade.OrderFromCartModel;
import muses.art.model.trade.OrderModel;

import java.util.List;


public interface OrderService {

    Float calculateAmount(List<Integer> cartIds);
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
     * @return
     */
    Boolean updateOrder(Integer id, String payStatus);

    /**
     *
     * @param orderFromCartModel
     * @return
     */
    Integer createOrderFromCart(OrderFromCartModel orderFromCartModel, int userId);

    /**
     * 修改订单
     *
     * @param orderModel 订单model
     * @return Boolean
     */
    Boolean updateOrder(OrderModel orderModel);

    /**
     * 分页列出某用户订单信息
     * @param userId 用户id
     * @param start 页数
     * @param max 每页数量
     * @return 分页模型
     */
    List<OrderModel> listOrder(int userId, int start, int max);
}