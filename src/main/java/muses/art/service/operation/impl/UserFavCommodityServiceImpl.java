package muses.art.service.operation.impl;

import muses.art.dao.operation.UserFavCommodityDao;
import muses.art.service.operation.UserFavCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFavCommodityServiceImpl implements UserFavCommodityService {

    @Autowired
    private UserFavCommodityDao userFavCommodityDao;
}
