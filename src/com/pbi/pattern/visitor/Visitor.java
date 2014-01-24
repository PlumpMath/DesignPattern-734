/*
 * 文 件 名:  Visitor.java
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
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-7-19]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Visitor implements IVisitor
{
    private static final int MANAGER_COEFFICIENT = 5;
    
    private static final int COMMON_EMPLOYEE_COEFFICIENT = 3;
    
    private int commonEmployeeTotalSalary;
    private int managerTotalSalary;
    /**
     * 
     * 打印員工報表
     * 
     * @param employee
     */
    @Override
    public void visit(CommonEmployee employee)
    {
        System.out.println(this.getCommonEmployeeInfo(employee));
        
        //计算员工薪资总额
        this.getCommonEmployeeTotalSalary(employee.getSalary());
        
    }
    
    /**
     * 
     * 打印经理报表
     * 
     * @param manager
     */
    @Override
    public void visit(Manager manager)
    {
        System.out.println(this.getManagerInfo(manager));
        
        //计算经理薪资总额
        this.getManagerTotalSalary(manager.getSalary());
    }
    
    /**
     * 
     * 获取员工工资总额
     * @return
     */
    @Override
    public int getTotalSalary()
    {
        return this.commonEmployeeTotalSalary + this.managerTotalSalary;
    }
    
    /**
     * 
     * 獲取員工基本信息
     * 
     * @param employee
     * @return
     * @see [类、类#方法、类#成员]
     */
    private String getBasicInfo(Employee employee)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("姓名：" + employee.getName() + "\t");
        sb.append("性别：" + (employee.getGender() == Employee.MALE ? "男" : "女") + "\t");
        sb.append("薪资：" + employee.getSalary() + "\t");
        
        return sb.toString();
    }
    
    private String getManagerInfo(Manager employee)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getBasicInfo(employee));
        sb.append("业绩："+employee.getPerformance()+"\n");
        
        return sb.toString();
    }
    
    private String getCommonEmployeeInfo(CommonEmployee employee)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getBasicInfo(employee));
        sb.append("職位："+employee.getJob()+"\n");
        
        return sb.toString();
    }

    private void getCommonEmployeeTotalSalary(int salary)
    {
         this.commonEmployeeTotalSalary = salary * COMMON_EMPLOYEE_COEFFICIENT;
    }

    private void getManagerTotalSalary(int salary)
    {
        this.managerTotalSalary = salary * MANAGER_COEFFICIENT;
    }
    
}
