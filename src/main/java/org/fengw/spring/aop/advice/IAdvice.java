package org.fengw.spring.aop.advice;

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
 *
 */
public interface IAdvice {

    /**
     * 加法
     *
     * @param i 数值1
     * @param j 数值2
     * @return 相加后结果
     */
    int add(int i, int j);

    /**
     * 减法
     *
     * @param i 数值1
     * @param j 数值2
     * @return 相减后结果
     */
    int divide(int i, int j);

    /**
     * 乘法
     *
     * @param i 数值1
     * @param j 数值2
     * @return 相乘后结果
     */
    int multiply(int i, int j);

    /**
     * 除法
     *
     * @param i 数值1
     * @param j 数值2
     * @return 相除后结果
     */
    int subtract(int i, int j);
}
