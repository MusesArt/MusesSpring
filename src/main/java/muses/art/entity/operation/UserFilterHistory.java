package muses.art.entity.operation;

import muses.art.entity.filter.Filter;
import muses.art.entity.user.User;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name = "user_filter_history")
public class UserFilterHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "filter_id")
    private int filterId; // 滤镜id(外键)

    @Column(name = "user_id")
    private int userId; // 用户id(外键)

    @Column(name = "output_size")
    private int outputSize; // 输出图像大小

    @Column(name = "operate_time")
    private Timestamp operateTime; // 使用时间

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "filter_id")
    private Filter filter; // 滤镜对象 多对一

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user; // 用户对象 多对一

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilterId() {
        return filterId;
    }

    public void setFilterId(int filterId) {
        this.filterId = filterId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOutputSize() {
        return outputSize;
    }

    public void setOutputSize(int outputSize) {
        this.outputSize = outputSize;
    }

    public Timestamp getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Timestamp operateTime) {
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

    @Override
    public String toString() {
        return "UserFilterHistory{" +
                "id=" + id +
                ", filterId=" + filterId +
                ", userId=" + userId +
                ", outputSize=" + outputSize +
                ", operateTime=" + operateTime +
                ", filter=" + filter +
                ", user=" + user +
                '}';
    }
}
