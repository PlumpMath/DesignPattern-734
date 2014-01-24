/*
 * 文 件 名:  Client.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-6-27
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.builder;

import java.util.ArrayList;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-6-27]
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
        testWithDirector();
    }
    
    private static void testWithDirector()
    {
        Direactor direactor = new Direactor();
        CarModel benzA = direactor.getBenzAModel();
        benzA.run();
        
        CarModel bmwB = direactor.getBMWBModel();
        bmwB.run();
    }
    
    private static void testWithoutDirector()
    {
        ArrayList<String> sequence = new ArrayList<String>();
        BenzModel benz = new BenzModel();
        
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("stop");
        
        benz.setSequence(sequence);
        benz.run();
    }
    
}
