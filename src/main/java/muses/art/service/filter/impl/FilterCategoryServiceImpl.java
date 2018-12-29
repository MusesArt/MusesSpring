package muses.art.service.filter.impl;

import muses.art.dao.filter.FilterCategoryDao;
import muses.art.service.filter.FilterCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilterCategoryServiceImpl implements FilterCategoryService {

    @Autowired
    private FilterCategoryDao filterCategoryDao;

}
