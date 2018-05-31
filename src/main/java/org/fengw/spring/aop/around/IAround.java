package org.fengw.spring.aop.around;

/**
 * 环绕通知：@Around
 *
 * @author Feng Wei
 */
public interface IAround {

    /**
     * 除法
     * @param i 数值1
     * @param j 数值2
     * @return 相除后结果
     */
    int divide(int i, int j);
}
