package com.project.base;

public abstract class BaseService {

    /**
     * 初始化数据
     */
    protected abstract void init();


    public void safeInit() {
        init();
    }
}
