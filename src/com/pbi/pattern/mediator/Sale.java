/*
 * 文 件 名:  Sale.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-22
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.mediator;

import java.util.Random;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-22]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Sale extends AbstractColleague
{

    public Sale(AbstractMediator mediator)
    {
        super(mediator);
    }
    
    /**
     * 折價處理
     * @see [类、类#方法、类#成员]
     */
    public void offSale()
    {
        super.mediator.execute("sale.offsell");
    }
    
    /**
     * 銷售IBM電腦
     * @param number
     * @see [类、类#方法、类#成员]
     */
    public void sellIBMComputer(int number)
    {
        super.mediator.execute("sale.sell", number);
        System.out.println("~~~销售IBM电脑"+number+"台");
    }
    
    /**
     * 反馈销售状况
     * @return
     * @see [类、类#方法、类#成员]
     */
    public int getSaleStatus()
    {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("~~~IBM电脑销售状况为：" + saleStatus);
        return saleStatus;
    }
    
}
