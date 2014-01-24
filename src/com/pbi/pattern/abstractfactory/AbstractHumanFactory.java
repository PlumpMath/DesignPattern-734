/*
 * 文 件 名:  AbstractHumanFactory.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-6-25
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.abstractfactory;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-6-25]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public abstract class AbstractHumanFactory implements IHumanFactory
{
    protected IHuman createHuman(HumanEnum humanEnum)
    {
        IHuman human = null;
        
        if (!humanEnum.getValue().equals(""))
        {
            //创建实例
            try
            {
                human = (IHuman)Class.forName(humanEnum.getValue()).newInstance();
            }
            catch (InstantiationException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            catch (IllegalAccessException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            catch (ClassNotFoundException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return human;
    }
}
