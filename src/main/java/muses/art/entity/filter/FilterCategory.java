package muses.art.entity.filter;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "filter_category")
public class FilterCategory { // 滤镜类别
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "category_name")
    private String categoryName; // 艺术类别名称

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "filter_category")
    private List<Filter> filters; // 该类别下的所有滤镜 一对多

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return "FilterCategory{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", filters=" + filters +
                '}';
    }
}
