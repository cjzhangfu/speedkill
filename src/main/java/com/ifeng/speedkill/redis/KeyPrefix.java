package com.ifeng.speedkill.redis;

public interface KeyPrefix {
    public  int expireSeconds();
    public String getPrefix();
}
