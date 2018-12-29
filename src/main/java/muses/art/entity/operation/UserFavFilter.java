package muses.art.entity.operation;


import muses.art.entity.filter.Filter;
import muses.art.entity.user.User;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name = "user_fav_filter")
public class UserFavFilter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "add_time")
    private Timestamp addTime; // 添加时间

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user; // 用户对象 多对一

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "filter_id", referencedColumnName = "id")
    private Filter filter; // 滤镜对象 多对一

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

}
