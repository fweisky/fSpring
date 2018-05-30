package org.fengw.spring.aop;

/**
 * AOP
 *
 * @author Feng Wei
 *
 */
public interface IAop {

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
