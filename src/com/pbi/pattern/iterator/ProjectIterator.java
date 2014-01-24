/*
 * 文 件 名:  ProgectIterator.java
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
public class ProjectIterator implements IProjectIterator
{
    private ArrayList<IProject> projectList = new ArrayList<IProject>();
    private int currentItem = 0;
    
    
    /** 
     * <默认构造函数>
     */
    public ProjectIterator(ArrayList<IProject> projectList)
    {
        super();
        this.projectList = projectList;
    }

    /**
     * 重载方法
     * @return
     */
    @Override
    public boolean hasNext()
    {
        boolean hasNext = true;
        if (this.currentItem >= projectList.size() || null == this.projectList.get(this.currentItem) )
        {
            hasNext = false;
        }
        return hasNext;
    }
    
    /**
     * 重载方法
     * @return
     */
    @Override
    public IProject next()
    {
        return this.projectList.get(this.currentItem++);
    }
    
    /**
     * 重载方法
     */
    @Override
    public void remove()
    {
    }
    
}
