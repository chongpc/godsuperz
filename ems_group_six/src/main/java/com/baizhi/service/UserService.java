package com.baizhi.service;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author houxd
 */
public interface UserService {
    /**
     *用户登陆服务
     * @param username 用户名
     * @param password 密码
     * @param session HttpSession 登陆成功存入key为"user"的user对象
     * @return {status:true/false,message:"登陆成功/用户不存在/密码错误"}
     */
    Map login(String username,String password,HttpSession session);

    /**
     *  注册
     * @param username 用户名
     * @param password 密码
     * @param realname 真实姓名
     * @param gender 性别
     * @return {status:true/false,message:"注册成功/注册失败"}
     */
    Map register(String username,String password,String realname,Integer gender);

    /**
     * 检测用户名是否存在
     * @param username 用户名
     * @return {status:true/false,message:"用户不存在/用户已存在"}
     */
    Map checkUsername(String username);

}
