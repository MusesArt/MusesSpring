package muses.art.model.base;

import java.util.List;

public class PageModel<E> {

    private int currentPage;
    private int pageSize;
    private int pageCount;
    private int totalNum;
    private List<E> dataList;

    public PageModel() {}

    public PageModel(int currentPage, int pageSize, int totalNum, List<E> dataList) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalNum = totalNum;
        this.dataList = dataList;
        this.pageCount = totalNum % pageSize == 0 ? totalNum / pageSize : totalNum / pageSize + 1;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public List<E> getDataList() {
        return dataList;
    }

    public void setDataList(List<E> dataList) {
        this.dataList = dataList;
    }
}
