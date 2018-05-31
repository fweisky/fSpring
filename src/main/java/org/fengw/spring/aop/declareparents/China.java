package org.fengw.spring.aop.declareparents;

import org.springframework.stereotype.Component;

/**
 * 引入新方法：@DeclareParents
 *
 * @author Feng Wei
 */
@Component
public class China {

    /**
     * 你好中国
     */
    public void helloChina() {
        System.out.println("你好中国");
    }
}
