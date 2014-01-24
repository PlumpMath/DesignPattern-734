/*
 * 文 件 名:  Handler.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-18
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.chainofresponsiblity;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-18]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public abstract class Handler
{
    //处理级别
    private int level;
    
    //下一個責任人
    private Handler nextHandler;

    /** 
     * <默认构造函数>
     */
    public Handler(int level)
    {
        super();
        this.level = level;
    }
    
    public final void handleMessage(IWoman woman)
    {
        if (woman.getType() == this.level)
        {
            this.response(woman);
        }
        else
        {
            if (null != nextHandler)
            {
                nextHandler.handleMessage(woman);
            }
        }
    }
    
    public void setNextHandler(Handler nextHandler)
    {
        this.nextHandler = nextHandler;
    }

    public abstract  void response(IWoman woman);  
    
}
