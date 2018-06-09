package org.fengw.spring.test;

import org.fengw.spring.common.constant.ConfigFileConstant;
import org.fengw.spring.scope.Prototype;
import org.fengw.spring.scope.Singleton;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Bean的作用域
 *
 * @author Feng Wei
 */
@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(value=ConfigFileConstant.PATH_SPRING_SCOPE_CONFIG)
public class ScopeTest {

    /** 单例（Singleton）实例1 */
    @Autowired
    private Singleton singleton1;

    /** 单例（Singleton）实例2 */
    @Autowired
    private Singleton singleton2;

    /** 原型（Prototype）实例1 */
    @Autowired
    private Prototype prototype1;

    /** 原型（Prototype）实例2 */
    @Autowired
    private Prototype prototype2;

    /**
     * 测试Bean的作用域： 单例（Singleton）
     */
    @Test
    public void testSingleton() {

        // 实例1：赋值
        singleton1.publicStaticVariate = "1";
        singleton1.publicVariate = "2";
        singleton1.setPrivateStaticVariate("3");
        singleton1.setPrivateVariate("4");

        // 实例2：取值
        // 由于是单例模式，实例2取得值与实例1赋值相同
        Assert.assertEquals(singleton2.publicStaticVariate, "1");
        Assert.assertEquals(singleton2.publicVariate, "2");
        Assert.assertEquals(singleton2.getPrivateStaticVariate(), "3");
        Assert.assertEquals(singleton2.getPrivateVariate(), "4");
    }

    /**
     * 测试Bean的作用域： 原型（Prototype）
     */
    @Test
    public void testPrototype() {

        // 实例1：赋值
        prototype1.publicStaticVariate = "1";
        prototype1.publicVariate = "2";
        prototype1.setPrivateStaticVariate("3");
        prototype1.setPrivateVariate("4");

        // 实例2：取值
        // 由于是原型模式，实例2取得static值与实例1赋值相同，以外值为null
        Assert.assertEquals(prototype2.publicStaticVariate, "1");
        Assert.assertNull(prototype2.publicVariate);
        Assert.assertEquals(prototype2.getPrivateStaticVariate(), "3");
        Assert.assertNull(prototype2.getPrivateVariate());
    }
}
