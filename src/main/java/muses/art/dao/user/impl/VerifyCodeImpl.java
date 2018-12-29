package muses.art.dao.user.impl;

import muses.art.dao.common.impl.BaseDaoImpl;
import muses.art.dao.user.VerifyCodeDao;
import muses.art.entity.user.VerifyCode;
import org.springframework.stereotype.Repository;

@Repository
public class VerifyCodeImpl extends BaseDaoImpl<VerifyCode> implements VerifyCodeDao {
}
