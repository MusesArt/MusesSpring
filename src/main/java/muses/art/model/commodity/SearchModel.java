package muses.art.model.commodity;

public class SearchModel {
    Integer size;
    Integer sortType;
    Boolean asc;
    String keyword;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSortType() {
        return sortType;
    }

    public void setSortType(Integer sortType) {
        this.sortType = sortType;
    }

    public Boolean getAsc() {
        return asc;
    }

    public void setAsc(Boolean asc) {
        this.asc = asc;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "SearchModel{" +
                "size=" + size +
                ", sortType=" + sortType +
                ", asc=" + asc +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
