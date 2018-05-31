package org.fengw.spring.aop.advice;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
@Aspect
public class AdviceAspect {

    /**
     * 后置通知：通知方法会在目标方法返回或抛出异常后调用
     * @param jp 连接点
     */
    @After(value="singlePointcut()")
    public void afterMethod(JoinPoint jp){
        String methodName = jp.getSignature().getName();
        System.out.println(String.format("后置通知  |  方法名=%s", methodName));
    }

    /**
     * 返回通知：通知方法会在目标方法返回后调用
     * @param jp 连接点
     * @param result 返回结果
     */
    @AfterReturning(value="singlePointcut()", returning="result")
    public void afterReturningMethod(JoinPoint jp, Object result){
        String methodName = jp.getSignature().getName();
        System.out.println(String.format("返回通知  |  方法名 =%s  |  结果=%s", methodName, result));
    }

    /**
     * 异常通知：通知方法会在目标方法抛出异常后调用
     * @param jp 连接点
     * @param e 异常
     */
    @AfterThrowing(value="singlePointcut()", throwing="e")
    public void afterThorwingMethod(JoinPoint jp, Exception e){
        String methodName = jp.getSignature().getName();
        System.out.println(String.format("异常通知  |  方法名=%s  |  异常=%s", methodName, e));
    }

    /**
     * 前置通知：通知方法会在目标方法调用之前执行
     * @param jp 连接点
     */
    @Before(value="singlePointcut()")
    public void beforeMethod(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        System.out.println(String.format("前置通知  |  方法名=%s  |  参数=%s", methodName, Arrays.asList(jp.getArgs())));
    }

    /**
     * 定义单一切点<br/>
     * 前置通知、后置通知、返回通知、异常通知都可以应用此规则
     */
    @Pointcut(value="execution(* org.fengw.spring.aop.advice.AdviceImpl.*(..))")
    public void singlePointcut() {}
}
