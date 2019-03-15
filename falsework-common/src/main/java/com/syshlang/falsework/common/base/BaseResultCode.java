/*
 * Copyright (c) 2018. GRGBanking
 * @File: BaseResultCode.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 上午11:00
 * @since:
 */

package com.syshlang.falsework.common.base;

/**
 * 全局返回码 继承该类 可按业务具体细分
 * Created by sunys on 2018/12/18.
 */
public class BaseResultCode {

    public final static int SUCCESS = 1;// 成功

    // 通用错误以9开头
    public final static int ERROR = 9999;// 未知错误
    public final static int APPLICATION_ERROR = 9000;// 应用级错误
    public final static int VALIDATE_ERROR = 9001;// 参数验证错误
    public final static int SERVICE_ERROR = 9002;// 业务逻辑验证错误
    public final static int CACHE_ERROR = 9003;// 缓存访问错误
    public final static int DAO_ERROR = 9004;// 数据访问错误
}
