/*
 * Copyright (c) 2018. syshlangcom
 * @File: TestMapper.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 下午2:26
 * @since:
 */

package com.syshlang.falsework.system.mapper;

import com.syshlang.falsework.common.base.BaseMapper;
import com.syshlang.falsework.system.model.UserModel;
import org.apache.ibatis.annotations.Param;

/**
 * Created by sunys on 2018/12/18.
 */
public interface UserMapper extends BaseMapper<UserModel> {


     /**
      * 自定义mapper  示例
      * @param id
      * @return
      */
     UserModel selectUserById(@Param("id") Long id);

}
