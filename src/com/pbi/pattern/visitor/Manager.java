/*
 * 文 件 名:  Manager.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-19
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.visitor;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-19]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Manager extends Employee
{
    private String performance;
    
    public String getPerformance()
    {
        return performance;
    }
    
    public void setPerformance(String performance)
    {
        this.performance = performance;
    }
    
    /**
     * 重载方法
     * @param visitor
     */
    @Override
    public void accept(IVisitor visitor)
    {
        visitor.visit(this);
    }
    
}
