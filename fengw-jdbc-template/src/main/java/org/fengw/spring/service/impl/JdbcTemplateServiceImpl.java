package org.fengw.spring.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.fengw.spring.common.entity.UserEntity;
import org.fengw.spring.dao.IJdbcTemplateDao;
import org.fengw.spring.service.IJdbcTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * JdbcTemplate
 *
 * @author Feng Wei
 */
@Service
public class JdbcTemplateServiceImpl implements IJdbcTemplateService {

    @Autowired
    private IJdbcTemplateDao dao;

    @Override
    @Transactional(rollbackFor=Exception.class)
    public int insert() {
        UserEntity entity = new UserEntity();
        entity.setName("fengW");
        entity.setBirthday(new Date());
        entity.setSex(0);
        entity.setMoney(new BigDecimal("11111.11"));
        return dao.insert(entity);
    }

    @Override
    public List<UserEntity> query() {
        return dao.query();
    }

    @Override
    @Transactional(rollbackFor=Exception.class)
    public int update() {
        UserEntity entity = new UserEntity();
        entity.setName("fengW");
        entity.setBirthday(new Date());
        entity.setSex(1);
        entity.setMoney(new BigDecimal("22222.22"));
        return dao.update(entity);
    }
}
