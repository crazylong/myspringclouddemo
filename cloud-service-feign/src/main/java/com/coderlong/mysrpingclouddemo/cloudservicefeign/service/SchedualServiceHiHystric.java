package com.coderlong.mysrpingclouddemo.cloudservicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @autor Long Qiong
 * @create 2017/8/21
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
