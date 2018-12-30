package muses.art.entity.filter;


import muses.art.entity.user.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "filter")
public class Filter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "filter_name", nullable = false)
    private String filterName; // 滤镜名称

    @Column(name = "cover_image", nullable = false)
    private String coverImage; // 滤镜封面图像地址

    @Column(name = "vip_only")
    private Boolean VipOnly; // 是否需要VIP

    @Column(name = "public_data")
    private Date publishData; // 发布日期

    @Column(name = "description")
    private String description; // 滤镜描述

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private FilterCategory category; // 滤镜所属类别对象 多对一

    @Column(name = "category_id")
    private Integer categoryId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id", insertable = false, updatable = false)
    private User owner; // 滤镜作者对象 多对一

    @Column(name = "owner_id")
    private Integer owner_id;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Boolean isVipOnly() {
        return VipOnly;
    }

    public void setVipOnly(Boolean vipOnly) {
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


}
