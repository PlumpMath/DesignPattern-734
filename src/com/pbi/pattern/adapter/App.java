/*
 * 文 件 名:  App.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-6-26
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.adapter;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-6-26]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class App
{
    public static void main(String[] args)
    {
        //testWithoutAdapter();
        testWithAdapter();
    }
    
    private static void testWithoutAdapter()
    {
        IUserInfo girls = new UserInfo();
        for (int i = 0; i < 101; i++)
        {
            girls.getMobileNumber();
        }
    }
    
    private static void testWithAdapter()
    {
        OuterUserInfoAdapter adapter = new OuterUserInfoAdapter();
        for (int i = 0; i < 101; i++)
        {
            adapter.getMobileNumber();
            adapter.getUserName();
        }
    }
}
