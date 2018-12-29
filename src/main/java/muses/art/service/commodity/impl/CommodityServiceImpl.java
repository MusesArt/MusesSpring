package muses.art.service.commodity.impl;

import muses.art.dao.commodity.CommodityDao;
import muses.art.service.commodity.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityDao commodityDao;
}
