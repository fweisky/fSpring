package org.fengw.spring.declareparents;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * 引入新方法：@DeclareParents
 *
 * @author Feng Wei
 */
@Component
@Aspect
public class DeclareParentsAspect {

    /**
     * 引入新方法：辽宁
     */
    @DeclareParents(value="org.fengw.spring.aop.declareparents.China+", defaultImpl=LiaoNingImpl.class)
    public ILiaoNing liaoNing;
}
