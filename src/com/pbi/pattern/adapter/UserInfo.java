/*
 * 文 件 名:  UserInfo.java
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
public class UserInfo implements IUserInfo
{

    @Override
    public String getUserName()
    {
        System.out.println("~~~UserName ::  gtsong " );
        return null;
    }

    @Override
    public String getHomeAddress()
    {
        System.out.println("~~~HomeAddress:: Peking ");
        return null;
    }

    @Override
    public String getMobileNumber()
    {
        System.out.println("~~~MobileNumber:: 110  ");
        return null;
    }

    @Override
    public String getOfficeTelNumber()
    {
        System.out.println("~~~OfficeTelNumber::  101 ");
        return null;
    }

    @Override
    public String getJobPosition()
    {
        System.out.println("~~~JobPosition::  boss  ");
        return null;
    }

    @Override
    public String getHomeTelNumber()
    {
        System.out.println("~~~ HomeTelNumber::  *** ");
        return null;
    }
    
}
