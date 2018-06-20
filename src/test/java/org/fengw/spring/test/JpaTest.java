package org.fengw.spring.test;

import java.util.List;

import org.fengw.spring.common.constant.ConfigFileConstant;
import org.fengw.spring.jpa.entity.UserEntity;
import org.fengw.spring.jpa.service.IJpaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * JPA
 *
 * @author Feng Wei
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = ConfigFileConstant.PATH_SPRING_JPA_CONFIG)
public class JpaTest {

    @Autowired
    private IJpaService service;

    /**
     * 批量插入
     */
    @Test
    public void testBatchInsert() {
        service.batchInsert();
    }

    /**
     * 删除
     */
    @Test
    public void testDelete() {
        service.delete();
    }

    /**
     * 删除（注解方式）
     */
    @Test
    public void testDeleteUseAnnotation() {
        service.deleteUseAnnotation();
    }

    /**
     * 插入
     */
    @Test
    public void testInsert() {
        service.insert();
    }

    /**
     * 查询
     */
    @Test
    public void testQuery() {
        List<UserEntity> userList = service.query();
        userList.forEach(u -> {
            System.out.println("---------------------------");
            System.out.println("ID=" + u.getId());
            System.out.println("Name=" + u.getName());
            System.out.println("Sex=" + u.getSex());
            System.out.println("Birthday=" + u.getBirthday());
            System.out.println("Money=" + u.getMoney());
        });
    }

    /**
     * 回滚
     */
    @Test
    public void testRollback() {
        service.rollback();
    }

    /**
     * 更新
     */
    @Test
    public void testUpdate() {
        service.update();
    }

    /**
     * 更新（注解方式）
     */
    @Test
    public void testUpdateUseAnnotation() {
        service.updateUseAnnotation();
    }
}
