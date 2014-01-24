/*
 * 文 件 名:  Client.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-19
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-19]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Client
{
    
    /** 
     * <一句话功能简述>
     * <功能详细描述>
     * @param args
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args)
    {
        IVisitor visitor = new Visitor();
        for (Employee employee : mockEmployee())
        {
            employee.accept(visitor);
        }
        System.out.println("薪资总额：" +visitor.getTotalSalary());
    }
    
    private static List<Employee> mockEmployee()
    {
        List<Employee> list = new ArrayList<>();
        
        CommonEmployee employee1 = new CommonEmployee();
        employee1.setGender(Employee.FEMALE);
        employee1.setName("张小三");
        employee1.setSalary(100);
        employee1.setJob("敲代碼的程序員");
        
        CommonEmployee employee2 = new CommonEmployee();
        employee2.setGender(Employee.MALE);
        employee2.setName("李小四");
        employee2.setSalary(200);
        employee2.setJob("敲代码的程序員");
        
        Manager manager = new Manager();
        manager.setGender(Employee.FEMALE);
        manager.setName("王老大");
        manager.setPerformance("&&**$$##@@");
        manager.setSalary(3000);
        
        list.add(employee1);
        list.add(employee2);
        list.add(manager);
        return list;
        
    }
    
}
