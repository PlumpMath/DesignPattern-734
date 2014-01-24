/*
 * 文 件 名:  AbstractMediator.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-22
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.mediator;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-7-22]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public abstract class AbstractMediator
{
    protected Purchase purchase;
    
    protected Sale sale;
    
    protected Stock stock;
    
    /**
     * <默认构造函数>
     */
    public AbstractMediator()
    {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }
    
    /**
     * 
     * 中介模式的事件方法，处理多个对象之间的关系
     * @param str
     * @param objects
     * @see [类、类#方法、类#成员]
     */
    public abstract void execute(String str,Object ...objects);
    
}
