package org.fengw.spring.configuration.service.impl;

import org.fengw.spring.configuration.service.IAccessService;

/**
 * &#64;Conditional 注解示例<br/>
 * 访问商品数据库
 *
 * @author Feng Wei
 *
 */
public class GoodsAccessServiceImpl implements IAccessService {

    @Override
    public void connect() {
        System.out.println("连接商品库");
    }
}
