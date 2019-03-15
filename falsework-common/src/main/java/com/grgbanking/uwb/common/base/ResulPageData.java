/*
 * Copyright (c) 2018. GRGBanking
 * @File: ResulPageData.java
 * @Description:
 * @Author: sunys
 * @Date: 18-12-18 下午6:52
 * @since:
 */

package com.grgbanking.uwb.common.base;

import java.util.List;

/**
 * Created by sunys on 2018/12/18.
 */
public class ResulPageData extends BaseResult{
    /** 总记录数 */
    private long total;
    /** 列表数据 */
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public ResulPageData() {
        super();
    }

    public ResulPageData(int code, String message, Object data) {
        super(code, message, data);
    }

    public ResulPageData(List<?> list, int total)
    {
        this.rows = list;
        this.total = total;
    }


    public ResulPageData(int code, String message, Object data,int total,List<?> rows) {
        super(code, message, data);
        this.rows = rows;
        this.total = total;
    }

    public  ResulPageData successResult( String message, Object data,int total,List<?> rows){
        return new ResulPageData(BaseResultCode.SUCCESS,message,data,total,rows);
    }

    public ResulPageData(int code) {
        this.code = code;
    }
}
