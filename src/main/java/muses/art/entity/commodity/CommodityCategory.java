package muses.art.entity.commodity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "commodity_category")
public class CommodityCategory { // 商品类别
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name; // 类别名称

    @Column(name = "code")
    private String code; // 类别编码

    @Column(name = "description")
    private String description; // 类别描述

    @Column(name = "is_tab")
    private Boolean isTab; // 是否导航

    @Column(name = "add_time")
    private Date addTime; // 添加时间

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_category_id", insertable = false, updatable = false)
    private CommodityCategory parentCategory; // 父类别对象 多对一

    @Column(name = "parent_category_id")
    private Integer parentCategoryId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "parentCategory")
    private List<CommodityCategory> subCategories; // 子类别列表 一对多

    public Integer getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Integer parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isTab() {
        return isTab;
    }

    public void setTab(Boolean tab) {
        isTab = tab;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public CommodityCategory getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(CommodityCategory parentCategory) {
        this.parentCategory = parentCategory;
    }

    public List<CommodityCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<CommodityCategory> subCategories) {
        this.subCategories = subCategories;
    }
}
