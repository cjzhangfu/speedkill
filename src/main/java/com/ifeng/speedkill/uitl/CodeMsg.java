package com.ifeng.speedkill.uitl;

import com.sun.org.apache.bcel.internal.classfile.Code;

public class CodeMsg {
    private int code;
    private String msg;
    public static CodeMsg SUCCESS=new CodeMsg(0,"success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500,"服务器异常");
    public CodeMsg(int code ,String msg){
        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
