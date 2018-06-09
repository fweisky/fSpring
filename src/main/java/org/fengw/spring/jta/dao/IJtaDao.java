package org.fengw.spring.jta.dao;

import org.fengw.spring.common.entity.GoodsEntity;
import org.fengw.spring.common.entity.UserEntity;

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
    int insertGoods(GoodsEntity entity);

    /**
     * 插入用户库
     * @param entity 实体类
     * @return 插入件数
     */
    int insertUser(UserEntity entity);
}
