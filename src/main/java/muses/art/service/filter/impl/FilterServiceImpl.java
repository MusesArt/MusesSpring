package muses.art.service.filter.impl;

import muses.art.dao.filter.FilterDao;
import muses.art.entity.filter.Filter;
import muses.art.model.base.PageModel;
import muses.art.model.commodity.SearchModel;
import muses.art.model.filter.FilterInfoModel;
import muses.art.model.operation.CommentModel;
import muses.art.service.filter.FilterService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FilterServiceImpl implements FilterService {

    @Autowired
    private FilterDao filterDao;

    @Override
    public Boolean addFilter(FilterInfoModel filterInfoModel) {
        Filter filter = new Filter();
        BeanUtils.copyProperties(filterInfoModel, filter);
        filterDao.save(filter);
        return true;
    }

    @Override
    public Boolean deleteFilter(Integer id) {
        Filter filter = filterDao.get(Filter.class, id);
        if (filter != null) {
            filterDao.delete(filter);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean updateFilter(Integer id, FilterInfoModel filterInfoModel) {
        Filter filter = filterDao.get(Filter.class, id);
        if (filter != null) {
            BeanUtils.copyProperties(filterInfoModel, filter);
            // TODO 根据需求细化更新属性
            filterDao.update(filter);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public FilterInfoModel findFilterById(Integer id) {
        Filter filter = filterDao.get(Filter.class, id);
        FilterInfoModel filterInfoModel = new FilterInfoModel();
        BeanUtils.copyProperties(filter, filterInfoModel);
        return filterInfoModel;
    }

    @Override
    public PageModel<FilterInfoModel> findFiltersByUserId(Integer userId, int page, int size) {
        String HQL = "from Filter where ownerId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", userId);
        List<Filter> filters = filterDao.find(HQL, map, page, size);
        int totalNum = filterDao.find(HQL, map).size();
        List<FilterInfoModel> filterInfoModels = entity2model(filters);
        PageModel<FilterInfoModel> pageModel = new PageModel<>();
        pageModel.setDataList(filterInfoModels);
        pageModel.setCurrentPage(page);
        pageModel.setPageCount(totalNum % size == 0 ? totalNum / size : totalNum / size + 1);
        pageModel.setTotalNum(totalNum);
        pageModel.setPageSize(size);
        return pageModel;
    }

    @Override
    public PageModel<FilterInfoModel> findFiltersByCategoryId(Integer categoryId, int page, int size) {
        String HQL = "from Filter where categoryId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", categoryId);
        List<Filter> filters = filterDao.find(HQL, map, page, size);
        int totalNum = filterDao.find(HQL, map).size();
        List<FilterInfoModel> filterInfoModels = entity2model(filters);
        PageModel<FilterInfoModel> pageModel = new PageModel<>();
        pageModel.setDataList(filterInfoModels);
        pageModel.setCurrentPage(page);
        pageModel.setPageCount(totalNum % size == 0 ? totalNum / size : totalNum / size + 1);
        pageModel.setTotalNum(totalNum);
        pageModel.setPageSize(size);
        return pageModel;
    }

    @Override
    public PageModel<FilterInfoModel> searchFilters(SearchModel searchModel) {
        int size = searchModel.getSize();
        int page = searchModel.getPage();
        String keyword = searchModel.getKeyword();
        String HQL = "from Filter where filterName like :name or description like :description order by publishData asc";
        Map<String, Object> map = new HashMap<>();
        map.put("name", keyword);
        map.put("description", keyword);
        List<Filter> filters = filterDao.find(HQL, map, page, size);
        int totalNum = filterDao.find(HQL, map).size();
        List<FilterInfoModel> filterInfoModels = entity2model(filters);
        PageModel<FilterInfoModel> pageModel = new PageModel<>();
        pageModel.setDataList(filterInfoModels);
        pageModel.setCurrentPage(page);
        pageModel.setPageCount(totalNum % size == 0 ? totalNum / size : totalNum / size + 1);
        pageModel.setTotalNum(totalNum);
        pageModel.setPageSize(size);
        return pageModel;
    }

    private List<FilterInfoModel> entity2model(List<Filter> filters) {
        List<FilterInfoModel> filterInfoModels = new ArrayList<>();
        for (Filter filter : filters) {
            FilterInfoModel filterInfoModel = new FilterInfoModel();
            BeanUtils.copyProperties(filter, filterInfoModel);
            filterInfoModels.add(filterInfoModel);
        }
        return filterInfoModels;
    }
}
