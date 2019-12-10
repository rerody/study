package com.project.service;

import com.project.base.BaseService;

public class TestService extends BaseService {

    @Override
    protected void init() {
        System.out.println("测试初始化数据");
    }

}
