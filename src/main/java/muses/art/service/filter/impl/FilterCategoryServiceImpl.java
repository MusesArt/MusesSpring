package muses.art.service.filter.impl;

import muses.art.dao.filter.FilterCategoryDao;
import muses.art.entity.filter.FilterCategory;
import muses.art.model.filter.FilterCategoryModel;
import muses.art.service.filter.FilterCategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilterCategoryServiceImpl implements FilterCategoryService {

    @Autowired
    private FilterCategoryDao filterCategoryDao;

    @Override
    public List<FilterCategoryModel> getCategoryList() {
        List<FilterCategory> filterCategories = filterCategoryDao.find("from FilterCategory");
        List<FilterCategoryModel> filterCategoryModels = entity2model(filterCategories);
        return filterCategoryModels;
    }

    private List<FilterCategoryModel> entity2model(List<FilterCategory> filterCategories) {
        List<FilterCategoryModel> filterCategoryModels = new ArrayList<>();
        for (FilterCategory filterCategory : filterCategories) {
            FilterCategoryModel filterCategoryModel = new FilterCategoryModel();
            BeanUtils.copyProperties(filterCategory, filterCategoryModel);
            filterCategoryModels.add(filterCategoryModel);
        }
        return filterCategoryModels;
    }
}
