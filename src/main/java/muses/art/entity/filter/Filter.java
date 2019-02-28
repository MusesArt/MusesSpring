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

    @Column(name = "publish_date")
    private Date publishData; // 发布日期

    @Column(name = "description")
    private String description; // 滤镜描述

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private FilterCategory category; // 滤镜所属类别对象 多对一

    @Column(name = "category_id")
    private Integer categoryId; // 类别id

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", insertable = false, updatable = false)
    private User owner; // 滤镜作者对象 多对一

    @Column(name = "owner_id")
    private Integer ownerId; // 作者id

    @Column(name = "upload_id")
    private Integer uploadId; // 滤镜在gpu上的id

    @Column(name = "brush_size")
    private Integer brushSize;

    @Column(name = "brush_intensity")
    private Integer brushIntensity;

    @Column(name = "smooth")
    private Integer smooth;

    public Integer getBrushSize() {
        return brushSize;
    }

    public void setBrushSize(Integer brushSize) {
        this.brushSize = brushSize;
    }

    public Integer getBrushIntensity() {
        return brushIntensity;
    }

    public void setBrushIntensity(Integer brushIntensity) {
        this.brushIntensity = brushIntensity;
    }

    public Integer getSmooth() {
        return smooth;
    }

    public void setSmooth(Integer smooth) {
        this.smooth = smooth;
    }

    public Boolean getVipOnly() {
        return VipOnly;
    }

    public Integer getUploadId() {
        return uploadId;
    }

    public void setUploadId(Integer uploadId) {
        this.uploadId = uploadId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
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
