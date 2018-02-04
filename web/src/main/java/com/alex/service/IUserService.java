package com.alex.service;

import com.alex.entity.User;
import com.baomidou.mybatisplus.service.IService;


public interface IUserService extends IService<User> {

    User selectDemo();

    User selectPlus();

}