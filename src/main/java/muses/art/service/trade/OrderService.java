package muses.art.service.trade;

import muses.art.model.base.PageModel;
import muses.art.model.trade.OrderFromCartModel;
import muses.art.model.trade.OrderFromCommodityModel;
import muses.art.model.trade.OrderModel;
import muses.art.model.trade.SimpleOrderModel;
import java.util.List;


public interface OrderService {

    Float calculateAmount(List<Integer> cartIds);
    /**
     * @param userId 用户id
     * @return
     */
    PageModel<OrderModel> listOrders(Integer userId, Integer status, Integer page);

    /**
     * @param id 订单id
     * @return
     */
    Boolean deleteOrder(Integer id);

    /**
     * @param id        订单id
     * @param status 支付状态
     * @return
     */
    Boolean updateOrder(Integer id, Integer status);

    /**
     *
     * @param orderFromCartModel
     * @return
     */
    SimpleOrderModel createOrderFromCart(OrderFromCartModel orderFromCartModel, int userId);

    SimpleOrderModel createOrderFromCommodity(OrderFromCommodityModel model);

}