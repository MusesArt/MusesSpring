package muses.art.entity.operation;


import muses.art.entity.commodity.Commodity;
import muses.art.entity.user.User;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name = "user_fav_commodity")
public class UserFavCommodity { // 用户收藏商品
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "user_id")
    private int userId; // 用户id

    @Column(name = "commodity_id")
    private int commodityId; // 商品id

    @Column(name = "add_time")
    private Timestamp addTime; // 添加时间

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user; // 用户对象 多对一

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "commodity_id")
    private Commodity commodity; // 商品对象 多对一

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    @Override
    public String toString() {
        return "UserFavCommodity{" +
                "id=" + id +
                ", userId=" + userId +
                ", commodityId=" + commodityId +
                ", addTime=" + addTime +
                ", user=" + user +
                ", commodity=" + commodity +
                '}';
    }
}
