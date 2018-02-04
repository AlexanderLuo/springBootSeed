package com.alex.service.impl;

import com.alex.dao.UserMapper;
import com.alex.entity.User;
import com.alex.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    @Autowired
    UserMapper userMapper;
    public User selectDemo(){return userMapper.selectDemo();}

    @Override
    public User selectPlus() {
        return null;
    }

}