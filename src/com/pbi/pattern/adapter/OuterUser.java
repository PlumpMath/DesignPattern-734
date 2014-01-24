/*
 * 文 件 名:  OuterUser.java
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
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-6-26]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class OuterUser implements IOuterUser
{
    
    /**
     * 重载方法
     * @return
     */
    @Override
    public HashMap<String, String> getUserBaseInfo()
    {
        HashMap<String, String> hmBaseInfos = new HashMap<String,String>();
        hmBaseInfos.put("userName", "UserName::   MM");
        hmBaseInfos.put("mobileNumber", "MobileNumber:: 5555");
        return hmBaseInfos;
    }
    
    /**
     * 重载方法
     * @return
     */
    @Override
    public HashMap<String, String> getUserOfficeInfo()
    {
        HashMap<String, String> hmOfficeInfos = new HashMap<String,String>();
        hmOfficeInfos.put("homeTelNumber", "HomeTelNumber:  3456");
        hmOfficeInfos.put("homeAddress", "HomeAddressr:  Beijing Road");
        return hmOfficeInfos;
    }
    
    /**
     * 重载方法
     * @return
     */
    @Override
    public HashMap<String, String> getUserHomeInfo()
    {
        HashMap<String, String> hmHomeInfos = new HashMap<String,String>();
        hmHomeInfos.put("jobPosition", "JobPosition:  assistent");
        hmHomeInfos.put("officeTelNumber", "OfficeTelNumber:  010");
        return hmHomeInfos;
    }
    
}
