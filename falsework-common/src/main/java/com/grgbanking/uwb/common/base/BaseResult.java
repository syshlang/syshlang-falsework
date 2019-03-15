/*
 * Copyright (c) 2018. GRGBanking
 * @File: BaseResult.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 上午11:04
 * @since:
 */

package com.grgbanking.uwb.common.base;

/**
 * 返回结果类封装
 * Created by sunys on 2018/12/18.
 */
public class BaseResult {
    /**
     * 状态码：1成功，其他为失败
     */
    public int code;

    /**
     * 成功为success，其他为失败原因
     */
    public String message;

    /**
     * 数据结果集
     */
    public Object data;

    public BaseResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BaseResult() {

    }

    public  BaseResult successResult(String message, Object data){
        return new BaseResult(BaseResultCode.SUCCESS,message,data);
    }

    public  BaseResult failureResult(String message, Object data){
        return new BaseResult(BaseResultCode.ERROR,message,data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
