package org.fengw.spring.configuration.service.impl;

import org.fengw.spring.configuration.service.IAccessService;

/**
 * &#64;Conditional 注解示例<br/>
 * 访问用户数据库
 *
 * @author Feng Wei
 */
public class UserAccessServiceImpl implements IAccessService {

    @Override
    public void connect() {
        System.out.println("连接用户库");
    }
}
