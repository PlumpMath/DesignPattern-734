/*
 * 文 件 名:  SymbolExpression.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-23
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.interpreter;


/**
 * 运算符号解析器
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-23]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public abstract class SymbolExpression extends Expression
{
    protected Expression left;
    protected Expression right;
    
    /** 
     * <默认构造函数>
     */
    public SymbolExpression(Expression left, Expression right)
    {
        super();
        this.left = left;
        this.right = right;
    }
    
}
