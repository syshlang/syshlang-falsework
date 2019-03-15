/*
 * Copyright (c) 2018. GRGBanking
 * @File: TestService.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 下午2:28
 * @since:
 */

package com.syshlang.falsework.system.service;

import com.syshlang.falsework.common.base.BaseService;
import com.syshlang.falsework.system.mapper.UserMapper;
import com.syshlang.falsework.system.model.UserModel;

import java.util.List;

/**
 * Created by sunys on 2018/12/18.
 */
public interface UserService extends BaseService<UserModel, UserMapper> {

    /**
     * 根据业务自定义方法示例
     *
     * @param Id the id
     * @return user model
     */
    UserModel testMethod(Long Id);

    /**
     * Select user list list.
     * 查询用户列表
     *
     * @param loginName the login name
     * @param userName  the user name
     * @return the list
     */
    List<UserModel> selectUserList(String loginName, String userName);

    /**
     * Select user by id.
     *
     * @param l the l
     * @return the user model
     */
    UserModel selectUserById(Long id);
}
