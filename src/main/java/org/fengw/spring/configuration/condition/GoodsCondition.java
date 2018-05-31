package org.fengw.spring.configuration.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * &#64;Conditional 注解示例<br/>
 * 商品库判断条件类
 *
 * @author Feng Wei
 */
public class GoodsCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 返回true，相对应的类被创建
        return true;
    }
}
