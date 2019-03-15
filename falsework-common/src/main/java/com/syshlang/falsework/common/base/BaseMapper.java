/*
 * Copyright (c) 2018. GRGBanking
 * @File: BaseMapper.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 下午2:19
 * @since:
 */

package com.syshlang.falsework.common.base;

import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.base.insert.InsertMapper;

/**
 * Created by sunys on 2018/12/18.
 */
@RegisterMapper
public interface BaseMapper<T extends BaseModel> extends Mapper<T>, InsertMapper<T> {
}
