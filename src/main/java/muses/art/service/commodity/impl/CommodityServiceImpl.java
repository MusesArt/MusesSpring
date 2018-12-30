package muses.art.service.commodity.impl;

import muses.art.dao.commodity.CommodityDao;
import muses.art.model.base.PageModel;
import muses.art.model.base.StatusModel;
import muses.art.model.commodity.CommodityModel;
import muses.art.service.commodity.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityDao commodityDao;

    @Override
    public PageModel<CommodityModel> findCommoditiesByPageAndSize() {
        return null;
    }
}
