/*
 * 文 件 名:  RequirementGroup.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-6-27
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.command;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-6-27]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class RequirementGroup extends Group
{
    
    /**
     * 重载方法
     */
    @Override
    public void find()
    {
        System.out.println("~~~ 找到需求组~~~");
    }
    
    /**
     * 重载方法
     */
    @Override
    public void add()
    {
        System.out.println("~~~ 需求组添加需求~~~");
        
    }
    
    /**
     * 重载方法
     */
    @Override
    public void delete()
    {
        System.out.println("~~~需求组放弃需求~~~");
        
    }
    
    /**
     * 重载方法
     */
    @Override
    public void alert()
    {
        System.out.println("~~~需求组修改需求~~~");
    }
    
    /**
     * 重载方法
     */
    @Override
    public void plan()
    {
        System.out.println("~~~需求组给出新的需求计划~~~");
    }
    
}
