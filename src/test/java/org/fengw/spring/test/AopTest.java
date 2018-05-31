package org.fengw.spring.test;

import org.fengw.spring.aop.advice.IAdvice;
import org.fengw.spring.aop.around.IAround;
import org.fengw.spring.aop.declareparents.China;
import org.fengw.spring.aop.declareparents.ILiaoNing;
import org.fengw.spring.common.constant.ConfigFileConstant;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
    private IAdvice advice;

    @Autowired
    private IAround aroud;

    @Autowired
    private China china;

    /**
     * 测试环绕通知
     */
    @Test
    public void testAroudDivide() {
        aroud.divide(7, 0);
    }

    /**
     * 测试前置、后置、返回通知
     */
    @Test
    public void testAroundAdd() {
        int num = advice.add(1, 2);
        Assert.assertEquals(num, 3);
    }

    /**
     * 测试前置、后置、返回、异常通知
     */
    @Test
    public void testAroundDivide() {
        advice.divide(7, 0);
    }

    /**
     * 测试前置、后置、返回通知
     */
    @Test
    public void testAroundMultip() {
        int num = advice.multiply(7, 7);
        Assert.assertEquals(num, 49);
    }

    /**
     * 测试前置、后置、返回通知
     */
    @Test
    public void testAroundSubtract() {
        int num = advice.subtract(7, 2);
        Assert.assertEquals(num, 5);
    }

    /**
     * 测试 @DeclareParents
     */
    @Test
    public void testHelloChina() {
        china.helloChina();
        ILiaoNing liaoNing = (ILiaoNing) china;
        liaoNing.helloLiaoNing();
    }
}
