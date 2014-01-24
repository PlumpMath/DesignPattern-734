/*
 * 文 件 名:  Crop.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-9
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.composite;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-9]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public abstract class Corp
{
    private String name;
    private String position; 
    private int salary;
    /** 
     * <默认构造函数>
     */
    public Corp(String name, String position, int salary)
    {
        super();
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    
    public String getInfo()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("姓名 : " +this.name);
        sb.append("\t  职位："+this.position);
        sb.append("\t  薪水"+this.salary);
        
        return sb.toString();
    }
}
