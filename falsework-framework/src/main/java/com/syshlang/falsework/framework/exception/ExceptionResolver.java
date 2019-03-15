/*
 * Copyright (c) 2018. GRGBanking
 * @File: ExceptionResolver.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-17 下午3:53
 * @since:
 */

package com.syshlang.falsework.framework.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sunys on 2018/12/17.
 */
public class ExceptionResolver implements HandlerExceptionResolver {



    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse, Object o, Exception e) {
        return null;
    }
}
