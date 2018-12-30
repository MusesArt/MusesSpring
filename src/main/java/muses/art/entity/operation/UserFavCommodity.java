package muses.art.entity.operation;


import muses.art.entity.commodity.Commodity;
import muses.art.entity.user.User;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "user_fav_commodity", uniqueConstraints = {@UniqueConstraint(columnNames={"user_id", "commodity_id"})})
public class UserFavCommodity { // 用户收藏商品 4个属性
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "add_time")
    private Date addTime; // 添加时间

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user; // 用户对象 多对一

    @Column(name = "user_id")
    private Integer userId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "commodity_id", insertable = false, updatable = false)
    private Commodity commodity; // 商品对象 多对一

    @Column(name = "commodity_id")
    private Integer commodityId;

    @Column(name = "price")
    private Float price;

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

}
