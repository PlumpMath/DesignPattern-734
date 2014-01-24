/*
 * 文 件 名:  Test.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-5-14
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.factorymethod;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-5-14]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class WaNv
{
    
    /** 
     * <一句话功能简述>
     * <功能详细描述>
     * @param args
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args)
    {
        for (int i = 0; i < 30; i++)
        {
            System.out.println();
            System.out.println();
            System.out.println();
            
            IHuman human = HumanFactory.create();
            human.skinColor();
            human.cry();
            human.laugh();
            
            try
            {
                Thread.sleep(2*1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    
    private static void test1()
    {
        IHuman whiteGuy = HumanFactory.create(WhiteHuman.class);
        whiteGuy.skinColor();
        whiteGuy.cry();
        whiteGuy.laugh();
        
        IHuman blackGuy = HumanFactory.create(BlackHuman.class);
        blackGuy.skinColor();
        blackGuy.cry();
        blackGuy.laugh();
        
        IHuman yellowGuy = HumanFactory.create(YellowHuman.class);
        yellowGuy.skinColor();
        yellowGuy.cry();
        yellowGuy.laugh();
    }
}
