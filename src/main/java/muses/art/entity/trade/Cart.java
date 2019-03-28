package muses.art.entity.trade;


import lombok.extern.apachecommons.CommonsLog;
import muses.art.entity.commodity.Commodity;
import muses.art.entity.user.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cart")
public class Cart { // 购物车
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "number")
    private Integer number; // 数量

    @Column(name = "add_time")
    private Date addTime; // 添加时间

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user; // 用户对象 多对一

    @Column(name = "user_id")
    private Integer userId;  // 用户id

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "commodity_id", insertable = false, updatable = false)
    private Commodity commodity; // 商品对象 多对一

    @Column(name = "commodity_id")
    private Integer commodityId; // 商品id

    @Column(name = "detail")
    private String detail; // 商品详细信息

    @Column(name = "image")
    private String image; // 冗余图像地址

    @Column(name = "parameter")
    private String parameter;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
