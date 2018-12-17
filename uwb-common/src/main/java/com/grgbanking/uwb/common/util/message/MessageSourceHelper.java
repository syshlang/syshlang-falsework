/*
 * Copyright (c) 2018. GRGBanking
 * @File: MessageSourceHelper.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-17 下午7:33
 * @since:
 */

package com.grgbanking.uwb.common.util.message;

import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.util.StringUtil;

import java.util.Locale;

/**
 * Created by sunys on 2018/12/17.
 */
public class MessageSourceHelper {

    private static ReloadableResourceBundleMessageSource messageSource;

    public static void setMessageSource(ReloadableResourceBundleMessageSource messageSource) {
        MessageSourceHelper.messageSource = messageSource;
    }

    /**
     * 根据当前会话设置语言地区判断选择语言，如果会话没有设置，则根据当前所在地区决定语言
     * @param key 配置文件中的key
     * @param arguments 对应取出的语句中占位符的替换参数
     * @return
     */
    public static String getMessage(String key, Object... arguments ) {
        //Locale locale = (Locale)UserContext.getSession().getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
        Locale locale = Locale.getDefault();
        if(locale == null) {
            locale = Locale.SIMPLIFIED_CHINESE;
        }
        return getMessage(key, arguments, locale);
    }

    public static String getMessage(String key, Object[] arguments, Locale locale) {
        if (messageSource == null){
            return null;
        }
        String message = messageSource.getMessage(key, arguments, locale);
        if (StringUtil.isNotEmpty(message) && message.equals(key)){
            return null;
        }
        return message;
    }
}
