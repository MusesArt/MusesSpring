package muses.art.service.user.impl;

import muses.art.dao.user.UserDao;
import muses.art.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
}
