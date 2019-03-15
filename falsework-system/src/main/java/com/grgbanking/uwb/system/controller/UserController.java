/*
 * Copyright (c) 2018. GRGBanking
 * @File: UserController.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 下午5:50
 * @since:
 */

package com.grgbanking.uwb.system.controller;

import com.github.pagehelper.PageInfo;
import com.grgbanking.uwb.common.base.BaseController;
import com.grgbanking.uwb.common.base.BaseResultCode;
import com.grgbanking.uwb.common.base.ResulPageData;
import com.grgbanking.uwb.system.model.UserModel;
import com.grgbanking.uwb.system.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by sunys on 2018/12/18.
 */
@Api(tags = "用户相关接口")
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 示例： @ApiImplicitParams 接口文档生成
     * @param loginName
     * @param userName
     * @return
     */

    @ApiOperation(value = "用户列表",notes = "查询用户列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "loginName", value = "登录名称", dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "userName", value = "用户名称", dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "pageNum", value = "当前记录起始索引", dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "pageSize", value = "每页显示记录数", dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "orderByColumn", value = "排序列", dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "isAsc", value = "排序的方向", dataType = "String")
    })
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody ResulPageData list(@RequestParam(value="loginName",defaultValue="",required=false) String loginName,
                                            @RequestParam(value="userName",defaultValue="",required=false) String userName){
        ResulPageData resulPageData = new ResulPageData(BaseResultCode.SUCCESS);
        List<UserModel> list = userService.selectUserList(loginName,userName);
        resulPageData.setRows(list);
        resulPageData.setTotal(new PageInfo(list).getTotal());
        return resulPageData;
    }
}
