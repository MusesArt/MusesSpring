package muses.art.controller;

import muses.art.model.base.StatusModel;
import muses.art.model.trade.OrderFromCartModel;
import muses.art.model.trade.OrderModel;
import muses.art.service.trade.CartService;
import muses.art.service.trade.OrderCommodityService;
import muses.art.service.trade.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/order")
@CrossOrigin(origins = "*", maxAge = 3600)
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private CartService cartService;
    @Autowired
    private OrderCommodityService orderCommodityService;

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/list/{user_id}", method = RequestMethod.GET)
    public @ResponseBody
    StatusModel<List<OrderModel>> listOrder(@PathVariable int user_id) {
        StatusModel<List<OrderModel>> statusModel;
        List<OrderModel> orderModels = orderService.listOrders(user_id);
        if (orderModels == null) {
            statusModel = new StatusModel<>("没有订单");
        } else {
            statusModel = new StatusModel<>(orderModels);
        }
        return statusModel;
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{order_id}", method = RequestMethod.PUT)
    public @ResponseBody
    StatusModel updateOrder(@RequestBody OrderModel orderModel, @PathVariable int order_id) {
        StatusModel statusModel;
        Boolean status = orderService.updateOrder(order_id, orderModel.getPayStatus());
        if (!status) {
            statusModel = new StatusModel<>("订单数据更新失败");
        } else {
            statusModel = new StatusModel<>("订单数据更新成功", "0");
        }
        return statusModel;
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{order_id}", method = RequestMethod.DELETE)
    public @ResponseBody
    StatusModel deleteOrder(@PathVariable int order_id) {
        StatusModel statusModel;
        Boolean status = orderService.deleteOrder(order_id);
        orderCommodityService.delete(order_id);
        if (!status) {
            statusModel = new StatusModel<>("无此订单");
        } else {
            statusModel = new StatusModel<>("删除成功", "0");
        }
        return statusModel;
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public @ResponseBody
    StatusModel addOrder(@RequestBody OrderFromCartModel orderFromCartModel) {
        StatusModel statusModel;
        // 根据cardIds将商品从购物车添加至订单中
        Integer orderId = orderService.createOrderFromCart(orderFromCartModel, orderFromCartModel.getUserId());
        if (orderId == null) {
            statusModel = new StatusModel<>("订单创建失败");
        } else { // 若订单创建成功
            List<Integer> cartIds = orderFromCartModel.getCartIds();
            orderCommodityService.add(cartIds, orderId); // 复制商品快照
            cartIds.forEach(cartId -> {
                cartService.deleteFromCart(cartId); // 从购物车中移除商品
            });
            statusModel = new StatusModel<>("订单创建成功", "0");
        }
        return statusModel;
    }
}
