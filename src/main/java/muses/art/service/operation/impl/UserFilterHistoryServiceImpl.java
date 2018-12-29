package muses.art.service.operation.impl;

import muses.art.dao.operation.UserFilterHistoryDao;
import muses.art.service.operation.UserFilterHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFilterHistoryServiceImpl implements UserFilterHistoryService {

    @Autowired
    private UserFilterHistoryDao userFilterHistoryDao;
}
