package muses.art.entity.filter;


import muses.art.entity.user.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "filter_category")
public class Filter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "filter_name", nullable = false)
    private String filterName; // 滤镜名称

    @Column(name = "cover_image", nullable = false)
    private String coverImage; // 滤镜封面图像地址

    @Column(name = "vip_only")
    private boolean VipOnly; // 是否需要VIP

    @Column(name = "public_data")
    private Date publishData; // 发布日期

    @Column(name = "description")
    private String description; // 滤镜描述

    @Column(name = "category_id")
    private int categorId; // 滤镜所属类别（外键）

    @Column(name = "owner_id")
    private int ownerId; // 滤镜发布作者（外键）

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private FilterCategory category; // 滤镜所属类别对象 多对一

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private User owner; // 滤镜作者对象 多对一

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilterName() {
        return filterName;
    }

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public boolean isVipOnly() {
        return VipOnly;
    }

    public void setVipOnly(boolean vipOnly) {
        VipOnly = vipOnly;
    }

    public Date getPublishData() {
        return publishData;
    }

    public void setPublishData(Date publishData) {
        this.publishData = publishData;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategorId() {
        return categorId;
    }

    public void setCategorId(int categorId) {
        this.categorId = categorId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public FilterCategory getCategory() {
        return category;
    }

    public void setCategory(FilterCategory category) {
        this.category = category;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Filter{" +
                "id=" + id +
                ", filterName='" + filterName + '\'' +
                ", coverImage='" + coverImage + '\'' +
                ", VipOnly=" + VipOnly +
                ", publishData=" + publishData +
                ", description='" + description + '\'' +
                ", categorId=" + categorId +
                ", ownerId=" + ownerId +
                ", category=" + category +
                ", owner=" + owner +
                '}';
    }
}
