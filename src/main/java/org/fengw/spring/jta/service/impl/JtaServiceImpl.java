package org.fengw.spring.jta.service.impl;

import java.math.BigDecimal;
import java.util.Date;

import org.fengw.spring.common.entity.GoodsEntity;
import org.fengw.spring.common.entity.UserEntity;
import org.fengw.spring.jta.dao.IJtaDao;
import org.fengw.spring.jta.service.IJtaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * JTA分布式事务
 *
 * @author Feng Wei
 */
@Service
public class JtaServiceImpl implements IJtaService {

    @Autowired
    private IJtaDao dao;

    @Override
    @Transactional(rollbackFor=Exception.class)
    public void insert() {

        // 插入商品库
        GoodsEntity goodsEntity = new GoodsEntity();
        goodsEntity.setName("goods");
        goodsEntity.setBuyDate(new Date());
        goodsEntity.setCount(0);
        goodsEntity.setPrice(new BigDecimal("77777.77"));
        dao.insertGoods(goodsEntity);

        // 插入用户库
        UserEntity userEntity = new UserEntity();
        userEntity.setName("user");
        userEntity.setBirthday(new Date());
        userEntity.setSex(1);
        userEntity.setMoney(new BigDecimal("88888.88"));
        dao.insertUser(userEntity);
    }
}
