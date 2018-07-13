package org.fengw.spring.dao;

import org.fengw.spring.common.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 自定义异常的事务回滚
 *
 * @author Feng Wei
 */
@Repository
public class CustomExceptionDaoImpl implements ICustomExceptionDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbc;

    @Override
    public int insert(UserEntity entity) {
        String sql = "insert into t_user (name, birthday, sex, money) values (:name, :birthday, :sex, :money)";
        return jdbc.update(sql, new BeanPropertySqlParameterSource(entity));
    }
}
