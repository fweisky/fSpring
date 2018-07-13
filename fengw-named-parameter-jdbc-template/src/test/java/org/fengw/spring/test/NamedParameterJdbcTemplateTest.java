package org.fengw.spring.test;

import java.util.List;

import org.fengw.spring.common.entity.UserEntity;
import org.fengw.spring.service.INamedParameterJdbcTemplateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * NamedParameterJdbcTemplate
 *
 * @author Feng Wei
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class NamedParameterJdbcTemplateTest {

    @Autowired
    private INamedParameterJdbcTemplateService service;

    /**
     * 测试插入
     */
    @Test
    public void testInsert() {
        service.insert();
    }

    /**
     * 测试检索
     */
    @Test
    public void testQuery() {
        List<UserEntity> entityList = service.query();

        for (UserEntity entity : entityList) {
            System.out.println(String.format("%s  %s  %s  %s",
                    entity.getName(), entity.getBirthday(), entity.getSex(), entity.getMoney()));
        }
    }

    /**
     * 测试更新
     */
    @Test
    public void testUpdate() {
        service.update();
    }
}
