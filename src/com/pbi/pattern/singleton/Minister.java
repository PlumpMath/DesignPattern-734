/*
 * 文 件 名:  Test.java
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
 * 大臣类
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-5-13]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Minister
{
    
    public static void main(String[] args)
    {
        EmperorI emperorI = EmperorI.getInstance();
        emperorI.say();
        
        EmperorI emperorII = EmperorI.getInstance();
        emperorII.say();
        
        EmperorI emperorIII = EmperorI.getInstance();
        emperorIII.say();
        
    }
    
}
