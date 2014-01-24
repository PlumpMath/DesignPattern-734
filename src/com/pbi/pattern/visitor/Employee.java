/*
 * 文 件 名:  Employee.java
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
public abstract class Employee
{
    public static final int MALE = 0;
    public static final int FEMALE = 1;
    
    private String name;
    private int salary;
    private int gender;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getSalary()
    {
        return salary;
    }
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    public int getGender()
    {
        return gender;
    }
    public void setGender(int gender)
    {
        this.gender = gender;
    }
    
    public abstract void accept(IVisitor visitor);
    
}
