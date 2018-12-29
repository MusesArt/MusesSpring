package muses.art.service.commodity.impl;

import muses.art.dao.commodity.CommodityCategoryDao;
import muses.art.service.commodity.CommodityCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityCategoryServiceImpl implements CommodityCategoryService {

    @Autowired
    private CommodityCategoryDao commodityCategoryDao;


}
