/*
 * Copyright (c) 2018. GRGBanking
 * @File: PageUtil.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 下午7:25
 * @since:
 */

package com.syshlang.falsework.common.util.page;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sunys on 2018/12/18.
 */
public class PageUtil {

    public static Page getPage(Integer pageNum,Integer pageSize,String orderByColumn,String isAsc){
        Page page = new Page();
        if (pageNum != null){
            page.setPageNum(pageNum);
        }
        if (pageSize != null){
            page.setPageSize(pageSize);
        }
        if (StringUtils.isNotBlank(orderByColumn)){
            page.setOrderByColumn(orderByColumn);
        }
        if (StringUtils.isNotBlank(isAsc)){
            page.setIsAsc(isAsc);
        }
        return page;
    }

    public static Page getPage(HttpServletRequest request){
        Integer pageNum = null;
        Integer pageSize = null;
        String pageNumStr=request.getParameter("pageNum");
        String pageSizeStr=request.getParameter("pageSize");
        String orderByColumn=request.getParameter("orderByColumn");
        String isAsc=request.getParameter("isAsc");
        if(StringUtils.isNotBlank(pageNumStr)){
            pageNum=Integer.valueOf(pageNumStr);
        }
        if(StringUtils.isNotBlank(pageSizeStr)){
            pageSize=Integer.valueOf(pageSizeStr);
        }
        return getPage(pageNum,pageSize,orderByColumn,isAsc);
    }
}
