/*
 * 文 件 名:  Client.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-16
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.observer;

import java.util.Observer;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-16]
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
        //定义观察者
        Observer lisi = new LiSi();
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        
        //定义被观察者
        HanFeizi hanfei = new HanFeizi();
        
        //添加观察者
        hanfei.addObserver(lisi);
        hanfei.addObserver(observer1);
        hanfei.addObserver(observer2);
        
        hanfei.haveBreakfast();
        
    }
    
}
