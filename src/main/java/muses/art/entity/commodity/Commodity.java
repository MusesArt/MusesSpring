package muses.art.entity.commodity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "commodity")
public class Commodity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "commodity_sn")
    private String commoditySN; // 商品唯一货号

    @Column(name = "name")
    private String name; // 商品名称

    @Column(name = "click_num")
    private Integer clickNum; // 点击量

    @Column(name = "sold_num")
    private Integer soldNum; // 销量

    @Column(name = "goods_num")
    private Integer goodsNum; // 库存数

    @Column(name = "original_price")
    private Float originalPrice; // 原价

    @Column(name = "discount_price")
    private Float discountPrice; // 折扣价或现价

    @Column(name = "brief")
    private String brief; // 商品简介

    @Column(name = "description", length = 4096)
    private String description; // 商品详情webview地址

    @Column(name = "ship_free")
    private Integer shipFree; // 是否包邮

    @Column(name = "is_hot")
    private Boolean isHot; // 是否热门

    @Column(name = "add_time")
    private Date addTime; // 添加时间

    @Column(name = "update_time")
    private Date updateTime; //更新时间

    @Column(name = "cover_image")
    private String coverImage; // 封面图片地址

    @Column(name = "information", length = 1024)
    private String information; // 商品具体信息

    // 若商品删除，则其所属的所有图片可以删除
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "commodity", cascade = CascadeType.REMOVE)
    private List<Image> images; // 商品图片列表 一对多

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private CommodityCategory category; // 所属类别对象 多对一

    @Column(name = "category_id")
    private Integer categoryId; // 类别id

    // 若商品删除，则其所属的所有参数可以删除
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "commodity", cascade = CascadeType.REMOVE)
    private List<Attribute> attributes;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

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

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
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

    public Boolean getHot() {
        return isHot;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}
