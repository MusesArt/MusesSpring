package muses.art.service.user.impl;

import muses.art.model.user.UserModel;
import muses.art.service.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/applicationContext.xml", "classpath:/META-INF/spring-mvc.xml"})
public class UserServiceImplTest extends AbstractJUnit4SpringContextTests  {

    @Autowired
    UserService userService;

    @Test
    public void addNewUser() {
        userService.addNewUser("test", "123456", "15868091137");
        UserModel userModel = userService.findUserByUsername("test");
        userService.deleteUser(userModel.getId());
    }

    @Test
    public void deleteUser() {
        userService.addNewUser("test", "123456", "testMobile");
        UserModel userModel = userService.findUserByUsername("test");
        userService.deleteUser(userModel.getId());
    }

    @Test
    public void updatePassword() {
        userService.addNewUser("test", "123456", "testMobile");
        UserModel userModel = userService.findUserByUsername("test");
        userService.updatePassword(userModel.getId(), "654321");
    }

    @Test
    public void findUsernameIsUsed() {
        boolean flag = userService.findUsernameIsUsed("czczcz");
        logger.info("用户名是否被使用:"+flag);
    }

    @Test
    public void findMobileIsUsed() {
        boolean flag = userService.findMobileIsUsed("13758235351");
        logger.info("手机号是否被使用:"+flag);
    }

    @Test
    public void findUserByUsername() {
        UserModel userModel = userService.findUserByUsername("czczcz");
        logger.info(userModel);
    }

    @Test
    public void findUserById() {
        userService.addNewUser("test", "123456", "testMobile");
        UserModel userModel = userService.findUserByUsername("test");
        userModel = userService.findUserById(userModel.getId());
        logger.info(userModel);
    }

    @Test
    public void findUserByMobile() {
        userService.addNewUser("test", "123456", "123456789");
        UserModel userModel = userService.findUserByMobile("123456789");
        logger.info(userModel);
    }
}