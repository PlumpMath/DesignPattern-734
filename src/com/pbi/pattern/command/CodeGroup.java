/*
 * 文 件 名:  CodeGroup.java
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
public class CodeGroup extends Group
{
    
    /**
     * 重载方法
     */
    @Override
    public void find()
    {
        System.out.println("~~~找到代码组~~~");
        
    }
    
    /**
     * 重载方法
     */
    @Override
    public void add()
    {
        System.out.println("~~~代码组添加功能~~~");
    }
    
    /**
     * 重载方法
     */
    @Override
    public void delete()
    {
        System.out.println("~~~代码组删除功能~~~");
    }
    
    /**
     * 重载方法
     */
    @Override
    public void alert()
    {
        System.out.println("~~~代码组修改功能~~~");
    }
    
    /**
     * 重载方法
     */
    @Override
    public void plan()
    {
        System.out.println("~~~代码组给出新计划~~~");
    }
    
}
