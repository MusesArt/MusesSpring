package muses.art.operation.entity;

import muses.art.commodity.model.Commodity;
import muses.art.commodity.model.Image;
import muses.art.trade.entity.Order;
import muses.art.user.model.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "comment")
    private String comment; // 评论内容

    @Column(name = "user_id")
    private int userId; // 用户id(外键)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user; // 用户对象 多对一

    @Column(name = "order_id")
    private int orderId; // 订单id(外键)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order; // 订单对象 多对一

    @Column(name = "commodity_id")
    private int commodityId; // 商品id(外键)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "commodity_id")
    private Commodity commodity; // 商品对象 多对一

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "image")
    private List<Image> images; // 图像列表 一对多

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", userId=" + userId +
                ", user=" + user +
                ", orderId=" + orderId +
                ", order=" + order +
                ", commodityId=" + commodityId +
                ", commodity=" + commodity +
                ", images=" + images +
                '}';
    }
}
