package com.hjp.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 */
@Data // 生成get set方法
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = 4007738542523832202L;
    private String userAccount, userPassword, checkPassword,planeCode;
}
