/*
 * 文 件 名:  AbstractHummerModel.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-6-26
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.templatemethod;

/**
 * ①在抽象类中实现的方法称为具体方法
 * ②在抽象类中没有实现，在子类中去实现成为抽象方法；
 * ③钩子方法：抽象类中实现，子类可以重写
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-6-26]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public abstract class AbstractHummerModel
{
    protected abstract void start();
    
    protected abstract void engineBoom();
    
    protected abstract void stop();
    
    protected abstract void alarm();
    
    /**
     * 
     * 钩子方法
     * @return
     * @see [类、类#方法、类#成员]
     */
    protected boolean isAlarm()
    {
        return true;
    }
    
    /**
     * 
     * 模版方法：定义了调用其它方法的顺序，并且子类不能修改
     * 
     * @see [类、类#方法、类#成员]
     */
    final protected void run()
    {
        this.start();
        
        this.engineBoom();
        
        if (this.isAlarm())
        {
            this.alarm();
        }
        
        this.stop();
    }
    
    
}
