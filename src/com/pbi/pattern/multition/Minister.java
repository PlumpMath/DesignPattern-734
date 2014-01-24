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
package com.pbi.pattern.multition;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-5-14]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Minister
{
    
    /**
     * <一句话功能简述> <功能详细描述>
     * 
     * @param args
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args)
    {
        int maxMinisterNumber = 10;
        for (int i = 0; i < maxMinisterNumber; i++)
        {
            Emperor emperor = Emperor.getInstance();
            String info = emperor.getInfo();
            System.out.println("~~~Minister :  " + i + " visit " + info);
        }
    }
    
}
