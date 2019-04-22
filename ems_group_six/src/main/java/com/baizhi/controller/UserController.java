package com.baizhi.controller;

import com.baizhi.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author houxd
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("login")
    public Map login(String username, String password, HttpSession session){
        return userService.login(username, password, session);
    }
    @RequestMapping("checkUsername")
    public Map checkUsername(String username){
        return userService.checkUsername(username);
    }
    @RequestMapping("register")
    public Map register(String username,String password,String realname,Integer gender){
        return userService.register(username, password, realname, gender);
    }
}
