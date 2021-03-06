/*
 * 文 件 名:  LiSi.java
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
public class LiSi implements Observer
{
    
    /**
     * 重载方法
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg)
    {
        System.out.println("--->>>LiSi 观察FF --------");
        this.report2QinShiHuang(arg.toString());
        System.out.println("--->>>干的不错，得到两根胡萝卜~~~");
    }
    
    private void report2QinShiHuang(String context)
    {
        System.out.println("报告： FF 活动了" + context);
    }
    
}
