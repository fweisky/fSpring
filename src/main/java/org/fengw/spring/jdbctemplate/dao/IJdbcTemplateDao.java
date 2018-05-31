package org.fengw.spring.jdbctemplate.dao;

import java.util.List;

import org.fengw.spring.common.entity.Test1Entity;

/**
 * JdbcTemplate
 *
 * @author Feng Wei
 */
public interface IJdbcTemplateDao {

    /**
     * 插入数据
     * @param entity 实体类
     * @return 插入件数
     */
    int insert(Test1Entity entity);

    /**
     * 检索数据
     * @return 数据
     */
    List<Test1Entity> query();

    /**
     * 更新数据
     * @param entity 实体类
     * @return 更新件数
     */
    int update(Test1Entity entity);
}
