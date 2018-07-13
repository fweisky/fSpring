package org.fengw.spring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Bean的作用域： 单例（Singleton）
 *
 * @author Feng Wei
 */
@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Singleton {

    /** 公有静态变量 */
    public static String publicStaticVariate;

    /** 私有静态变量 */
    private static String privateStaticVariate;

    /** 公有变量 */
    public String publicVariate;

    /** 私有变量 */
    private String privateVariate;

    /**
     * @return privateStaticVariate
     */
    public static String getPrivateStaticVariate() {
        return privateStaticVariate;
    }
    /**
     * @param privateStaticVariate 要设置的 privateStaticVariate
     */
    public static void setPrivateStaticVariate(String privateStaticVariate) {
        Singleton.privateStaticVariate = privateStaticVariate;
    }
    /**
     * @return privateVariate
     */
    public String getPrivateVariate() {
        return privateVariate;
    }
    /**
     * @param privateVariate 要设置的 privateVariate
     */
    public void setPrivateVariate(String privateVariate) {
        this.privateVariate = privateVariate;
    }
}
