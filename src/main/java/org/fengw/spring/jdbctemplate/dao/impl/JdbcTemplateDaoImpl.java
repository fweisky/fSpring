package org.fengw.spring.jdbctemplate.dao.impl;

import java.util.List;

import org.fengw.spring.common.entity.Test1Entity;
import org.fengw.spring.jdbctemplate.dao.IJdbcTemplateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * JdbcTemplate
 *
 * @author Feng Wei
 *
 */
@Repository
public class JdbcTemplateDaoImpl implements IJdbcTemplateDao {

    @Autowired
    private JdbcTemplate jdbc;

    @Override
    public int insert(Test1Entity entity) {
        String sql = "insert into t_test_1 (name, birthday, sex, money) values (?, ?, ?, ?)";
        return jdbc.update(sql, entity.getName(), entity.getBirthday(), entity.getSex(), entity.getMoney());
    }

    @Override
    public List<Test1Entity> query() {
        String sql = "select name, birthday, sex, money from t_test_1";
        return jdbc.query(sql, new BeanPropertyRowMapper<Test1Entity>(Test1Entity.class));
    }

    @Override
    public int update(Test1Entity entity) {
        String sql = "update t_test_1 set birthday=?, sex=?, money=? where name=?";
        return jdbc.update(sql, entity.getBirthday(), entity.getSex(), entity.getMoney(), entity.getName());
    }
}
