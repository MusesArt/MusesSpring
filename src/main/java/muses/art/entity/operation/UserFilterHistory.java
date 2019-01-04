package muses.art.entity.operation;

import muses.art.entity.filter.Filter;
import muses.art.entity.user.User;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "user_filter_history")
public class UserFilterHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "output_size")
    private Integer outputSize; // 输出图像大小

    @Column(name = "operate_time")
    private Date operateTime; // 使用时间

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "filter_id", insertable = false, updatable = false)
    private Filter filter; // 滤镜对象 多对一

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user; // 用户对象 多对一

    @Column(name = "filter_id")
    private Integer filterId;

    @Column(name = "user_id")
    private Integer userId;

    public Integer getFilterId() {
        return filterId;
    }

    public void setFilterId(Integer filterId) {
        this.filterId = filterId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOutputSize() {
        return outputSize;
    }

    public void setOutputSize(Integer outputSize) {
        this.outputSize = outputSize;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
