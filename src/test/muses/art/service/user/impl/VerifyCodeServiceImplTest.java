package muses.art.service.user.impl;

import muses.art.model.user.VerifyCodeModel;
import muses.art.service.user.VerifyCodeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/applicationContext.xml", "classpath:/META-INF/spring-mvc.xml"})
public class VerifyCodeServiceImplTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private VerifyCodeService verifyCodeService;

    @Test
    public void verifyCodeServiceTest() {
        verifyCodeService.addVerifyCode("13968830312", "5635");
        logger.info("验证码添加功能测试通过");
        VerifyCodeModel verifyCodeModel = verifyCodeService.findCodeByMobile("13968830312");
        logger.info("验证码查找功能测试通过"+verifyCodeModel);

    }
}