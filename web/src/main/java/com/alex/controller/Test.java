package com.alex.controller;


import com.alex.entity.User;
import com.alex.service.IOriSqlService;
import com.alex.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        User user=new User();

        return iUserService.selectDemo();
    }

    @GetMapping(value = "/ok")
    public Object ok(){
        return iUserService.selectDemo();
    }

}
