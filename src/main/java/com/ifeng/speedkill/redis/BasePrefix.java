package com.ifeng.speedkill.redis;

public abstract class BasePrefix implements KeyPrefix{
    private int expireSeconds;
    private String prefix;
    public BasePrefix(int expireSeconds,String prefix){
        
    }
    @Override
    public int expireSeconds() {//默认0代表永不过期
        return expireSeconds;
    }

    @Override
    public String getPrefix() {
        return null;
    }
}
