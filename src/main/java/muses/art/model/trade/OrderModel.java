package muses.art.model.trade;

import muses.art.entity.trade.Address;

import java.util.Date;
import java.util.List;

public class OrderModel {
    private Integer id;

    private String orderSN; // 订单号

    private String tradeNo; // 交易号

    private Integer status; // 订单状态

    private String postScript; // 订单留言

    private Float orderAmount; // 订单金额

    private Date payTime; // 支付时间

    private Integer userId;

    private String address;

    private List<OrderCommodityModel> orderCommodityModels;

    public List<OrderCommodityModel> getOrderCommodityModels() {
        return orderCommodityModels;
    }

    public void setOrderCommodityModels(List<OrderCommodityModel> orderCommodityModels) {
        this.orderCommodityModels = orderCommodityModels;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderSN() {
        return orderSN;
    }

    public void setOrderSN(String orderSN) {
        this.orderSN = orderSN;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPostScript() {
        return postScript;
    }

    public void setPostScript(String postScript) {
        this.postScript = postScript;
    }

    public Float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
