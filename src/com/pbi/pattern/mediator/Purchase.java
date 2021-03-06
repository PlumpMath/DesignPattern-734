/*
 * 文 件 名:  Purchase.java
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
public class Purchase extends AbstractColleague
{

    public Purchase(AbstractMediator mediator)
    {
        super(mediator);
    }
    
    /**
     * 采购
     * @param number
     * @see [类、类#方法、类#成员]
     */
    public void buyIBMComputer(int number)
    {
        super.mediator.execute("purchase.buy", number);
    }
    
    public void refuseBuyIBM()
    {
        System.out.println("不再采购IBM电脑");
    }
    
}
