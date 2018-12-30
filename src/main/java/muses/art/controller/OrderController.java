package muses.art.controller;

import muses.art.model.base.StatusModel;
import muses.art.model.trade.OrderModel;
import muses.art.service.trade.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/list/{user_id}", method = RequestMethod.GET)
    public @ResponseBody
    StatusModel<List<OrderModel>> listOrder(@PathVariable int user_id) {
        StatusModel<List<OrderModel>> statusModel = new StatusModel<>();
        List<OrderModel> orderModels = orderService.listOrders(user_id);
        if (orderModels.isEmpty()) {
            statusModel.onError(-1, "订单数据获取异常");
        } else {
            statusModel.onSuccess(0, "success", orderModels);
        }
        return statusModel;
    }

    @RequestMapping(value = "/{order_id}", method = RequestMethod.PUT)
    public @ResponseBody
    StatusModel updateOrder(@RequestBody OrderModel orderModel, @PathVariable int order_id) {
        StatusModel statusModel = new StatusModel();
        Boolean status = orderService.updateOrder(order_id, orderModel.getPayStatus(), new Date());
        if (!status) {
            statusModel.onError(-1, "订单数据更新失败");
        } else {
            statusModel.onSuccess(0, "订单数据获取成功");
        }
        return statusModel;
    }

    @RequestMapping(value = "/{order_id}", method = RequestMethod.DELETE)
    public @ResponseBody
    StatusModel deleteFromOrder(@PathVariable int order_id) {
        StatusModel statusModel = new StatusModel();
        Boolean status = orderService.deleteOrder(order_id);
        if (!status) {
            statusModel.onError(-1, "无此订单");
        } else {
            statusModel.onSuccess(0, "删除成功");
        }
        return statusModel;
    }

    @RequestMapping(value = "/{user_id}", method = RequestMethod.POST)
    public @ResponseBody
    StatusModel addOrder(@RequestBody OrderModel orderModel, @PathVariable int user_id) {
        StatusModel statusModel = new StatusModel();
        Boolean status = orderService.createOrder(orderModel);
        if (!status) {
            statusModel.onError(-1, "订单创建失败");
        } else {
            statusModel.onSuccess(0, "订单创建成功");
        }
        return statusModel;
    }
}
