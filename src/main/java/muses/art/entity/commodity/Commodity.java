package muses.art.entity.commodity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "commodity")
public class Commodity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "commodity_sn")
    private String commoditySN; // 商品唯一货号

    @Column(name = "name")
    private String name; // 商品名称

    @Column(name = "click_num")
    private int clickNum; // 点击量

    @Column(name = "sold_num")
    private int soldNum; // 销量

    @Column(name = "favorite_num")
    private int favoriteNum; // 收藏数

    @Column(name = "goods_num")
    private int goodsNum; // 库存数

    @Column(name = "original_price")
    private float originalPrice; // 原价

    @Column(name = "discount_price")
    private float discountPrice; // 折扣价或现价

    @Column(name = "brief")
    private String brief; // 商品简介

    @Column(name = "description")
    private String description; // 商品详情webview地址

    @Column(name = "ship_free")
    private int shipFree; // 是否包邮

    @Column(name = "is_new")
    private boolean isNew; // 是否新品

    @Column(name = "is_hot")
    private boolean isHot; // 是否热门

    @Column(name = "add_time")
    private Date addTime; // 添加时间

    @Column(name = "cover_image")
    private String coverImage; // 封面图片地址

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "commodity")
    private List<Image> images; // 商品图片列表 一对多

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private CommodityCategory category; // 所属类别对象 多对一

    @Column(name = "category_id")
    private int categoryId;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

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

    public float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public float getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(float discountPrice) {
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

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public CommodityCategory getCategory() {
        return category;
    }

    public void setCategory(CommodityCategory category) {
        this.category = category;
    }


}
