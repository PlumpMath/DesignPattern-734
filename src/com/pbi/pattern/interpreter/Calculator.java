/*
 * 文 件 名:  Calculator.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-23
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-23]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Calculator
{
    //定义表达式
    private Expression expression;

    /** 
     * <默认构造函数>
     */
    public Calculator(String expStr)
    {
        //定义堆栈，安排运算的先后顺序
        Stack<Expression> stack = new Stack<Expression>();
        
        //表达式拆分为字节数组
        char[] charArray = expStr.toCharArray();
        
        //运算
        Expression left = null;
        Expression right = null;
        
        for (int i = 0; i < charArray.length; i++)
        {
            switch (charArray[i])
            {
                case '+':
                    left = stack.pop(); //返回栈顶的对象
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                    
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        
        this.expression = stack.pop();
    }
    
    public int run(HashMap<String, Integer> var)
    {
        return this.expression.interpreter(var);
    }
    
    
}
