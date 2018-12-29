package muses.art.entity.trade;

import muses.art.entity.user.User;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name = "order")
public class Order { // 订单
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "order_sn")
    private String orderSN; // 订单号

    @Column(name = "trade_no")
    private String tradeNo; // 交易号

    @Column(name = "pay_status")
    private String payStatus; // 订单状态

    @Column(name = "post_script")
    private String postScript; // 订单留言

    @Column(name = "order_amount")
    private Float orderAmount; // 订单金额

    @Column(name = "pay_time")
    private Timestamp payTime; // 支付时间

    @Column(name = "user_id")
    private int userId; // 用户id(外键)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user; // 订单用户对象 多对一

    @Column(name = "address_id")
    private int addressId; // 订单地址信息id(外键)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address; // 订单地址对象 多对一

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderSN='" + orderSN + '\'' +
                ", tradeNo='" + tradeNo + '\'' +
                ", payStatus='" + payStatus + '\'' +
                ", postScript='" + postScript + '\'' +
                ", orderAmount=" + orderAmount +
                ", payTime=" + payTime +
                ", userId=" + userId +
                ", user=" + user +
                ", addressId=" + addressId +
                ", address=" + address +
                '}';
    }
}
