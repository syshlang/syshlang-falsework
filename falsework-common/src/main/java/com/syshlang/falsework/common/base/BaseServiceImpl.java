/*
 * Copyright (c) 2018. syshlangcom
 * @File: BaseServiceImpl.java
 * @Description: 
 * @Author: sunys
 * @Date: 18-12-18 下午4:19
 * @since:
 */

package com.syshlang.falsework.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sunys on 2018/12/18.
 */
public abstract class BaseServiceImpl<T extends BaseModel,M extends BaseMapper<T>> implements BaseService<T, M> {

    private final static Logger LOGGER = LoggerFactory.getLogger(BaseServiceImpl.class);

    protected M mapper;

    @Autowired
    public void setDao(M mapper) {
        this.mapper = mapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertOneModel(T t) {
        LOGGER.info("insertOneModel->{}",t);
        int insert = mapper.insert(t);
        return insert;
    }

    @Override
    public T selectOneModel(T t) {
        LOGGER.info("selectOneModel->{}",t);
        return mapper.selectOne(t);
    }

    @Override
    public List<T> selectListModel(T t) {
        LOGGER.info("selectListModel->{}",t);
        return mapper.select(t);
    }
}
