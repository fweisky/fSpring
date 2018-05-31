package org.fengw.spring.configuration.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * &#64;Conditional 注解示例<br/>
 * 用户库判断条件类
 *
 * @author Feng Wei
 */
public class UserCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 返回false，相对应的类不创建
        return false;
    }
}
