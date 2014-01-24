/*
 * 文 件 名:  Decorator.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-6-27
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.decorator;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-6-27]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Decorator extends SchoolReport
{
    private SchoolReport report;
    
    
    /** 
     * <默认构造函数>
     */
    public Decorator(SchoolReport report)
    {
        super();
        this.report = report;
    }

    /**
     * 重载方法
     */
    @Override
    public void report()
    {
        this.report.report();
    }
    
    /**
     * 重载方法
     * @param name
     */
    @Override
    public void sign(String name)
    {
        this.report.sign(name);
    }
    
}
