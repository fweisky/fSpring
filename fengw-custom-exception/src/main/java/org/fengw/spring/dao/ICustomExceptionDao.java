package org.fengw.spring.dao;

import org.fengw.spring.common.entity.UserEntity;

/**
 * 自定义异常的事务回滚
 *
 * @author Feng Wei
 */
public interface ICustomExceptionDao {

    /**
     * 插入数据
     * @param entity 实体类
     * @return 插入件数
     */
    int insert(UserEntity entity);
}
