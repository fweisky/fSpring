package org.fengw.spring.service.impl;

import org.fengw.spring.dao.IJtaDao;
import org.fengw.spring.service.IJtaService;
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
    @Transactional
    public void insert() {
        // 插入商品库
        dao.insertGoods();
        // 插入用户库
        dao.insertUser();
    }
}
