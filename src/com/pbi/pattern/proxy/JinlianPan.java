/*
 * 文 件 名:  JinlianPan.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-5-9
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.proxy;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-5-9]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class JinlianPan implements KindWoman
{
    
    /**
     * 重载方法
     */
    @Override
    public void makeEyesWithMan()
    {
        System.out.println("~~~JinLian make eyes to man ~~~");
    }
    
    /**
     * 重载方法
     */
    @Override
    public void happyWithMan()
    {
        System.out.println("~~~JinLian is so happy!!~~~");
    }
    
}
