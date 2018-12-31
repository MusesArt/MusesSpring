package muses.art.entity.commodity;

import javax.persistence.*;

@Entity
@Table(name = "hot_key")
public class HotKey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "keyword", unique = true, nullable = false)
    private String keyword; //热门搜索关键词

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
