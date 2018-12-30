package muses.art.entity.trade;

import muses.art.entity.commodity.Commodity;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "order_commodity")
public class OrderCommodity { // 订购的商品
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "add_time")
    private Date addTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private Order order; // 订单对象 多对一

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "commodity_id", insertable = false, updatable = false)
    private Commodity commodity; // 商品对象 多对一

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "commodity_id")
    private Integer commodityId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

}
