package org.fengw.spring.customexception.dao;

import org.fengw.spring.common.entity.Test1Entity;

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
    int insert(Test1Entity entity);
}