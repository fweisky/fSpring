package org.fengw.spring.around;

import org.springframework.stereotype.Component;

/**
 * 环绕通知：@Around
 *
 * @author Feng Wei
 */
@Component
public class AroundImpl implements IAround {

    @Override
    public int divide(int i, int j) {
        return i / j;
    }
}
