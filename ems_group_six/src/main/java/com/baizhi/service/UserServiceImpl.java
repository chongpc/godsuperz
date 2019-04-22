package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author houxd
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Map login(String username, String password, HttpSession session) {
        HashMap<String, Object> map = new HashMap<>();
        User user = userDao.selectOne(new User(null, username, null, null, null));
        if(ObjectUtils.isEmpty(user)){
            map.put("status",false);
            map.put("message","用户不存在!!!!!!!!!!!");
            return map;
        }else if(!StringUtils.isEmpty(password)&&password.equals(user.getPassword())){
            map.put("status",true);
            map.put("message","登陆成功!!!!!!!!!!!");
            session.setAttribute("user",user);
            return map;
        }else{
            map.put("status",false);
            map.put("message","密码错误!!!!!!!!!!!");
            return map;
        }

    }

    @Override
    public Map register(String username, String password,String realname, Integer gender) {
        HashMap<String, Object> map = new HashMap<>();
        userDao.insert(new User(UUID.randomUUID().toString(),username,password,realname,gender));
        map.put("status",true);
        map.put("message","成功");
        return map;
    }

    @Override
    public Map checkUsername(String username) {
        HashMap<String, Object> map = new HashMap<>();
        User user = userDao.selectOne(new User(null, username, null, null, null));
        if(ObjectUtils.isEmpty(user)){
            map.put("status",false);
            map.put("message","用户已存在");
            return map;
        }else{
            map.put("status",true);
            map.put("message","用户不存在");
            return map;
        }
    }
}
