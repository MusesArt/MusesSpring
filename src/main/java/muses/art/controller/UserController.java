package muses.art.controller;

import muses.art.model.base.StatusModel;
import muses.art.model.user.TokenModel;
import muses.art.model.user.UserModel;
import muses.art.service.user.UserService;
import muses.art.service.user.VerifyCodeService;
import muses.art.util.Hasher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private VerifyCodeService verifyCodeService;

    @RequestMapping(value = "/login/username", method = RequestMethod.POST)
    public @ResponseBody StatusModel<TokenModel> loginByUsername(@RequestParam("username") String username,
                                                       @RequestParam("password") String password) {
        UserModel user = userService.findUserByUsername(username);
        return login(user, password);
    }

    @RequestMapping(value = "/login/mobile", method = RequestMethod.POST)
    public @ResponseBody StatusModel<TokenModel> loginByMobile(@RequestParam("mobile") String mobile,
                                                                 @RequestParam("password") String password) {
        UserModel user = userService.findUserByMobile(mobile);
        return login(user, password);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public @ResponseBody StatusModel<TokenModel> registerByMobile(@RequestParam("mobile") String mobile,
                                                                  @RequestParam("password") String password,
                                                                  @RequestParam("code") String code) {
        UserModel user = userService.findUserByMobile(mobile);
        if (user != null) { // 手机号已被注册
            return new StatusModel<>("手机号已被注册");
        } else {
            userService.addNewUser(mobile, password, mobile);
            user = userService.findUserByMobile(mobile);
            return login(user, password);
        }
    }

    @RequestMapping(value = "/password", method = RequestMethod.POST)
    public @ResponseBody StatusModel<TokenModel> changePassword(@RequestParam("userId") Integer id,
                                                                  @RequestParam("old") String oldPassword,
                                                                  @RequestParam("new") String newPassword) {
        UserModel user = userService.findUserById(id);
        if (user == null) { // 用户存在
            return new StatusModel<>("该用户不存在");
        } else {
            if (Hasher.checkPassword(oldPassword, user.getPassword())) { // 旧密码输入正确
                userService.updatePassword(id, newPassword);
                return new StatusModel<>("修改密码成功", StatusModel.OK);
            }
            return new StatusModel<>("原始密码错误", StatusModel.ERROR);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public @ResponseBody StatusModel<TokenModel> deleteByUserId(@RequestParam("userId") Integer id,
                                                                  @RequestParam("password") String password) {
        UserModel user = userService.findUserById(id);
        if (user == null) { // 用户存在
            return new StatusModel<>("该用户不存在");
        } else {
            if (Hasher.checkPassword(password, user.getPassword())) { // 密码输入正确
                userService.deleteUser(id);
                return new StatusModel<>("用户注销成功", StatusModel.OK);
            }
            return new StatusModel<>("密码错误", StatusModel.ERROR);
        }
    }

    private StatusModel<TokenModel> login(UserModel user, String password) {
        if (user != null) {
            if (Hasher.checkPassword(password, user.getPassword())) {
                TokenModel tokenModel = new TokenModel();
                tokenModel.setToken(user.getToken());
                return new StatusModel<>(tokenModel);
            }
        }
        return new StatusModel<>("用户名或密码错误");
    }
}
