package org.fengw.spring.dao.impl;

import java.util.List;
import java.util.Map;

import org.fengw.spring.dao.INamedParameterJdbcTemplateDao;
import org.fengw.spring.entity.Test1Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * NamedParameterJdbcTemplate
 *
 * @author Feng Wei
 *
 */
@Repository
public class NamedParameterJdbcTemplateDaoImpl implements INamedParameterJdbcTemplateDao {

    @Autowired
    private NamedParameterJdbcTemplate dao;

    @Override
    public int insert(Test1Entity entity) {
        String sql = "insert into t_test_1 (name, birthday, sex, money) values (:name, :birthday, :sex, :money)";
        return dao.update(sql, new BeanPropertySqlParameterSource(entity));
    }

    @Override
    public List<Test1Entity> query(Map<String, String> paramMap) {
        String sql = "select name, birthday, sex, money from t_test_1 where name=:name";
        return dao.query(sql, paramMap, new BeanPropertyRowMapper<Test1Entity>(Test1Entity.class));
    }

    @Override
    public int update(Test1Entity entity) {
        String sql = "update t_test_1 set birthday=:birthday, sex=:sex, money=:money where name=:name";
        return dao.update(sql, new BeanPropertySqlParameterSource(entity));
    }
}
