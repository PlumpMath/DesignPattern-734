/*
 * 文 件 名:  HummerH1Model.java
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
public class HummerH1Model extends AbstractHummerModel
{
    
    private boolean isAlarm;
    /**
     * 重载方法
     */
    @Override
    protected void start()
    {
        System.out.println("~~~Model H1 start 。。。");
    }
    
    /**
     * 重载方法
     */
    @Override
    protected void engineBoom()
    {
        System.out.println("~~~Model H1 engine Boom 。。。");
    }
    
    /**
     * 重载方法
     */
    @Override
    protected void stop()
    {
        System.out.println("~~~Model H1 stop。。。");
    }
    
    /**
     * 重载方法
     */
    @Override
    protected void alarm()
    {
        System.out.println("~~~Model H1 alarm 。。。");
    }

    @Override
    protected boolean isAlarm()
    {
        return this.isAlarm;
    }

    public void setAlarm(boolean isAlarm)
    {
        this.isAlarm = isAlarm;
    }
    
    
    
}
