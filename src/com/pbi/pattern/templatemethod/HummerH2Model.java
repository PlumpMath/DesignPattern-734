/*
 * 文 件 名:  HummerH2Model.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-6-26
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.templatemethod;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-6-26]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class HummerH2Model extends AbstractHummerModel
{
    
    /**
     * 重载方法
     */
    @Override
    protected void start()
    {
        System.out.println(" M2 Start !!!");
    }
    
    /**
     * 重载方法
     */
    @Override
    protected void engineBoom()
    {
        System.out.println("M2 Boooooooo   !!!");
    }
    
    /**
     * 重载方法
     */
    @Override
    protected void stop()
    {
        System.out.println(" M2 Stop ~~~");
    }
    
    /**
     * 重载方法
     */
    @Override
    protected void alarm()
    {
        System.out.println("M2 Di Di Di ~~~");
    }

    @Override
    protected boolean isAlarm()
    {
        return false;
    }
    
    
    
}
