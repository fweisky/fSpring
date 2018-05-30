package org.fengw.spring.jta.dao.impl;

import javax.annotation.Resource;

import org.fengw.spring.common.entity.Test1Entity;
import org.fengw.spring.jta.dao.IJtaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * JTA分布式事务
 *
 * @author Feng Wei
 */
@Repository
public class JtaDaoImpl implements IJtaDao {

    // 利用@Resource指定装配Bean
    @Resource(name="jdbcTemplateGoods")
    private JdbcTemplate jdbcGoods;

    // 利用@Qualifier指定装配Bean
    @Autowired
    @Qualifier(value="jdbcTemplateUser")
    private JdbcTemplate jdbcUser;

    @Override
    public int insertGoods(Test1Entity entity) {
        // 插入商品库
        String sql = "insert into t_test_1 (name, birthday, sex, money) values (?, ?, ?, ?)";
        return jdbcGoods.update(sql, entity.getName(), entity.getBirthday(), entity.getSex(), entity.getMoney());
    }

    @Override
    public int insertUser(Test1Entity entity) {
        // 插入用户库
        String sql = "insert into t_test_1 (name, birthday, sex, money) values (?, ?, ?, ?)";
        return jdbcUser.update(sql, entity.getName(), entity.getBirthday(), entity.getSex(), entity.getMoney());
    }
}
