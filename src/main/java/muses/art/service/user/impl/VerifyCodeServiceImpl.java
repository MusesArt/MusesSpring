package muses.art.service.user.impl;

import muses.art.dao.user.VerifyCodeDao;
import muses.art.service.user.VerifyCodeService;
import org.springframework.beans.factory.annotation.Autowired;

public class VerifyCodeServiceImpl implements VerifyCodeService {

    @Autowired
    private VerifyCodeDao verifyCodeDao;
}
