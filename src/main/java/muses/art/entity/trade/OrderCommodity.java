package muses.art.entity.trade;

import muses.art.model.commodity.Commodity;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name = "order_commodity")
public class OrderCommodity { // 订购的商品
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "order_id")
    private int orderId; // 订单id(外键)

    @Column(name = "commodity_id")
    private int commodityId; // 商品id(外键)

    @Column(name = "add_time")
    private Timestamp addTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order; // 订单对象 多对一

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "commodity_id")
    private Commodity commodity; // 商品对象 多对一

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
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

    @Override
    public String toString() {
        return "OrderCommodity{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", commodityId=" + commodityId +
                ", addTime=" + addTime +
                ", order=" + order +
                ", commodity=" + commodity +
                '}';
    }
}
