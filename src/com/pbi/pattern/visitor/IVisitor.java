/*
 * 文 件 名:  IVisitor.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-19
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.visitor;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-19]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface IVisitor
{
    //访问普通员工
    public void visit(CommonEmployee employee);
    
    //访问部门经理
    public void visit(Manager manager);
    
    //获取员工工资总额
    public int getTotalSalary();
}
