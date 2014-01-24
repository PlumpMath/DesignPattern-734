/*
 * 文 件 名:  Mediator.java
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
public class Mediator extends AbstractMediator
{
    
    private void buyComputer(int number)
    {
        int saleStatus = super.sale.getSaleStatus();
        
        //銷售狀況良好
        if (saleStatus > 80)
        {
            System.out.println("~~~采购IBM电脑：" + number +"台");
            super.stock.increase(number);
        }
        //銷售狀況不好，折半采购
        else
        {
            int buyNumber = number/2;
            System.out.println("~~~采购IBM电脑：" + buyNumber +"台");
        }
    }
    
    /**
     * 重载方法
     * @param str
     * @param objects
     */
    @Override
    public void execute(String str, Object... objects)
    {
        //采购
        if (str.equalsIgnoreCase("purchase.buy"))
        {
            this.buyComputer((int)objects[0]);
        }
        //销售
        else if (str.equalsIgnoreCase("sale.sell"))
        {
            this.sellComputer((int)objects[0]);
        }
        //折价销售
        else if (str.equalsIgnoreCase("sale.offsell"))
        {
            this.offSell();
        }
        //清仓处理
        else if (str.equalsIgnoreCase("stock.clear"))
        {
            this.clearStock();
        }
    }

    private void clearStock()
    {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }

    private void offSell()
    {
        System.out.println("~~~折价销售IBM电脑"+stock.getStockNumber()+"台");
    }

    private void sellComputer(int number)
    {
        //库存不足
        if (super.stock.getStockNumber() < number)
        {
            super.purchase.buyIBMComputer(number);
        }
        super.stock.decrease(number);
    }
    
}
