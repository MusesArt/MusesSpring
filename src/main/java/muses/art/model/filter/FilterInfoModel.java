package muses.art.model.filter;
import java.util.Date;

public class FilterInfoModel {

    private Integer ownerId;            // 作者id
    private Integer uploadId;           // 唯一标识
    private String filterName;         // 滤镜名称
    private String coverImage;         // 风格模板
    private Integer brushSize;          // 笔刷大小
    private Integer brushIntensity;     // 风格强度
    private Integer smooth;             // 平滑度
    private Date publishDate;           // 发布日期
    private Boolean VipOnly;
    private String base64Image;

    public String getBase64Image() {
        return base64Image;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }

    private String description; // 滤镜描述

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getVipOnly() {
        return VipOnly;
    }

    public void setVipOnly(Boolean vipOnly) {
        VipOnly = vipOnly;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getUploadId() {
        return uploadId;
    }

    public void setUploadId(Integer uploadId) {
        this.uploadId = uploadId;
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

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
