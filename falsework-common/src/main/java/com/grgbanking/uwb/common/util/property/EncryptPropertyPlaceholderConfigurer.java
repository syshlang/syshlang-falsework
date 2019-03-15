/*
 * Copyright (c) 2018. GRGBanking
 * @File: EncryptPropertyPlaceholderConfigurer.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-17 下午4:31
 * @since:
 */

package com.grgbanking.uwb.common.util.property;

import com.grgbanking.uwb.common.util.security.AESUtil;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * Created by sunys on 2018/12/17.
 */
public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    /**
     * 解密指定propertyName的加密属性值
     * @param propertyName
     * @param propertyValue
     * @return
     */
    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        if (propertyName.toLowerCase().endsWith("password")){
            return AESUtil.aesDecode(propertyValue);
        }
        return super.convertProperty(propertyName, propertyValue);
    }

}
