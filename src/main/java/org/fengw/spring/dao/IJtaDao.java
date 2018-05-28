package org.fengw.spring.dao;

/**
 * JTA分布式事务
 *
 * @author Feng Wei
 *
 */
public interface IJtaDao {

    /**
     * 插入商品库
     *
     * @return 插入件数
     */
    int insertGoods();

    /**
     * 插入用户库
     *
     * @return 插入件数
     */
    int insertUser();
}
