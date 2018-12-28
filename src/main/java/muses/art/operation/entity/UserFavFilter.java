package muses.art.operation.entity;


import muses.art.filter.entity.Filter;
import muses.art.user.model.User;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name = "user_fav_filter")
public class UserFavFilter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "user_id")
    private int userId; // 用户id(外键)

    @Column(name = "filter_id")
    private int filterId; // 滤镜id(外键)

    @Column(name = "add_time")
    private Timestamp addTime; // 添加时间

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user; // 用户对象 多对一

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "filter_id")
    private Filter filter; // 滤镜对象 多对一

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

    public int getFilterId() {
        return filterId;
    }

    public void setFilterId(int filterId) {
        this.filterId = filterId;
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

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String toString() {
        return "UserFavFilter{" +
                "id=" + id +
                ", userId=" + userId +
                ", filterId=" + filterId +
                ", addTime=" + addTime +
                ", user=" + user +
                ", filter=" + filter +
                '}';
    }
}
