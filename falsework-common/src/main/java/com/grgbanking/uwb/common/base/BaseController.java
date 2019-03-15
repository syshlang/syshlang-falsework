/*
 * Copyright (c) 2018. GRGBanking
 * @File: BaseController.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 上午8:24
 * @since:
 */

package com.grgbanking.uwb.common.base;

import com.github.pagehelper.PageHelper;
import com.grgbanking.uwb.common.util.date.DateUtil;
import com.grgbanking.uwb.common.util.page.Page;
import com.grgbanking.uwb.common.util.page.PageUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
 * Created by sunys on 2018/12/18.
 */
public  class BaseController {

    private final static Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    protected PageHelper pageHelper;

    /**
     * 将前台传递过来的日期格式的字符串，自动转化为Date类型
     */
    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        // Date 类型转换
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport()
        {
            @Override
            public void setAsText(String text)
            {
                setValue(DateUtil.parseDate(text));
            }
        });
    }

    @ModelAttribute
    public void populateModel(HttpServletRequest request, HttpServletResponse response) {
        Page page = PageUtil.getPage(request);
        Integer pageNum = page.getPageNum();
        Integer pageSize = page.getPageSize();
        if (pageNum != null && pageSize!= null) {
            String orderBy = page.getOrderBy();
            PageHelper.startPage(pageNum, pageSize, orderBy);
        }
    }

    /**
     * 返回jsp视图
     * @param path
     * @return
     */
    public static String jsp(String path) {
        return path.concat(".jsp");
    }

    /**
     * 返回html视图
     * @param path
     * @return
     */
    public static String thymeleaf(String path) {
        return path.concat(".html");
    }
}
