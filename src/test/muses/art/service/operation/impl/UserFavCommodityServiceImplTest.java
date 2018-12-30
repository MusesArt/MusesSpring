package muses.art.service.operation.impl;

import muses.art.service.operation.UserFavCommodityService;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/applicationContext.xml", "classpath:/META-INF/spring-mvc.xml"})
public class UserFavCommodityServiceImplTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private UserFavCommodityService userFavCommodityService;

    @Test
    public void favCommodityTest() {
        boolean flag = userFavCommodityService.findFavCommodityByUserIdAndCommodityId(1, 1);
        logger.info("查找收藏测试通过");
        if (flag) {
            userFavCommodityService.deleteFavCommodity(1, 1);
            logger.info("删除收藏测试通过");
        }
        userFavCommodityService.addFavCommodity(1,1);
        logger.info("添加收藏测试通过");
    }
}