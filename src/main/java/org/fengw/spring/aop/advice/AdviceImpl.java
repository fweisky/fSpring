package org.fengw.spring.aop.advice;

import org.springframework.stereotype.Component;

/**
 * <pre>
 * 前置通知：@Before
 * 后置通知：@Afte
 * 返回通知：@AfterReturning
 * 异常通知：@AfterThrowing
 * 定义切点：@Pointcut
 * </pre>
 *
 * @author Feng Wei
 */
@Component
public class AdviceImpl implements IAdvice {

    @Override
    public int add(int i, int j) {
        System.out.println("AopImpl#add()");
        return i + j;
    }

    @Override
    public int divide(int i, int j) {
        System.err.println("AopImpl#divide()");
        return i / j;
    }

    @Override
    public int multiply(int i, int j) {
        System.out.println("AopImpl#multiply()");
        return i * j;
    }

    @Override
    public int subtract(int i, int j) {
        System.out.println("AopImpl#subract()");
        return i - j;
    }
}
