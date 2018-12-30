package muses.art.model.commodity;

public class HotKeyModel {

    private int id;
    private String keyword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
