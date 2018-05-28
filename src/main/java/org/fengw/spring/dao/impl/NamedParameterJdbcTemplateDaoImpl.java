package org.fengw.spring.dao.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
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
    public int insert() {
        String sql = "insert into t_test_1 (name, birthday, sex, money) values (:name, :birthday, :sex, :money)";
        Test1Entity entity = new Test1Entity();
        entity.setName("fengW");
        entity.setBirthday(new Date());
        entity.setSex(7);
        entity.setMoney(new BigDecimal("77777.77"));
        return dao.update(sql, new BeanPropertySqlParameterSource(entity));
    }

    @Override
    public List<Test1Entity> query() {
        String sql = "select name, birthday, sex, money from t_test_1 where name=:name";
        Map<String, String> param = new HashMap<>();
        param.put("name", "fengW");
        return dao.query(sql, param, new BeanPropertyRowMapper<Test1Entity>(Test1Entity.class));
    }

    @Override
    public int update() {
        String sql = "update t_test_1 set birthday=:birthday, sex=:sex, money=:money where name=:name";
        Test1Entity entity = new Test1Entity();
        entity.setName("fengW");
        entity.setBirthday(new Date());
        entity.setSex(8);
        entity.setMoney(new BigDecimal("88888.88"));
        return dao.update(sql, new BeanPropertySqlParameterSource(entity));
    }
}
