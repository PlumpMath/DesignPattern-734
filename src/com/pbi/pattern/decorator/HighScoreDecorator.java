/*
 * 文 件 名:  HighScoreDecorator.java
 * 版    权:  Beijing Jaeger Communication Electronic Technology Co., Ltd.Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2013-6-27
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.pbi.pattern.decorator;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2013-6-27]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class HighScoreDecorator extends Decorator
{

    public HighScoreDecorator(SchoolReport report)
    {
        super(report);
    }
    
    private void reportHighScore()
    {
        System.out.println("~~~語文最高分：70，英文最高分：80，數學最高分：60  ");
    }

    @Override
    public void report()
    {
        this.reportHighScore();
        super.report();
    }
    
    
    
}
