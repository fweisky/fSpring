package org.fengw.spring.aop;

import org.springframework.stereotype.Component;

/**
 * AOP
 *
 * @author Feng Wei
 *
 */
@Component
public class AopImpl implements IAop {

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
