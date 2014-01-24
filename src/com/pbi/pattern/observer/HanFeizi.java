/*
 * 文 件 名:  HanFeizi.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-16
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.observer;

import java.util.Observable;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-7-16]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class HanFeizi extends Observable implements IHanFeiZi 
{
    /**
     * 重载方法
     */
    @Override
    public void haveBreakfast()
    {
        System.out.println("~~~ FF  start to have breakfast ~~~");
        
        //通知所有的观察者
        super.setChanged();
        super.notifyObservers("FF have breakfast");
    }
    
    /**
     * 重载方法
     */
    @Override
    public void haveFun()
    {
        System.out.println("~~~FF have fun ~~~");
        
        super.setChanged();
        super.notifyObservers("FF have fun");
    }
    
}
