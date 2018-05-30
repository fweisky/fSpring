package org.fengw.spring.aop;

import org.springframework.stereotype.Component;

/**
 * AOP的环绕通知
 *
 * @author Feng Wei
 *
 */
@Component
public class AroundAopImpl implements IAop {

    @Override
    public int add(int i, int j) {
        return i + j;
    }

    @Override
    public int divide(int i, int j) {
        return 0;
    }

    @Override
    public int multiply(int i, int j) {
        return 0;
    }

    @Override
    public int subtract(int i, int j) {
        return 0;
    }
}
