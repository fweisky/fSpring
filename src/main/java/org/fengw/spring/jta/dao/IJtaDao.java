package org.fengw.spring.jta.dao;

import org.fengw.spring.common.entity.Test1Entity;

/**
 * JTA分布式事务
 *
 * @author Feng Wei
 */
public interface IJtaDao {

    /**
     * 插入商品库
     * @param entity 实体类
     * @return 插入件数
     */
    int insertGoods(Test1Entity entity);

    /**
     * 插入用户库
     * @param entity 实体类
     * @return 插入件数
     */
    int insertUser(Test1Entity entity);
}
