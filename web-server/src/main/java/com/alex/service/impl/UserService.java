package com.alex.service.impl;

import com.alex.dao.UserMapper;
import com.alex.entity.User;
import com.alex.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService{


    @Override
    public User selectDemo() {
        return null;
    }

    @Override
    public User selectPlus() {
        return null;
    }
}