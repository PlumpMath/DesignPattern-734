/*
 * 文 件 名:  OuterUserInfoAdapter.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-6-26
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.adapter;

import java.util.HashMap;

/**
 * 适配器模式包含：类适配器模式（继承），对象适配器模式（调用）；
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-6-26]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class OuterUserInfoAdapter extends OuterUser implements IUserInfo
{
    private HashMap<String, String> baseInfos = super.getUserBaseInfo();
    
    private HashMap<String, String> homeInfos = super.getUserHomeInfo();
    
    private HashMap<String, String> officeInfos = super.getUserOfficeInfo();
    
    /**
     * 重载方法
     * 
     * @return
     */
    @Override
    public String getUserName()
    {
        String userName = null;
        if (null != baseInfos)
        {
            userName = baseInfos.get("userName");
            System.out.println("~~~" + userName);
        }
        return userName;
    }
    
    /**
     * 重载方法
     * 
     * @return
     */
    @Override
    public String getHomeAddress()
    {
        String homeAddress = null;
        if (null != homeInfos)
        {
            homeAddress = homeInfos.get("homeAddress");
            System.out.println("~~~" + homeAddress);
        }
        return homeAddress;
    }
    
    /**
     * 重载方法
     * 
     * @return
     */
    @Override
    public String getMobileNumber()
    {
        String mobileNumber = null;
        if (null != baseInfos)
        {
            mobileNumber = baseInfos.get("mobileNumber");
            System.out.println("~~~" + mobileNumber);
        }
        return mobileNumber;
    }
    
    /**
     * 重载方法
     * 
     * @return
     */
    @Override
    public String getOfficeTelNumber()
    {
        String officeTelNumber = null;
        if (null != officeInfos)
        {
            officeTelNumber = officeInfos.get("officeTelNumber");
            System.out.println("~~~" + officeTelNumber);
        }
        return officeTelNumber;
    }
    
    /**
     * 重载方法
     * 
     * @return
     */
    @Override
    public String getJobPosition()
    {
        String jobPosition = null;
        if (null != officeInfos)
        {
            jobPosition = officeInfos.get("jobPosition");
            System.out.println("~~~" + jobPosition);
        }
        return jobPosition;
    }
    
    /**
     * 重载方法
     * 
     * @return
     */
    @Override
    public String getHomeTelNumber()
    {
        String homeTelNumber = null;
        if (null != homeInfos)
        {
            homeTelNumber = homeInfos.get("homeTelNumber");
            System.out.println("~~~" + homeTelNumber);
        }
        return homeTelNumber;
    }
    
}
