/*
 * Copyright (c) 2018. GRGBanking
 * @File: UserServiceTest.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 下午4:42
 * @since:
 */

package com.grgbanking.uwb.system.service;
import java.util.Date;
import java.util.List;

import com.grgbanking.uwb.system.model.UserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sunys on 2018/12/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        /*"classpath*:*.properties",*/
        "classpath*:META-INF/spring/applicationContext.xml"
})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void insert() {
        UserModel userModel = new UserModel();
        userModel.setDeptId(1L);
        userModel.setParentId(1L);
        userModel.setLoginName("sunys");
        userModel.setUserName("孙源声");
        userModel.setEmail("");
        userModel.setPhonenumber("");
        userModel.setSex("");
        userModel.setAvatar("");
        userModel.setPassword("");
        userModel.setSalt("");
        userModel.setStatus("");
        userModel.setDelFlag("");
        userModel.setLoginIp("");
        userModel.setLoginDate(new Date());
        int insertOneModel = userService.insertOneModel(userModel);
        System.out.println(insertOneModel);
        UserModel user = new UserModel();
        user.setId(100L);
        UserModel userModel1 = userService.selectOneModel(user);
        System.out.println(userModel1);
        user.setId(null);
        user.setLoginName("sunys");
        List<UserModel> userModels = userService.selectListModel(user);
        user.setUserName("孙源声");
        userModels = userService.selectListModel(user);
        userService.testMethod(100L);
        UserModel userModel2 = userService.selectUserById(104L);
    }
}