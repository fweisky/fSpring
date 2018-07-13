package org.fengw.spring.dao.impl;

import javax.annotation.Resource;

import org.fengw.spring.common.entity.GoodsEntity;
import org.fengw.spring.common.entity.UserEntity;
import org.fengw.spring.dao.IJtaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * JTA分布式事务
 *
 * @author Feng Wei
 */
@Repository
public class JtaDaoImpl implements IJtaDao {

    // 利用@Resource指定装配Bean
    @Resource(name="jdbcTemplateGoods")
    private JdbcTemplate jdbcGoods;

    // 利用@Qualifier指定装配Bean
    @Autowired
    @Qualifier(value="jdbcTemplateUser")
    private JdbcTemplate jdbcUser;

    @Override
    public int insertGoods(GoodsEntity entity) {
        // 插入商品库
        String sql = "insert into t_goods (name, buy_date, count, price) values (?, ?, ?, ?)";
        return jdbcGoods.update(sql, entity.getName(), entity.getBuyDate(), entity.getCount(), entity.getPrice());
    }

    @Override
    public int insertUser(UserEntity entity) {
        // 插入用户库
        String sql = "insert into t_user (name, birthday, sex, money) values (?, ?, ?, ?)";
        return jdbcUser.update(sql, entity.getName(), entity.getBirthday(), entity.getSex(), entity.getMoney());
    }
}
