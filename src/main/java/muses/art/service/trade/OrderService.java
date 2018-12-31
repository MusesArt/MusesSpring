package muses.art.service.trade;

import muses.art.model.trade.OrderModel;

import java.util.List;

public interface OrderService {
    //增加待支付订单
    boolean addOrderOfNoPay(OrderModel orderModel,int user_id,int address_id);
    //增加已支付订单
    boolean addOrderOfPay(OrderModel orderModel,int user_id,int address_id);
    //更改待支付订单为已支付
    boolean updateStatus(int id);
    //用户取消订单
    boolean cancelOfUser(int id);
    //修改订单
    boolean update(OrderModel orderModel);
    //得到订单详细信息
    OrderModel getOrderById(int id);
    //分页列出某用户订单信息
    List<OrderModel> listOrder(int user_id,int start,int max);
}
