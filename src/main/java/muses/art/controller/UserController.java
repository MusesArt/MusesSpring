package muses.art.controller;

import muses.art.model.base.StatusModel;
import muses.art.model.user.TokenModel;
import muses.art.model.user.UserLoginModel;
import muses.art.model.user.UserModel;
import muses.art.service.user.UserService;
import muses.art.service.user.VerifyCodeService;
import muses.art.util.Hasher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("api/user")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private VerifyCodeService verifyCodeService;

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/login/username", method = RequestMethod.POST)
    public @ResponseBody StatusModel<TokenModel> loginByUsername(@RequestBody UserLoginModel u) {
        UserModel user = userService.findUserByUsername(u.getUsername());
        return login(user, u.getPassword());
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/login/mobile", method = RequestMethod.POST)
    public @ResponseBody StatusModel<TokenModel> loginByMobile(@RequestBody UserModel u) {
        UserModel user = userService.findUserByMobile(u.getMobile());
        return login(user, u.getPassword());
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public @ResponseBody StatusModel<TokenModel> registerByMobile(@RequestBody UserLoginModel u) {
        UserModel user = userService.findUserByMobile(u.getMobile());
        if (user != null) { // 手机号已被注册
            return new StatusModel<>("手机号已被注册");
        } else {
            userService.addNewUser(u.getMobile(), u.getPassword(), u.getMobile());
            user = userService.findUserByMobile(u.getMobile());
            return login(user, u.getPassword());
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/password", method = RequestMethod.POST)
    public @ResponseBody StatusModel<TokenModel> changePassword(@RequestBody UserLoginModel u) {
        UserModel user = userService.findUserById(u.getUserId());
        if (user == null) { // 用户存在
            return new StatusModel<>("该用户不存在");
        } else {
            if (Hasher.checkPassword(u.getOldPassword(), user.getPassword())) { // 旧密码输入正确
                userService.updatePassword(u.getUserId(), u.getNewPassword());
                return new StatusModel<>("修改密码成功", StatusModel.OK);
            }
            return new StatusModel<>("原始密码错误", StatusModel.ERROR);
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public @ResponseBody StatusModel<TokenModel> deleteByUserId(@RequestBody UserLoginModel u) {
        UserModel user = userService.findUserById(u.getUserId());
        if (user == null) { // 用户存在
            return new StatusModel<>("该用户不存在");
        } else {
            if (Hasher.checkPassword(u.getPassword(), user.getPassword())) { // 密码输入正确
                userService.deleteUser(u.getUserId());
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
