package com.alex.mapper;

import org.apache.ibatis.annotations.Select;
import java.util.List;
import java.util.Objects;

/**
 * User 表数据库控制层接口
 */
public interface OriSqlMapper {

    @Select("select * from t_user")
    Object[] test();

    //    @Results(id = "userMap", value = {
//            @Result(column = "id", property = "id", javaType = Integer.class),
//            @Result(property = "name", column = "name", javaType = String.class)
//    })
//    User selectById(@Param("id")int id);

}