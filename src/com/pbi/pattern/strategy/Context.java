/*
 * 文 件 名:  Context.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-5-9
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.strategy;

/**
 * <存放妙计的香囊>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-5-9]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Context
{
    private IStrategy strategy;

    public Context(IStrategy strategy)
    {
        super();
        this.strategy = strategy;
    }
    
    public void operate()
    {
        strategy.operate();
    }
}
