package muses.art.service.user.impl;

import muses.art.dao.user.VerifyCodeDao;
import muses.art.entity.user.VerifyCode;
import muses.art.model.user.VerifyCodeModel;
import muses.art.service.user.VerifyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@Transactional
public class VerifyCodeServiceImpl implements VerifyCodeService {

    @Autowired
    private VerifyCodeDao verifyCodeDao;

    @Override
    public Boolean addVerifyCode(String mobile, String code) {
        VerifyCode verifyCode = new VerifyCode();
        verifyCode.setCode(code);
        verifyCode.setMobile(mobile);
        verifyCode.setAddTime(new Timestamp(System.currentTimeMillis()));
        verifyCodeDao.save(verifyCode);
        return true;
    }

    @Override
    public VerifyCodeModel findCodeByMobile(String mobile) {
        String HQL = "from VerifyCode where mobile=:mob";
        Map<String, Object> map = new HashMap<>();
        map.put("mob", mobile);
        List<VerifyCode> verifyCodes = verifyCodeDao.find(HQL, map);
        return entity2model(verifyCodes.get(verifyCodes.size()-1));
    }

    private VerifyCodeModel entity2model(VerifyCode verifyCode) {
        if (verifyCode != null) {
            VerifyCodeModel verifyCodeModel = new VerifyCodeModel();
            verifyCodeModel.setAddTime(verifyCode.getAddTime());
            verifyCodeModel.setCode(verifyCode.getCode());
            verifyCodeModel.setMobile(verifyCode.getMobile());
            return verifyCodeModel;
        } else {
            return null;
        }
    }
}
