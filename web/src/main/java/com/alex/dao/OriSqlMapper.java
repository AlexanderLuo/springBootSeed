package com.alex.dao;

import com.alex.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * User 表数据库控制层接口
 */
@Mapper
public interface OriSqlMapper {

    @Select("select * from t_user ")
    List<User> test();

    //    @Results(id = "userMap", value = {
//            @Result(column = "id", property = "id", javaType = Integer.class),
//            @Result(property = "name", column = "name", javaType = String.class)
//    })
//    User selectById(@Param("id")int id);

}