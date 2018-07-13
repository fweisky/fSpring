package org.fengw.spring.test;

import org.fengw.spring.service.IJtaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * JTA分布式事务
 *
 * @author Feng Wei
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class JtaTest {

    @Autowired
    private IJtaService service;

    /**
     * 测试插入
     */
    @Test
    public void testInsert() {
        service.insert();
    }
}
