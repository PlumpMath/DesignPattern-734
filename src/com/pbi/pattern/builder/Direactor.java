/*
 * 文 件 名:  Direactor.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-6-27
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.builder;

import java.util.ArrayList;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-6-27]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Direactor
{
    private ArrayList<String> sequence = new ArrayList<String>();
    
    private BenzBuilder benzBuilder = new BenzBuilder();
    
    private BMWBuilder bmwBuilder = new BMWBuilder();
    
    public CarModel getBenzAModel()
    {
        /*
         * ArrayList和HashMap如果定义成类的成员变量
         * 在方法中调用一定要做一个clear操作，防止数据混乱；
         */
        this.sequence.clear();
        System.out.println("~~~ Benz A ~~~");
        this.sequence.add("start");
        this.sequence.add("stop");
        
        this.benzBuilder.setSequence(this.sequence);
        return this.benzBuilder.getCarModel();
    }
    
    public CarModel getBenzBModel()
    {
        this.sequence.clear();
        System.out.println("~~~Benz B ~~~");
        this.sequence.add("alarm");
        this.sequence.add("alarm");
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("engineBoom");
        this.sequence.add("stop");
        
        this.benzBuilder.setSequence(this.sequence);
        return this.benzBuilder.getCarModel();
    }
    
    public CarModel getBMWAModel()
    {
        this.sequence.clear();
        System.out.println("~~~BMW A ~~~");
        this.sequence.add("start");
        this.sequence.add("engineBoom");
        this.sequence.add("stop");
        
        this.bmwBuilder.setSequence(this.sequence);
        return this.bmwBuilder.getCarModel();
    }
    
    public CarModel getBMWBModel()
    {
        this.sequence.clear();
        System.out.println("~~~BMW B ~~~");
        this.sequence.add("start");
        this.sequence.add("engineBoom");
        this.sequence.add("engineBoom");
        this.sequence.add("engineBoom");
        this.sequence.add("stop");
        
        this.bmwBuilder.setSequence(this.sequence);
        return this.bmwBuilder.getCarModel();
    }
    
}
