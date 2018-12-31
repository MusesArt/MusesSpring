package muses.art.model.commodity;

public class HotKeyModel {

    private Integer id;
    private String keyword;

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

    @Override
    public String toString() {
        return "id : " + id + "  " +
                "keyword = " + keyword;
    }
}
