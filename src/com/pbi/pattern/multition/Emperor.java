/*
 * 文 件 名:  Emperor.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-5-13
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.multition;

import java.util.ArrayList;
import java.util.Random;

/**
 * 多例模式
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-5-13]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Emperor
{
    private static int maxEmperorNumber = 2; // 实例个数的最大值
    private static int currentEmperor = 0; // 当前实例是哪一个
    
    private static ArrayList<String> emperorInfoList = new ArrayList<String>(maxEmperorNumber); // 实例基本信息集合
    private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>(maxEmperorNumber);// 实例集合
    
    static
    {
        for (int i = 1; i <= maxEmperorNumber; i++)
        {
            emperorList.add(new Emperor("~~~Emperor~~~" + i));
        }
    }
    
    private Emperor()
    {
        super();
    }
    
    private Emperor(String info)
    {
        super();
        emperorInfoList.add(info);
    }
    
    public static Emperor getInstance()
    {
        Random random = new Random();
        currentEmperor = random.nextInt(maxEmperorNumber);
        return (Emperor)emperorList.get(currentEmperor);
    }
    
    public static String getInfo()
    {
        return (String)emperorInfoList.get(currentEmperor);
    }
    
}
