package com.hjp.usercenter.service;

import com.hjp.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author MyPC
* @description 针对表【user】的数据库操作Service
* @createDate 2023-08-23 10:51:08
*/
public interface UserService extends IService<User> {

    /**
     *
     * @param userAccount 账号
     * @param userPassword 密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount,String userPassword,String checkPassword,String planeCode);

    /**
     * 用户登录
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param httpServletRequest
     * @return 返回脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest httpServletRequest);

    /**
     * 退出登錄
     * @return
     */
    int userLogout(HttpServletRequest request);

    /**
     * 用戶信息脫敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);
}
