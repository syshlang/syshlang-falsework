/*
 * Copyright (c) 2018. GRGBanking
 * @File: BaseException.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 上午9:14
 * @since:
 */

package com.grgbanking.uwb.common.base;

import com.grgbanking.uwb.common.util.message.MessageSourceHelper;
import org.apache.commons.lang3.StringUtils;


/**
 * Created by sunys on 2018/12/18.
 */
public class BaseException extends RuntimeException{
    private static final long serialVersionUID = 8224244118336379177L;
    /**
     * 所属模块
     */
    private String module;

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误码对应的参数
     */
    private Object[] args;

    /**
     * 错误消息
     */
    private String defaultMessage;

    public BaseException(String module, String code, Object[] args, String defaultMessage)
    {
        this.module = module;
        this.code = code;
        this.args = args;
        this.defaultMessage = defaultMessage;
    }

    public BaseException(String module, String code, Object[] args)
    {
        this(module, code, args, null);
    }

    public BaseException(String module, String defaultMessage)
    {
        this(module, null, null, defaultMessage);
    }

    public BaseException(String code, Object[] args)
    {
        this(null, code, args, null);
    }

    public BaseException(String defaultMessage)
    {
        this(null, null, null, defaultMessage);
    }


    @Override
    public String getMessage()
    {
        String message = null;
        if (!StringUtils.isEmpty(code))
        {
            message = MessageSourceHelper.getMessage(code, args);
        }
        if (message == null)
        {
            message = defaultMessage;
        }
        return message;
    }

    public String getModule()
    {
        return module;
    }

    public String getCode()
    {
        return code;
    }

    public Object[] getArgs()
    {
        return args;
    }

    public String getDefaultMessage()
    {
        return defaultMessage;
    }

}
