package muses.art.service.trade;

import muses.art.model.trade.OrderModel;

import java.util.ArrayList;
import java.util.List;


public interface OrderService {

    /**
     * 列出某用户的所有订单
     * @param userId 用户id
     * @return
     */
    List<OrderModel> listOrders(Integer userId);

    /**
     * 根据订单id删除订单
     * @param id 订单id
     * @return
     */
    Boolean deleteOrder(Integer id);

    /**
     * 更细订单状态
     * @param id 订单id
     * @param payStatus 支付状态
     * @return
     */
    Boolean updateOrder(Integer id, String payStatus);

    /**
     * 从购物车创建订单
     * @param cartIds 购物车id
     * @param addressId 地址id
     * @return
     */
    Boolean createOrderFromCart(ArrayList<Integer> cartIds, Integer addressId);


    /**
     * 得到订单详细信息
     * @param id 订单id
     * @return OrderModel
     */
    OrderModel findOrderById(int id);


    /**
     * 分页列出某用户订单信息
     * @param userId 用户id
     * @param start 页数
     * @param max 每页数量
     * @return 分页模型
     */
    List<OrderModel> listOrderByPage(int userId, int start, int max);
}