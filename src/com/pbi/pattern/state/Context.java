/*
 * 文 件 名:  Context.java
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
 * 环境角色，串联各个状态的过度
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-7-22]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Context
{
    public final static OpeningState openingState = new OpeningState();
    
    public final static ClosingState closingState = new ClosingState();
    
    public final static RunningState runningState = new RunningState();
    
    public final static StopingState stopingState = new StopingState();
    
    private LiftState liftState;
    
    public LiftState getLiftState()
    {
        return liftState;
    }
    
    public void setLiftState(LiftState liftState)
    {
        this.liftState = liftState;
        
        // 把当前环境变量应用到各个类中
        this.liftState.setContext(this);
    }
    
    public void open()
    {
        this.liftState.open();
    }
    
    public void close()
    {
        this.liftState.close();
    }
    
    public void run()
    {
        this.liftState.run();
    }
    
    public void stop()
    {
        this.liftState.stop();
    }
    
}
