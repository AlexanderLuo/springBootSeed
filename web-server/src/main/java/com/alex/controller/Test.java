package com.alex.controller;


import com.alex.entity.User;
import com.alex.service.IOriSqlService;
import com.alex.service.IUserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

/**
 * Description:
 * User: Alexander Luo(496952252@qq.com)
 * Date: 2018-02-03
 * Time: 17:00
 */
@RestController
public class Test {
    @Autowired
    IOriSqlService iOriSqlService;
    @Autowired
    IUserService iUserService;


    @GetMapping(value = "/hi")
    public Object hi(){

        return iUserService.selectPage(
                new Page<User>(0, 10),
                new EntityWrapper<User>().orderBy("userName",false)
        );
    }

    @GetMapping(value = "/ok")
    public void ok(){
        User user =new User();
        user.setUserName("luohao");
        iUserService.insert(user);
    }



}
