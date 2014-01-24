/*
 * 文 件 名:  Client.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-23
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-23]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Client
{
    public static void main(String[] args)
    {
        try
        {
            String expStr = getExpStr();
            HashMap<String, Integer> var = getValue(expStr);

            Calculator calculator = new Calculator(expStr);
            System.out.println(" 运算结果为： " +expStr +" = " + calculator.run(var));
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("~~~输入异常~~~");
        }
        
    }
    
    /**
     * 获取输入的表达式
     * @return
     * @throws IOException
     * @see [类、类#方法、类#成员]
     */
    public static String getExpStr() throws IOException
    {
        System.out.println("--------請輸入表達式：  ");
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
    
    public static HashMap<String, Integer> getValue(String expStr) throws IOException
    {
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        
        //解析需要传递的参数的个数
        for (char ch : expStr.toCharArray())
        {
            if (ch != '+' && ch != '-')
            {
                if (!hashMap.containsKey(String.valueOf(ch)))
                {
                    System.out.println("请输入"+ch+"的值：");
                    //重复输入参数，不处理
                    String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    hashMap.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return hashMap;
    }
    
}



















