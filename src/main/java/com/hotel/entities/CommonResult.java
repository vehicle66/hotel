package com.hotel.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: cb
 * @Date: 2020/10/30 17:09
 * @Version 1.0
 */
public class CommonResult {
    private String code;
    private String message;
    private Object  date;

    public CommonResult(){}
    
    public CommonResult(String code, String message, Object date) {
        this.code = code;
        this.message = message;
        this.date = date;
    }
    
    public CommonResult(String code,String message){
        this(code, message,null);
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }

    
}
