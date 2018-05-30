package org.fengw.spring.test;

import org.fengw.spring.aop.IAop;
import org.fengw.spring.common.constant.ConfigFileConstant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * AOP的环绕通知
 *
 * @author Feng Wei
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value=ConfigFileConstant.PATH_SPRING_AOP_CONFIG)
public class AroundAopTest {

    @Autowired
    @Qualifier(value="aroundAopImpl")
    private IAop aop;

    /**
     * 测试加法
     */
    @Test
    public void test() {
        aop.divide(7, 0);
    }
}
