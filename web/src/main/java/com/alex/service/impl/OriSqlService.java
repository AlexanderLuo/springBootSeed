package com.alex.service.impl;

import com.alex.mapper.OriSqlMapper;
import com.alex.service.IOriSqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * User: Alexander Luo(496952252@qq.com)
 * Date: 2018-02-03
 * Time: 17:36
 */
@Service
public class OriSqlService implements IOriSqlService {

    @Autowired
    OriSqlMapper oriSqlMapper;

    @Override
    public Object test() {
        return oriSqlMapper.test();
    }
}
