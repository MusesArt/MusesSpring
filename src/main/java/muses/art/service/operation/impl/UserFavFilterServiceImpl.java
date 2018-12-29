package muses.art.service.operation.impl;

import muses.art.dao.operation.UserFavFilterDao;
import muses.art.service.operation.UserFavFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFavFilterServiceImpl implements UserFavFilterService {

    @Autowired
    private UserFavFilterDao userFavFilterDao;
}
