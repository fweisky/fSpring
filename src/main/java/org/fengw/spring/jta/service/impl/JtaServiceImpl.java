package org.fengw.spring.jta.service.impl;

import java.math.BigDecimal;
import java.util.Date;

import org.fengw.spring.common.entity.Test1Entity;
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
    @Transactional(noRollbackFor=Exception.class)
    public void insert() {

        // 插入商品库
        Test1Entity goodsEntity = new Test1Entity();
        goodsEntity.setName("goods");
        goodsEntity.setBirthday(new Date());
        goodsEntity.setSex(0);
        goodsEntity.setMoney(new BigDecimal("77777.77"));
        dao.insertGoods(goodsEntity);

        // 插入用户库
        Test1Entity userEntity = new Test1Entity();
        userEntity.setName("user");
        userEntity.setBirthday(new Date());
        userEntity.setSex(1);
        userEntity.setMoney(new BigDecimal("88888.88"));
        dao.insertUser(userEntity);
    }
}
