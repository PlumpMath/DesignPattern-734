/*
 * 文 件 名:  Client.java
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
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-22]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Client
{
    
    /** 
     * <一句话功能简述>
     * <功能详细描述>
     * @param args
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args)
    {
        AbstractMediator mediator = new Mediator();
        
        //采购
        System.out.println("-------采购电脑-----------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);
        
        //销售
        System.out.println("\n-------销售电脑---------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        
        //库存
        System.out.println("\n--------库存电脑----------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
        
    }
    
}
