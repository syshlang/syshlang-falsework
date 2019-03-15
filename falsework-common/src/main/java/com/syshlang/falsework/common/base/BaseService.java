/*
 * Copyright (c) 2018. GRGBanking
 * @File: BaseService.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 下午2:35
 * @since:
 */

package com.syshlang.falsework.common.base;

import java.util.List;

/**
 * Created by sunys on 2018/12/18.
 *
 * @param <T> the type parameter
 * @param <M> the type parameter
 */
public interface BaseService<T extends BaseModel,M extends BaseMapper<T>> {

    /**
     * Insert one model int.
     *
     * @param t the t
     * @return the int
     */
    int insertOneModel(T t);

    /**
     * Select one model t.
     * 根据单个实体的属性查询出对应实体，对实体的赋值
     * @param t the t
     * @return the t
     */
    T selectOneModel(T t);

    /**
     * Select list model list.
     *
     * @param t the t
     * @return the list
     */
    List<T> selectListModel(T t);
}
