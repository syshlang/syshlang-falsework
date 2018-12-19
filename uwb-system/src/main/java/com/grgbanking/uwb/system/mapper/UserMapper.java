/*
 * Copyright (c) 2018. GRGBanking
 * @File: TestMapper.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 下午2:26
 * @since:
 */

package com.grgbanking.uwb.system.mapper;

import com.grgbanking.uwb.common.base.BaseMapper;
import com.grgbanking.uwb.system.model.UserModel;
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
