/*
 * 文 件 名:  CarModel.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-6-27
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.builder;

import java.util.ArrayList;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-6-27]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public abstract class CarModel
{
    private ArrayList<String> sequence = new ArrayList<String>();
    
    public abstract void start();
    
    public abstract void engineBoom();
    
    public abstract void stop();
    
    public abstract void alarm();
    
    final public void run()
    {
        if (null != sequence)
        {
            for (String method : sequence)
            {
                if (method.equalsIgnoreCase("start"))
                {
                    this.start();
                }
                if (method.equalsIgnoreCase("engineBoom"))
                {
                    this.engineBoom();
                }
                if (method.equalsIgnoreCase("stop"))
                {
                    this.stop();
                }
                if (method.equalsIgnoreCase("alarm"))
                {
                    this.alarm();
                }
            }
        }
    }
    
    final public void setSequence(ArrayList<String> sequence)
    {
        this.sequence = sequence;
    }
}
