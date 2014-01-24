/*
 * 文 件 名:  Client.java
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

import com.pbi.pattern.bridge.Crop;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-9]
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
        //构建树
        Branch branch = compositeTree();
        
        //打印root信息
        System.out.println(branch.getInfo());
        System.out.println("-----------------------------------------------------");
        
        //打印所有信息
        System.out.println(getTreeInfo(branch));
    }
    
    /**
     * 
     * 构建树
     * @return
     * @see [类、类#方法、类#成员]
     */
    private static Branch compositeTree()
    {
        Branch manager = new Branch("ManagerA","M",100000);

        Branch groupLeaderA = new Branch("gla","GL",20000);
        Branch groupLeaderB = new Branch("glb","GL",30000);
        Branch groupLeaderC = new Branch("glc","GL",40000);
        
        manager.addLeaf(groupLeaderA);
        manager.addLeaf(groupLeaderB);
        manager.addLeaf(groupLeaderC);
        
        Branch leaderA = new Branch("la","L",5000);
        Branch leaderB = new Branch("lb","L",6000);
        
        groupLeaderA.addLeaf(leaderA);
        groupLeaderA.addLeaf(leaderB);

        Leaf leafA = new Leaf("lfa","LF",700);
        Leaf leafB = new Leaf("lfb","L",700);
        Leaf leafC = new Leaf("lfc","L",700);
        Leaf leafD = new Leaf("lfd","L",700);
        Leaf leafE = new Leaf("lfe","L",700);
        Leaf leafF = new Leaf("lff","L",700);
        Leaf leafG = new Leaf("lfg","L",700);
        
        leaderA.addLeaf(leafA);
        leaderA.addLeaf(leafB);
        leaderA.addLeaf(leafC);
        
        leaderB.addLeaf(leafD);
        
        groupLeaderB.addLeaf(leafE);
        groupLeaderB.addLeaf(leafF);
        groupLeaderB.addLeaf(leafG);
        
        return manager;
    }
    
    private static String getTreeInfo(Branch root)
    {
        StringBuilder sb = new StringBuilder();
        if(null == root)
        {
            return " params is null!";
        }
        ArrayList<Corp> leaves = root.getLeaf();
        
        for (Corp corp : leaves)
        {
            if (corp instanceof Leaf)
            {
                sb.append(corp.getInfo() +"\n");
            }
            else
            {
                sb.append(corp.getInfo()+"\n");
                sb.append(getTreeInfo((Branch)corp));
            }
        }
        
        return sb.toString();
    }
    
}
