package muses.art.entity.trade;

import muses.art.entity.user.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "torder")
public class Order { // 订单
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

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
    private Date payTime; // 支付时间

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user; // 订单用户对象 多对一

    @Column(name = "user_id")
    private Integer userId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", insertable = false, updatable = false)
    private Address address; // 订单地址对象 多对一

    @Column(name = "address_id")
    private Integer addressId;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "order")
    private List<OrderCommodity> orderCommodities;

    public List<OrderCommodity> getOrderCommodities() {
        return orderCommodities;
    }

    public void setOrderCommodities(List<OrderCommodity> orderCommodities) {
        this.orderCommodities = orderCommodities;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
