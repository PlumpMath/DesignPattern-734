/*
 * 文 件 名:  Mail.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-22
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.prototype;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-7-22]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Mail
{
    private String receiver;
    
    private String subject;
    
    private String appellation;
    
    private String context;
    
    private String tail;
    
    /**
     * <默认构造函数>
     */
    public Mail(AdvTemplate advTemplate)
    {
        this.context = advTemplate.getAdbContext();
        this.subject = advTemplate.getAdvSubject();
    }
    
    public String getReceiver()
    {
        return receiver;
    }
    
    public void setReceiver(String receiver)
    {
        this.receiver = receiver;
    }
    
    public String getSubject()
    {
        return subject;
    }
    
    public void setSubject(String subject)
    {
        this.subject = subject;
    }
    
    public String getAppellation()
    {
        return appellation;
    }
    
    public void setAppellation(String appellation)
    {
        this.appellation = appellation;
    }
    
    public String getContext()
    {
        return context;
    }
    
    public void setContext(String context)
    {
        this.context = context;
    }
    
    public String getTail()
    {
        return tail;
    }
    
    public void setTail(String tail)
    {
        this.tail = tail;
    }
    
}
