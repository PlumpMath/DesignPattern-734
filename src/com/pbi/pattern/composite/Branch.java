/*
 * 文 件 名:  Branch.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-9
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.composite;

import java.util.ArrayList;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-9]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Branch extends Corp
{
    private ArrayList<Corp> subList;
    
    public Branch(String name, String position, int salary)
    {
        super(name, position, salary);
        subList = new ArrayList<Corp>();
    }
    
    public void addLeaf(Corp leaf)
    {
        this.subList.add(leaf);
    }
    
    public ArrayList<Corp> getLeaf()
    {
        return this.subList;
    }
    
}
