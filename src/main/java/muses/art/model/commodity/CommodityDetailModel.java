package muses.art.model.commodity;

import java.util.Date;
import java.util.List;

public class CommodityDetailModel {

    private int id;
    private String commoditySN; // 商品唯一货号
    private String name; // 商品名称
    private int clickNum; // 点击量
    private int soldNum; // 销量
    private int favoriteNum; // 收藏数
    private int goodsNum; // 库存数
    private Float originalPrice; // 原价
    private Float discountPrice; // 折扣价或现价
    private String brief; // 商品简介
    private String description; // 商品详情webview地址
    private int shipFree; // 是否包邮
    private Boolean isNew; // 是否新品
    private Boolean isHot; // 是否热门
    private Date updateTime; //更新时间
    private String coverImage; // 封面图片地址
    private List<String> imageUrls; // 商品图片链接列表

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getClickNum() {
        return clickNum;
    }

    public void setClickNum(int clickNum) {
        this.clickNum = clickNum;
    }

    public int getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(int soldNum) {
        this.soldNum = soldNum;
    }

    public int getFavoriteNum() {
        return favoriteNum;
    }

    public void setFavoriteNum(int favoriteNum) {
        this.favoriteNum = favoriteNum;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
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

    public int getShipFree() {
        return shipFree;
    }

    public void setShipFree(int shipFree) {
        this.shipFree = shipFree;
    }

    public Boolean isNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
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
}
