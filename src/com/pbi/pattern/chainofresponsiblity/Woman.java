/*
 * 文 件 名:  Woman.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-18
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.chainofresponsiblity;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-18]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Woman implements IWoman
{
    /*
     * 1 女儿 2 妻子 3 母亲
     */
    private int type;
    private String request;
    
    /** 
     * <默认构造函数>
     */
    public Woman(int type, String request)
    {
        super();
        this.type = type;
        this.request = request;
    }

    /**
     * 重载方法
     * @return
     */
    @Override
    public int getType()
    {
        return this.type;
    }
    
    /**
     * 重载方法
     * @return
     */
    @Override
    public String getRequest()
    {
        return this.request;
    }
    
}
