/*
 * 文 件 名:  ClassUtils.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-5-14
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-5-14]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class ClassUtils
{
    /**
     * 
     * 返回指定接口的所有实现类
     * 
     * @param clazz
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static List<Class> getAllClassByInterface(Class clazz)
    {
        List<Class> classList = new ArrayList<Class>();
        
        if (clazz.isInterface())
        {
            // 获取当前的包名
            String packageName = clazz.getPackage().getName();
            
            try
            {
                // 获取当前包下，及子包下所有的类
                List<Class> allClass = getClasses(packageName);
                
                // 判断是否是同一个接口
                for (int i = 0; i < allClass.size(); i++)
                {
                    // 判断是不是一个接口
                    if (clazz.isAssignableFrom(allClass.get(i)))
                    {
                        if (!clazz.equals(allClass.get(i)))
                        {
                            classList.add(allClass.get(i));
                        }
                    }
                }
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("~~~参数类型错误，参数非接口类型~~~");
        }
        
        return classList;
        
    }
    
    /**
     * 
     * 从一个包中查找出所有的的类，在jar包中不能查找
     * 
     * @param packageName
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     * @see [类、类#方法、类#成员]
     */
    private static List<Class> getClasses(String packageName)
        throws IOException, ClassNotFoundException
    {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs = new ArrayList<File>();
        while (resources.hasMoreElements())
        {
            URL resource = (URL)resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        
        ArrayList<Class> classes = new ArrayList<Class>();
        for (File directory : dirs)
        {
            classes.addAll(findClasses(directory, packageName));
        }
        
        return classes;
        
    }
    
    private static List<Class> findClasses(File directory, String packageName)
        throws ClassNotFoundException
    {
        List<Class> classes = new ArrayList<Class>();
        if (!directory.exists())
        {
            return classes;
        }
        
        File[] files = directory.listFiles();
        for (File file : files)
        {
            if (file.isDirectory())
            {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            }
            else if (file.getName().endsWith(".class"))
            {
                classes.add(Class.forName(packageName + "." + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }
    
}
