package org.fengw.spring.service;

import java.util.List;

import org.fengw.spring.common.entity.UserEntity;

/**
 * JdbcTemplate
 *
 * @author Feng Wei
 */
public interface IJdbcTemplateService {

    /**
     * 插入数据
     * @return 插入件数
     */
    int insert();

    /**
     * 检索数据
     * @return 数据
     */
    List<UserEntity> query();

    /**
     * 更新数据
     * @return 更新件数
     */
    int update();
}
