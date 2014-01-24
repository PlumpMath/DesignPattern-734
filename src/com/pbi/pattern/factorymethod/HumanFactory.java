/*
 * 文 件 名:  HumanFactory.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-5-14
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.factorymethod;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.pbi.utils.ClassUtils;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-5-14]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class HumanFactory
{
    private static HashMap<String, IHuman> humans = new HashMap<String, IHuman>();
    
    public static IHuman create(Class clazz)
    {
        IHuman human = null;
        try
        {
            if (humans.containsKey(human))
            {
                human = humans.get(clazz.getSimpleName());
            }
            else
            {
                human = (IHuman)Class.forName(clazz.getName()).newInstance();
                humans.put(clazz.getSimpleName(), human);
            }
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
            System.out.println("~~~指定类型~~~");
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
            System.out.println("~~~类型定义错误~~~");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("~~~指定类型无法找到~~~");
        }
        return human;
    }
    
    public static IHuman create()
    {
        IHuman human = null;
        List<Class> allClassByInterface = ClassUtils.getAllClassByInterface(IHuman.class);
        if (null != allClassByInterface)
        {
            int random = new Random().nextInt(allClassByInterface.size());
            human = create(allClassByInterface.get(random));
        }
        return human;
    }
    
}
