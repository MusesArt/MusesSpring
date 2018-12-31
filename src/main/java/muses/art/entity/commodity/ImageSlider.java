package muses.art.entity.commodity;

import muses.art.entity.user.User;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "image_slider")
public class ImageSlider { // 滑动栏
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "image_url", nullable = false)
    private String imageUrl; // 图像地址

    @Column(name = "launch_date")
    private Date launchDate; // 活动上线时间

    @Column(name = "link_url")
    private String linkUrl; // 链接地址

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id", insertable = false, updatable = false)
    private User manager; // 管理员对象 多对一

    @Column(name = "manager_id")
    private Integer managerId; // 管理员id

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getLaunchData() {
        return launchDate;
    }

    public void setLaunchData(Date launchData) {
        this.launchDate = launchData;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

}
