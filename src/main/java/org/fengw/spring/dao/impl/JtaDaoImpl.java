package org.fengw.spring.dao.impl;

import javax.annotation.Resource;

import org.fengw.spring.dao.IJtaDao;
import org.fengw.spring.entity.Test1Entity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * JTA分布式事务
 *
 * @author Feng Wei
 */
@Repository
public class JtaDaoImpl implements IJtaDao {

    @Resource(name="jdbcTemplateGoods")
    private JdbcTemplate jdbcGoods;

    @Resource(name="jdbcTemplateUser")
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
