/*
 * 文 件 名:  Father.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-18
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.chainofresponsiblity;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-7-18]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Father extends Handler
{
    
    public Father(int level)
    {
        super(level);
    }

    /**
     * 重载方法
     * @param woman
     */
    @Override
    public void response(IWoman woman)
    {
        System.out.println("~~~女兒向父親請示~~~ ");
        System.out.println("~~~老爸，我要 "+woman.getRequest());
        System.out.println("~~~老爸 同意\n\n");
    }
    
    
}
