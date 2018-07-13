package org.fengw.spring.dao;

import java.util.List;
import java.util.Map;

import org.fengw.spring.common.entity.UserEntity;

/**
 * NamedParameterJdbcTemplate
 *
 * @author Feng Wei
 */
public interface INamedParameterJdbcTemplateDao {

    /**
     * 插入数据
     * @param entity 实体类
     * @return 插入件数
     */
    int insert(UserEntity entity);

    /**
     * 检索数据
     * @param paramMap SQL条件
     * @return 数据
     */
    List<UserEntity> query(Map<String, String> paramMap);

    /**
     * 更新数据
     * @param entity 实体类
     * @return 更新件数
     */
    int update(UserEntity entity);
}
