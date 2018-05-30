package org.fengw.spring.test;

import org.fengw.spring.aop.IAop;
import org.fengw.spring.common.constant.ConfigFileConstant;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * AOP
 *
 * @author Feng Wei
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value=ConfigFileConstant.PATH_SPRING_AOP_CONFIG)
public class AopTest {

    @Autowired
    @Qualifier(value="aopImpl")
    private IAop aop;

    /**
     * 测试加法
     */
    @Test
    public void testAdd() {
        int num = aop.add(1, 2);
        Assert.assertEquals(num, 3);
    }

    /**
     * 测试除法
     */
    @Test
    public void testDivide() {
        aop.divide(7, 0);
    }

    /**
     * 测试乘法
     */
    @Test
    public void testMultip() {
        int num = aop.multiply(7, 7);
        Assert.assertEquals(num, 49);
    }

    /**
     * 测试减法
     */
    @Test
    public void testSubtract() {
        int num = aop.subtract(7, 2);
        Assert.assertEquals(num, 5);
    }
}
