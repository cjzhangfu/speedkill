package com.ifeng.speedkill.uitl;

public class Result<T> {
    private int code;
    private String msg;
    private T data;

    /**
     * 成功时返回
     * @param data
     * @param <T>
     * @return
     */
    public static <T>Result<T> success(T data){
        return new Result<T>(data);
    }
    public static <T>Result<T> error(CodeMsg msg){
        return new Result<T>(msg);
    }
    private Result(T data){
        this.code=0;
        this.msg="success";
        this.data=data;
    }
    private Result(CodeMsg msg){
        if(msg==null)
            return;
        this.code=msg.getCode();
        this.msg=msg.getMsg();
    }
    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
    public T getData() {
        return data;
    }

}
