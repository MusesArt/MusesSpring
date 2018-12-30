package muses.art.model.trade;

import muses.art.entity.trade.Address;
import muses.art.entity.trade.OrderCommodity;
import muses.art.entity.user.User;

import java.util.Date;
import java.util.List;

public class OrderModel {
    private Integer id;
    private String orderSN;
    private String tradeNo;
    private String payStatus;
    private String postScript;
    private Float orderAmount;
    private Date payTime;
    private User user;
    private Integer userId;
    private Address address;
    private Integer addressId;
    private List<OrderCommodity> orderCommodities;

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

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public List<OrderCommodity> getOrderCommodities() {
        return orderCommodities;
    }

    public void setOrderCommodities(List<OrderCommodity> orderCommodities) {
        this.orderCommodities = orderCommodities;
    }
}
