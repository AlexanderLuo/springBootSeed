package com.alex.dao;

import com.alex.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectDemo();


}