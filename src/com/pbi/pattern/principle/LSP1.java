/*
 * 文 件 名:  LSP1.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-8-13
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.principle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-8-13]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class LSP1
{
    
    /** 
     * <一句话功能简述>
     * <功能详细描述>
     * @param args
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args)
    {
        HashMap map = new HashMap();
        Father father = new Father();
        father.doSomething(map);
        
        // 调用继承自父类的方法
        Son son = new Son();
        son.doSomething(map);
        
    }
    
    static class Father
    {
        public Collection doSomething(Map map)
        {
            System.out.println("---Father 执行了!!!");
            return map.values();
        }
    }
    
    static class Son extends Father
    {
        /*
         * 方法的重载，重载父类的doSomething方法
         */
        public Collection doSomething(HashMap map)
        {
            System.out.println("---Son 执行了!!!");
            return map.values();
        }
    }
    
}
