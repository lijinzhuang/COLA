package com.alilbaba.domain.craftman.user;

public enum Role {
    DEV("开发"),QA("测试"),OTHER("非技术岗位");

    public String desc;
    Role(String desc){
        this.desc = desc;
    }
}
