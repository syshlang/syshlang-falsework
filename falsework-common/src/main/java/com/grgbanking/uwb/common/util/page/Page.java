/*
 * Copyright (c) 2018. GRGBanking
 * @File: Page.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 下午7:25
 * @since:
 */

package com.grgbanking.uwb.common.util.page;

import com.github.pagehelper.StringUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by sunys on 2018/12/18.
 */
public class Page {

    /** 当前记录起始索引 */
    private Integer pageNum = 1;

    /** 每页显示记录数 */
    private Integer pageSize = 20;

    /** 排序列 */
    private String orderByColumn ;


    /** 排序的方向 "desc" 或者 "asc". */
    private String isAsc;

    public Page() {

    }

    public Page(Integer pageNum, Integer pageSize, String orderByColumn, String isAsc) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.orderByColumn = orderByColumn;
        this.isAsc = isAsc;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public String getOrderBy()
    {
        if (StringUtils.isBlank(orderByColumn))
        {
            return "";
        }
        return orderByColumn + " " + isAsc;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderByColumn() {
        return orderByColumn;
    }

    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    public String getIsAsc() {
        return isAsc;
    }

    public void setIsAsc(String isAsc) {
        this.isAsc = isAsc;
    }
}
