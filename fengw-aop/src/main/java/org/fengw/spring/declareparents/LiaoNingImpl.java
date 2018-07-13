package org.fengw.spring.declareparents;

import org.springframework.stereotype.Component;

/**
 * 引入新方法：@DeclareParents
 *
 * @author Feng Wei
 */
@Component
public class LiaoNingImpl implements ILiaoNing {

    /**
     * 你好辽宁
     */
    @Override
    public void helloLiaoNing() {
        System.out.println("你好辽宁");
    }
}
