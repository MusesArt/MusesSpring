package muses.art.service.user;

import muses.art.model.user.VerifyCodeModel;

public interface VerifyCodeService {

    /**
     * 添加短信验证码和手机号到数据库
     * @param mobile 手机号
     * @param code 短信验证码
     * @return
     */
    Boolean addVerifyCode(String mobile, String code);

    /**
     * 根据手机号码查找短信验证码
     * @param mobile
     * @return
     */
    VerifyCodeModel findCodeByMobile(String mobile);

}