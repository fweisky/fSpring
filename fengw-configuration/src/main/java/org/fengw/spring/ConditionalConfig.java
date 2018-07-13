package org.fengw.spring;

import org.fengw.spring.condition.GoodsCondition;
import org.fengw.spring.condition.UserCondition;
import org.fengw.spring.service.IAccessService;
import org.fengw.spring.service.impl.GoodsAccessServiceImpl;
import org.fengw.spring.service.impl.UserAccessServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * &#64;Conditional 注解示例<br/>
 * 配置类
 *
 * @author Feng Wei
 */
@Component
public class ConditionalConfig {

    /**
     * 取得商品库实例
     * @return 商品库实例
     */
    @Bean
    @Conditional(GoodsCondition.class)
    public IAccessService getGoodsInstance() {
        return new GoodsAccessServiceImpl();
    }

    /**
     * 取得用户库实例
     * @return 用户库实例
     */
    @Bean
    @Conditional(UserCondition.class)
    public IAccessService getUserInstance() {
        return new UserAccessServiceImpl();
    }
}
