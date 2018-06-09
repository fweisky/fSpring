package org.fengw.spring.jdbctemplate.dao.impl;

import java.util.List;

import org.fengw.spring.common.entity.UserEntity;
import org.fengw.spring.jdbctemplate.dao.IJdbcTemplateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * JdbcTemplate
 *
 * @author Feng Wei
 */
@Repository
public class JdbcTemplateDaoImpl implements IJdbcTemplateDao {

    @Autowired
    private JdbcTemplate jdbc;

    @Override
    public int insert(UserEntity entity) {
        String sql = "insert into t_user (name, birthday, sex, money) values (?, ?, ?, ?)";
        return jdbc.update(sql, entity.getName(), entity.getBirthday(), entity.getSex(), entity.getMoney());
    }

    @Override
    public List<UserEntity> query() {
        String sql = "select name, birthday, sex, money from t_user";
        return jdbc.query(sql, new BeanPropertyRowMapper<UserEntity>(UserEntity.class));
    }

    @Override
    public int update(UserEntity entity) {
        String sql = "update t_user set birthday=?, sex=?, money=? where name=?";
        return jdbc.update(sql, entity.getBirthday(), entity.getSex(), entity.getMoney(), entity.getName());
    }
}
