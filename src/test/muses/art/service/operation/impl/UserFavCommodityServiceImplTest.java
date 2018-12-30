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

    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void addFavCommodityTest() {

        userFavCommodityService.addFavCommodity(1,1);
    }
//
//    @Test
//    public void deleteFavCommodityTest() {
//
//    }
//
//    @Test
//    public void findFavCommodityByIdTest() {
//
//    }
//
//    @Test
//    public void findFavCommodityByUserId() {
//
//    }




}