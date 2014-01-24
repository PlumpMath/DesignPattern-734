/*
 * 文 件 名:  ClosingState.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-22
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.state;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-7-22]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class ClosingState extends LiftState
{
    
    /**
     * 重载方法
     */
    @Override
    public void open()
    {
        super.context.setLiftState(Context.openingState);
        super.context.getLiftState().open();
    }
    
    /**
     * 重载方法
     */
    @Override
    public void close()
    {
        System.out.println("~~~電梯關閉~~~");
    }
    
    /**
     * 重载方法
     */
    @Override
    public void run()
    {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }
    
    /**
     * 重载方法
     */
    @Override
    public void stop()
    {
        super.context.setLiftState(Context.stopingState);
        super.context.getLiftState().stop();
    }
    
}
