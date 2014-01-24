/*
 * 文 件 名:  LetterProcessImpl.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-6-26
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.facade;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-6-26]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class LetterProcessImpl implements ILetterProcess
{
    
    /**
     * 重载方法
     */
    @Override
    public void writeLetterContent(String content)
    {
        System.out.println("~~~Content:: " + content);
    }
    
    /**
     * 重载方法
     */
    @Override
    public void fillEnvelope(String address)
    {
        System.out.println("~~~Address:: " + address);
    }
    
    /**
     * 重载方法
     */
    @Override
    public void letterIntoEnvelope()
    {
        System.out.println("~~~put the letter into the envelope~~~");
    }
    
    /**
     * 重载方法
     */
    @Override
    public void sendLetter()
    {
        System.out.println("~~~letter is on the way ~~~");
    }
    
}
