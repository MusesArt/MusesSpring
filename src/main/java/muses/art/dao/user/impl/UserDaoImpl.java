package muses.art.dao.user.impl;

import muses.art.dao.common.impl.BaseDaoImpl;
import muses.art.dao.user.UserDao;
import muses.art.entity.user.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
}
