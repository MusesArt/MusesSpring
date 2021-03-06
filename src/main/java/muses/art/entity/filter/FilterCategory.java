package muses.art.entity.filter;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "filter_category")
public class FilterCategory { // 滤镜类别
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "category_name")
    private String categoryName; // 艺术类别名称

    @Column(name = "image_url")
    private String imageUrl; // 图像链接

    // 滤镜类别被删除时，滤镜不能删除
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category", cascade = CascadeType.MERGE)
    private List<Filter> filters; // 该类别下的所有滤镜 一对多

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "FilterCategory{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", filters=" + filters +
                '}';
    }
}
