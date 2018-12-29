package muses.art.model.commodity;

import java.sql.Date;
import java.util.List;

public class CommodityCategoryModel {

    private int id;
    private String name; // 类别名称
    private String code; // 类别编码
    private String description; // 类别描述
    private boolean isTab; // 是否导航
    private Date addTime; // 添加时间
    private CommodityCategoryModel parentCategory; // 父类别对象 多对一
    private List<CommodityCategoryModel> subCategories; // 子类别列表 一对多
}
