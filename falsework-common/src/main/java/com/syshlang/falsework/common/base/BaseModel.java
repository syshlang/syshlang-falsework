/*
 * Copyright (c) 2018. syshlangcom
 * @File: BaseModel.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 上午11:15
 * @since:
 */

package com.syshlang.falsework.common.base;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

/**
 * 所有实体基类
 * Created by sunys on 2018/12/18.
 */
public class BaseModel implements Serializable {

    private static final long serialVersionUID = 7419549651435300647L;


 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
