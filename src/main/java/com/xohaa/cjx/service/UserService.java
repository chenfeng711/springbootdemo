package com.xohaa.cjx.service;

import com.xohaa.cjx.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xohaa.cjx.repository.UserRepositoty;

/**
 * Created by chenjianxiong on 2017/10/27.
 * User 业务逻辑
 */
@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepositoty;

    public User findUserByName(String name){
        User user = null;
        try{
            user = userRepositoty.findByUserName(name);
            
        }catch (Exception e){}
        return user;
    }
}

