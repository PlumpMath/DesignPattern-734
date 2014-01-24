/*
 * 文 件 名:  GreenLight.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-5-9
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.strategy;

/**
 * <吴老太开绿灯>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-5-9]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class GreenLight implements IStrategy
{
    
    /**
     * 重载方法
     */
    @Override
    public void operate()
    {
        System.out.println("--->>>   找吴老太帮忙，给小备备开个绿灯！！");
    }
    
}
