package org.fengw.spring.dao.impl;

import java.math.BigDecimal;
import java.util.Date;

import javax.annotation.Resource;

import org.fengw.spring.dao.IJtaDao;
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
    public int insertGoods() {
        // 插入商品库
        String sql = "insert into t_test_1 (name, birthday, sex, money) values (?, ?, ?, ?)";
        return jdbcGoods.update(sql, "goods", new Date(), 0, new BigDecimal("11111.11")) ;
    }

    @Override
    public int insertUser() {
        // 插入用户库
        String sql = "insert into t_test_1 (name, birthday, sex, money) values (?, ?, ?, ?)";
        return jdbcUser.update(sql, "user", new Date(), 1, new BigDecimal("22222.22")) ;
    }

}
