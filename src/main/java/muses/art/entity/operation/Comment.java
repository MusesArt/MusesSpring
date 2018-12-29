package muses.art.entity.operation;

import muses.art.entity.trade.Order;
import muses.art.entity.commodity.Commodity;
import muses.art.entity.commodity.Image;
import muses.art.entity.user.User;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "comment")
    private String comment; // 评论内容

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user; // 用户对象 多对一

    @Column(name = "user_id")
    private int userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private Order order; // 订单对象 多对一

    @Column(name = "order_id")
    private int orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "commodity_id", insertable = false, updatable = false)
    private Commodity commodity; // 商品对象 多对一

    @Column(name = "commodity_id")
    private int commodityId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "comment")
    private List<Image> images; // 图像列表 一对多

    @Column(name = "add_time")
    private Date addTime;

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

}
