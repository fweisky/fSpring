package org.fengw.spring.test;

import org.fengw.spring.service.IHelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Hello
 *
 * @author Feng Wei
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class HelloTest {

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
