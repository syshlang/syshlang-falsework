/*
 * Copyright (c) 2018. syshlangcom
 * @File: TestServiceImpl.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 下午2:28
 * @since:
 */

package com.syshlang.falsework.system.service.impl;

import com.syshlang.falsework.common.base.BaseServiceImpl;
import com.syshlang.falsework.system.mapper.UserMapper;
import com.syshlang.falsework.system.model.UserModel;
import com.syshlang.falsework.system.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sunys on 2018/12/18.
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<UserModel, UserMapper> implements UserService {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserModel testMethod(Long Id) {
        LOGGER.info("testMethod->{}",Id);
        UserModel userModel =  new UserModel();
        userModel.setId(Id);
        UserModel userModel1 = userMapper.selectOne(userModel);
        return userModel1;
    }

    @Override
    public List<UserModel> selectUserList(String loginName, String userName) {
        LOGGER.info("selectUserList->[loginName:{},userName:{}]",loginName,userName);
        UserModel userModel = new UserModel();
        userModel.setLoginName(loginName);
        userModel.setUserName(userName);
        return userMapper.select(userModel);
    }

    @Override
    public UserModel selectUserById(Long id) {
        LOGGER.info("selectUserById->[id:{}]",id);
        return userMapper.selectUserById(id);
    }
}
