package muses.art.entity.trade;


import muses.art.entity.commodity.Commodity;
import muses.art.entity.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cart")
public class Cart { // 购物车
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "number")
    private int number; // 数量

    @Column(name = "add_num")
    private Timestamp addTime; // 添加时间

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user; // 用户对象 多对一

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "commodity_id", referencedColumnName = "id")
    private Commodity commodity; // 商品对象 多对一

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

}
