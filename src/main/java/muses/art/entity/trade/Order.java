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

    @Column(name = "status")
    private Integer status; // 订单状态

    @Column(name = "post_script")
    private String postScript; // 订单留言

    @Column(name = "order_amount")
    private Float orderAmount; // 订单金额

    @Column(name = "pay_time")
    private Date payTime; // 支付时间

    @Column(name = "add_time")
    private Date addTime; // 添加时间

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user; // 订单用户对象 多对一

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "address")
    private String address; // 订单地址-冗余数据

    // 刪除订单时，删除订单内的所有商品快照
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order", cascade = CascadeType.REMOVE)
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

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
