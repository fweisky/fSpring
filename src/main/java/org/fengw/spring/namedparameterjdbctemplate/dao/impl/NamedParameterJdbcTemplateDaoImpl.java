package org.fengw.spring.namedparameterjdbctemplate.dao.impl;

import java.util.List;
import java.util.Map;

import org.fengw.spring.common.entity.UserEntity;
import org.fengw.spring.namedparameterjdbctemplate.dao.INamedParameterJdbcTemplateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * NamedParameterJdbcTemplate
 *
 * @author Feng Wei
 */
@Repository
public class NamedParameterJdbcTemplateDaoImpl implements INamedParameterJdbcTemplateDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbc;

    @Override
    public int insert(UserEntity entity) {
        String sql = "insert into t_user (name, birthday, sex, money) values (:name, :birthday, :sex, :money)";
        return jdbc.update(sql, new BeanPropertySqlParameterSource(entity));
    }

    @Override
    public List<UserEntity> query(Map<String, String> paramMap) {
        String sql = "select name, birthday, sex, money from t_user where name=:name";
        return jdbc.query(sql, paramMap, new BeanPropertyRowMapper<UserEntity>(UserEntity.class));
    }

    @Override
    public int update(UserEntity entity) {
        String sql = "update t_user set birthday=:birthday, sex=:sex, money=:money where name=:name";
        return jdbc.update(sql, new BeanPropertySqlParameterSource(entity));
    }
}
