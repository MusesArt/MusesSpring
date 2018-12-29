package muses.art.entity.commodity;

import muses.art.entity.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "image_slider")
public class ImageSlider { // 滑动栏
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "image_url", nullable = false)
    private String imageUrl; // 图像地址

    @Column(name = "launch_data")
    private Timestamp launchData; // 活动上线时间

    @Column(name = "link_url")
    private String linkUrl; // 链接地址

    @Column(name = "manager_id")
    private int manager_id; // 管理员id（外键）

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id", referencedColumnName = "id")
    private User manager; // 管理员对象 多对一

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Timestamp getLaunchData() {
        return launchData;
    }

    public void setLaunchData(Timestamp launchData) {
        this.launchData = launchData;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "ImageSlider{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", launchData=" + launchData +
                ", linkUrl='" + linkUrl + '\'' +
                ", manager_id=" + manager_id +
                ", manager=" + manager +
                '}';
    }
}
