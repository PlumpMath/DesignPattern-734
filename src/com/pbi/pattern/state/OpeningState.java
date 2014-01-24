/*
 * 文 件 名:  OpeningState.java
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
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-22]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class OpeningState extends LiftState
{
    
    /**
     * 重载方法
     */
    @Override
    public void open()
    {
        System.out.println("~~~電梯打開~~~");
    }
    
    /**
     * 重载方法
     */
    @Override
    public void close()
    {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }
    
    /**
     * 重载方法
     */
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        
    }
    
    /**
     * 重载方法
     */
    @Override
    public void stop()
    {
        // TODO Auto-generated method stub
        
    }
    
}
