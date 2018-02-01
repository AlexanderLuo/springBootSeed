package com.alex.service;

import com.alex.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Description:
 * User: Alexander Luo(496952252@qq.com)
 * Date: 2018-02-01
 * Time: 18:28
 */

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "***************sorry "+name;
    }
}
