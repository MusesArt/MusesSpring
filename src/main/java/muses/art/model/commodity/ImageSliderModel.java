package muses.art.model.commodity;

import java.sql.Date;

public class ImageSliderModel {

    private Integer id;

    private String imageUrl; // 图像地址

    private Date launchData; // 活动上线时间

    private String linkUrl; // 链接地址

    private Integer managerId;

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
        return launchData;
    }

    public void setLaunchData(Date launchData) {
        this.launchData = launchData;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}
