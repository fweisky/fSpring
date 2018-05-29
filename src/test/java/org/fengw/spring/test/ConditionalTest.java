package org.fengw.spring.test;

import org.fengw.spring.configuration.ConditionalConfig;
import org.fengw.spring.configuration.service.IAccessService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * &#64;Conditional 注解示例<br/>
 *
 * @author Feng Wei
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConditionalConfig.class)
public class ConditionalTest {

    @Autowired
    private IAccessService service;

    /**
     * 测试条件注解
     */
    @Test
    public void test() {
        service.connect();
    }
}
