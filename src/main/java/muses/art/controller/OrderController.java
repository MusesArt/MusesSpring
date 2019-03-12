package muses.art.controller;

import muses.art.model.base.PageModel;
import muses.art.model.base.StatusModel;
import muses.art.model.trade.OrderFromCartModel;
import muses.art.model.trade.OrderModel;
import muses.art.model.trade.SimpleOrderModel;
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

    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/list/{user_id}/{status}/{page}", method = RequestMethod.GET)
    public PageModel<OrderModel> listOrder(@PathVariable int user_id, @PathVariable int status, @PathVariable int page) {
        PageModel<OrderModel> pageModel = orderService.listOrders(user_id, status, page);
        return pageModel;
    }

    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{orderId}", method = RequestMethod.PUT)
    public StatusModel updateOrder(@RequestBody OrderModel orderModel, @PathVariable int orderId) {
        StatusModel statusModel;
        Boolean status = orderService.updateOrder(orderId, orderModel.getStatus());
        if (!status) {
            statusModel = new StatusModel<>("订单数据更新失败");
        } else {
            statusModel = new StatusModel<>("订单数据更新成功", StatusModel.OK);
        }
        return statusModel;
    }

    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{orderId}", method = RequestMethod.DELETE)
    public StatusModel deleteOrder(@PathVariable int orderId) {
        StatusModel statusModel;
        Boolean status = orderService.deleteOrder(orderId);
        orderCommodityService.delete(orderId);
        if (!status) {
            statusModel = new StatusModel<>("无此订单");
        } else {
            statusModel = new StatusModel<>("删除成功", StatusModel.OK);
        }
        return statusModel;
    }

    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public StatusModel addOrder(@RequestBody OrderFromCartModel orderFromCartModel) {
        // 根据cardIds将商品从购物车添加至订单中
        List<Integer> cartIds = orderFromCartModel.getCartIds();
        for (int i = 0 ;i < cartIds.size(); i++) {
            if (cartService.getCart(cartIds.get(i)) == null) {
                return new StatusModel<>("请勿重复提交订单", StatusModel.ERROR);
            }
        }
        SimpleOrderModel model = orderService.createOrderFromCart(orderFromCartModel, orderFromCartModel.getUserId());
        if (model == null) {
            return new StatusModel<>("订单创建失败");
        } else { // 若订单创建成功
            orderCommodityService.add(cartIds, model.getId()); // 复制商品快照
            cartIds.forEach(cartId -> {
                cartService.deleteFromCart(cartId); // 从购物车中移除商品
            });
            return new StatusModel<>("订单创建成功", StatusModel.OK, model);
        }
    }
}
