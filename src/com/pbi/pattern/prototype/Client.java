/*
 * 文 件 名:  Client.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-7-22
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.prototype;

import java.util.Random;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2013-7-22]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Client
{
    private static int MAX_COUNT = 6;
    
    /**
     * <一句话功能简述> <功能详细描述>
     * 
     * @param args
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args)
    {
        int i = 0;
        
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX 銀行版權所有");
        
        while (i < MAX_COUNT)
        {
            mail.setAppellation(getRandString(5) + "先生（女士）");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8)+".com");
            
            sendMail(mail);
            i++;
        }
    }
    
    public static void sendMail(Mail mail)
    {
        System.out.println("標題： " + mail.getSubject() + "\t 收件人：" + mail.getReceiver() + "\t …… 發送成功！");
    }
    
    /**
     * 
     * 获取指定长度的随机字符串
     * 
     * @param maxLength
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static String getRandString(int maxLength)
    {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++)
        {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
    
}
