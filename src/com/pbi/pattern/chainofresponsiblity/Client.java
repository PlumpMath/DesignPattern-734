/*
 * 文 件 名:  Client.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-18
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.chainofresponsiblity;

import java.util.ArrayList;
import java.util.Random;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-18]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Client
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        ArrayList<IWoman> list = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            list.add(new Woman(rand.nextInt(4), "~~~逛街~~~"));
        }
        
        Handler father = new Father(1);
        Handler husband = new Husband(2);
        Handler son = new Son(3);
        
        father.setNextHandler(husband);
        husband.setNextHandler(son);
        
        for (IWoman iWoman : list)
        {
            father.handleMessage(iWoman);
        }
        
        
    }
}
