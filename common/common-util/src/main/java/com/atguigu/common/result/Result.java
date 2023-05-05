package com.atguigu.common.result;

import lombok.Data;

@Data
public class Result<T> {

    private Integer code;    //返回码

    private String message;  //返回消息

    private T data;   //返回数据

    private Result(){}    //私有构造器

    public static <T> Result<T> build(T body, ResultCodeEnum resultCodeEnum) {
        Result<T> result = new Result<T>();
        if (body != null)
            result.setData(body);
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }

    //成功无数据
    public static<T> Result<T> ok(){
        return build(null,ResultCodeEnum.SUCCESS);
    }

    //成功有数据
    public static<T> Result<T> ok(T data){
        return build(data,ResultCodeEnum.SUCCESS);
    }

    //失败
    public static<T> Result<T> fail(){
        return build(null,ResultCodeEnum.FAIL);
    }


    public Result<T> message(String msg){
        this.setMessage(msg);
        return this;
    }

    public Result<T> code(Integer code){
        this.setCode(code);
        return this;
    }

}
