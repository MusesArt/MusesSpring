package muses.art.service.filter;

import muses.art.model.filter.FilterCategoryModel;

import java.util.List;

public interface FilterCategoryService {

    /**
     * 获取所有滤镜类别信息
     * @return 滤镜类别信息列表
     */
    List<FilterCategoryModel> getCategoryList();
}
