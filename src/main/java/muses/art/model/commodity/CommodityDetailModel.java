package muses.art.model.commodity;

import muses.art.entity.commodity.Attribute;

import java.util.Date;
import java.util.List;

public class CommodityDetailModel {

    private Integer id;
    private String commoditySN; // 商品唯一货号
    private String name; // 商品名称
    private Integer clickNum; // 点击量
    private Integer soldNum; // 销量
    private Integer favoriteNum; // 收藏数
    private Integer goodsNum; // 库存数
    private Float originalPrice; // 原价
    private Float discountPrice; // 折扣价或现价
    private String brief; // 商品简介
    private String description; // 商品详情webview地址
    private Integer shipFree; // 是否包邮
    private Boolean isHot; // 是否热门
    private Date updateTime; //更新时间
    private String coverImage; // 封面图片地址
    private List<String> imageUrls; // 商品图片链接列表
    private List<AttributeModel> attributes;
    private String information;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommoditySN() {
        return commoditySN;
    }

    public void setCommoditySN(String commoditySN) {
        this.commoditySN = commoditySN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClickNum() {
        return clickNum;
    }

    public void setClickNum(Integer clickNum) {
        this.clickNum = clickNum;
    }

    public Integer getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(Integer soldNum) {
        this.soldNum = soldNum;
    }

    public Integer getFavoriteNum() {
        return favoriteNum;
    }

    public void setFavoriteNum(Integer favoriteNum) {
        this.favoriteNum = favoriteNum;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Float getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Float discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getShipFree() {
        return shipFree;
    }

    public void setShipFree(Integer shipFree) {
        this.shipFree = shipFree;
    }

    public Boolean isHot() {
        return isHot;
    }

    public void setHot(Boolean hot) {
        isHot = hot;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public List<AttributeModel> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeModel> attributes) {
        this.attributes = attributes;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
