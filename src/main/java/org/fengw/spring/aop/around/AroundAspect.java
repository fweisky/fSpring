package org.fengw.spring.aop.around;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 环绕通知：@Around
 *
 * @author Feng Wei
 */
@Component
@Aspect
public class AroundAspect {

    /**
     * 环绕通知：通知方法会在目标方法调用前、后、发生异常时执行
     * @param jp 连接点
     */
    @Around(value="execution(* org.fengw.spring.aop.around.AroundImpl.*(..))")
    public void aroundMethod(ProceedingJoinPoint jp){
        String methodName = jp.getSignature().getName();

        try {
            System.out.println(String.format("环绕通知-->前置通知  |  方法名=%s  |  参数=%s", methodName, Arrays.asList(jp.getArgs())));
            Object result = jp.proceed();
            System.out.println(String.format("环绕通知-->返回通知  |  方法名=%s  |  结果=%s", methodName, result));
        } catch (Throwable e) {
            System.out.println(String.format("环绕通知-->异常通知  |  方法名=%s  |  异常=%s", methodName, e));
        }

        System.out.println(String.format("环绕通知-->后置通知  |  方法名=%s", methodName));
    }
}
