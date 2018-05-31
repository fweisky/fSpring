package org.fengw.spring.configuration.service;

/**
 * &#64;Conditional 注解示例<br/>
 * 访问数据库
 *
 * @author Feng Wei
 */
public interface IAccessService {

    /**
     * 连接数据库
     */
    void connect();
}
