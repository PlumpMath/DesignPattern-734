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
package com.pbi.pattern.singleton;

/**
 * 此种单例模式存在风险（饿汉式）
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-5-13]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class EmperorI
{
    private static EmperorI emperor = null;
    
    private EmperorI()
    {
        super();
    }
    
    /**
     * 
     * <风险分析：
     *      ①假设存在两个线程，线程A和线程B，
     *      ②当线程A执行到 emperor = new Emperor时，正在申请内存分配，
     *          此时线程B执行到 if(null == emperor),此时的返回结果不确定是true还是false
     *          若是true，此时线程B 也创建了新的对象，导致业务逻辑的混乱>
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static EmperorI getInstance()
    {
        if (null == emperor)
        {
            emperor = new EmperorI();
        }
        return emperor;
    }
    
    public static void say()
    {
        System.out.println("~~~ I am the Emperor XXX ~~~");
    }
    
}
