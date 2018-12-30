package muses.art.controller;

import muses.art.entity.user.User;
import muses.art.model.base.StatusModel;
import muses.art.model.user.TokenModel;
import muses.art.model.user.UserModel;
import muses.art.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody StatusModel<TokenModel> loginByUsername(@RequestParam("username") String username,
                                                       @RequestParam("password") Integer password, HttpSession session) {
        UserModel user = userService.findUserByUsername(username);
        if (user != null) {
            return new StatusModel<TokenModel>()
        }
        System.out.println(username);
        System.out.println(password);
        return new StatusModel<TokenModel>();
    }
}
