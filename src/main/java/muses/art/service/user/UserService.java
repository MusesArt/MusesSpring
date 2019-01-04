package muses.art.service.user;

import muses.art.model.user.UserModel;

public interface UserService {

    /**
     * 用户注册
     * @param username 用户名
     * @param password 密码
     * @param mobile 手机号
     * @return
     */
    Boolean addNewUser(String username, String password, String mobile);

    /**
     * 删除用户
     * @param id 用户id
     * @return
     */
    Boolean deleteUser(Integer id);

    /**
     * 用户修改密码
     * @param userId 用户id
     * @param password 新密码
     * @return
     */
    Boolean updatePassword(Integer userId, String password);

    /**
     * 判断用户名是否已经被使用
     * @param username 用户名
     * @return
     */
    Boolean findUsernameIsUsed(String username);

    /**
     * 判断手机号是否已被使用
     * @param mobile 手机号
     * @return
     */
    Boolean findMobileIsUsed(String mobile);

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    UserModel findUserByUsername(String username);

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    UserModel findUserById(Integer id);

    /**
     * 根据手机号查找用户
     * @param mobile
     * @return
     */
    UserModel findUserByMobile(String mobile);

    /**
     * 根据token查找用户
     * @param token 用户token
     * @return
     */
    UserModel findUserByToken(String token);


}