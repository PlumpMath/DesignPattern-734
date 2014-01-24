/*
 * 文 件 名:  LiftState.java
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
public abstract class LiftState
{
    public Context context;

    public void setContext(Context context)
    {
        this.context = context;
    }
    
    public abstract void open();
    
    public abstract void close();
    
    public abstract void run();
    
    public abstract void stop();
}
