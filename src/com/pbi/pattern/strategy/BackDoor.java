/*
 * 文 件 名:  BackDoor.java
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
 * <乔老头开后门>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-5-9]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class BackDoor implements IStrategy
{
    
    /**
     * 重载方法
     */
    @Override
    public void operate()
    {
        System.out.println("--->>>     找乔老头帮忙，给阿权施加压力~~~");
    }
    
}
