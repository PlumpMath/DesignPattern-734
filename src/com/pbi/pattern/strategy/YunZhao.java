/*
 * 文 件 名:  Test.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-5-9
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.strategy;

/**
 * <使用锦囊>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-5-9]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class YunZhao
{
    public static void main(String[] args)
    {
        Context context;
        System.out.println("~~~到了阿权的地盘~~~~打开锦囊1~~~~");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n\n\n\n");
        
        
        
        System.out.println("~~~小备备乐不思蜀~~~~打开锦囊2~~~~");
        context =new Context(new GreenLight());
        context.operate();
        System.out.println("\n\n\n\n");
        
        
        
        System.out.println("~~~阿权派小弟追杀~~~~打开锦囊3~~~~");
        context =new Context(new RunAway());
        context.operate();
        System.out.println("\n\n\n\n");
    }
}
