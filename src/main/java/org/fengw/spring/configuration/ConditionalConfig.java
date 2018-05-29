package org.fengw.spring.configuration;

import org.fengw.spring.configuration.condition.GoodsCondition;
import org.fengw.spring.configuration.condition.UserCondition;
import org.fengw.spring.configuration.service.IAccessService;
import org.fengw.spring.configuration.service.impl.GoodsAccessServiceImpl;
import org.fengw.spring.configuration.service.impl.UserAccessServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * &#64;Conditional 注解示例<br/>
 * 配置类
 *
 * @author Feng Wei
 *
 */
@Configuration
@ComponentScan
public class ConditionalConfig {

    /**
     * 取得商品库实例
     *
     * @return 商品库实例
     */
    @Bean
    @Conditional(GoodsCondition.class)
    public IAccessService getGoodsInstance() {
        return new GoodsAccessServiceImpl();
    }

    /**
     * 取得用户库实例
     *
     * @return 用户库实例
     */
    @Bean
    @Conditional(UserCondition.class)
    public IAccessService getUserInstance() {
        return new UserAccessServiceImpl();
    }
}
