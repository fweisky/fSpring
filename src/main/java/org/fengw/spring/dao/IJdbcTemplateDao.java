package org.fengw.spring.dao;

import java.util.List;

import org.fengw.spring.entity.Test1Entity;

/**
 * JdbcTemplate
 *
 * @author Feng Wei
 *
 */
public interface IJdbcTemplateDao {

    /**
     * 插入数据
     *
     * @return 插入件数
     */
    int insert();

    /**
     * 检索数据
     *
     * @return 数据
     */
    List<Test1Entity> query();

    /**
     * 更新数据
     *
     * @return 更新件数
     */
    int update();
}
