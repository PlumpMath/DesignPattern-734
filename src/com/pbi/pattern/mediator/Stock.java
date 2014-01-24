/*
 * 文 件 名:  Stock.java
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
public class Stock extends AbstractColleague
{
    private static  int COMPUTER_NUMBER = 100;
    
    public Stock(AbstractMediator mediator)
    {
        super(mediator);
    }
    
    /**
     * 增加庫存量
     * @param number
     * @see [类、类#方法、类#成员]
     */
        public void increase(int number)
        {
            COMPUTER_NUMBER += number;
            System.out.println("~~~库存量为：" + COMPUTER_NUMBER);
        }
    
    public void decrease(int number)
    {
        COMPUTER_NUMBER -= number;
        System.out.println("~~~库存量为：" + COMPUTER_NUMBER);
    }
    
    /**
     * 获取库存量信息
     * @return
     * @see [类、类#方法、类#成员]
     */
    public int getStockNumber()
    {
        return COMPUTER_NUMBER;
    }
    
    /**
     * 清仓处理
     * @see [类、类#方法、类#成员]
     */
    public void clearStock()
    {
        System.out.println("~~~清仓存货数量为："+COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
    
}
