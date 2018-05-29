package org.fengw.spring.test;

import org.fengw.spring.common.constant.ConfigFileConstant;
import org.fengw.spring.hello.service.IHelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Hello
 *
 * @author Feng Wei
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value=ConfigFileConstant.PATH_SPRING_JDBC_TEMPLATE_CONFIG)
public class HelloServiceTest {

    @Autowired
    private IHelloService service;

    /**
     * 测试Hello
     */
    @Test
    public void testHello() {
        service.hello();
    }
}
