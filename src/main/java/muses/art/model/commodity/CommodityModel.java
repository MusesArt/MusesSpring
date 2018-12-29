package muses.art.model.commodity;

import muses.art.entity.commodity.CommodityCategory;

import java.sql.Date;
import java.util.List;

public class CommodityModel {

    private int id;
    private String commoditySN; // 商品唯一货号
    private String name; // 商品名称
    private int clickNum; // 点击量
    private int soldNum; // 销量
    private int favoriteNum; // 收藏数
    private int goodsNum; // 库存数
    private float originalPrice; // 原价
    private float discountPrice; // 折扣价或现价
    private String brief; // 商品简介
    private String description; // 商品详情webview地址
    private int shipFree; // 是否包邮
    private boolean isNew; // 是否新品
    private boolean isHot; // 是否热门
    private Date addTime; // 添加时间
    private String coverImage; // 封面图片地址
    private List<ImageModel> images; // 商品图片列表 一对多
    private CommodityCategory category; // 所属类别对象 多对一
}
