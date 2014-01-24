/*
 * 文 件 名:  Project.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-6-28
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.iterator;

import java.util.ArrayList;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-6-28]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Project implements IProject
{
    private ArrayList<IProject> projectList = new ArrayList<IProject>();
    private String name;
    private int num;
    private int cost;
    
    /** 
     * <默认构造函数>
     */
    public Project()
    {
        super();
    }
    
    /** 
     * <默认构造函数>
     */
    public Project(String name, int num, int cost)
    {
        super();
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    /**
     * 重载方法
     * @param name
     * @param num
     * @param cost
     */
    @Override
    public void add(String name, int num, int cost)
    {
        this.projectList.add(new Project(name, num, cost));
    }
    
    /**
     * 重载方法
     * @return
     */
    @Override
    public String getProgectInfo()
    {
        String info = "项目名称： " + this.name
                +"\t 项目人数：" + this.num
                +"\t 项目费用：" + this.cost;
        return info;
    }

    @Override
    public IProjectIterator iterator()
    {
        return new ProjectIterator(this.projectList);
    }
    
}
