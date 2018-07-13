package org.fengw.spring.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.fengw.spring.dao.IJpaDao;
import org.fengw.spring.entity.UserEntity;
import org.fengw.spring.service.IJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * JPA
 *
 * @author Feng Wei
 */
@Service
public class JpaServiceImpl implements IJpaService {

    @Autowired
    private IJpaDao dao;

    @Override
    public void batchInsert() {
        List<UserEntity> userList = new ArrayList<UserEntity>();

        for (int i = 0; i < 5; i++) {
            UserEntity entity = new UserEntity();
            entity.setName("fengW");
            entity.setBirthday(new Date());
            entity.setSex(0);
            entity.setMoney(BigDecimal.valueOf(1 + i));
            userList.add(entity);
        }

        dao.saveAll(userList);
    }

    @Override
    public void delete() {
        dao.deleteById(Integer.valueOf(1));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteUseAnnotation() {
        dao.delete("fengW");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert() {
        UserEntity entity = new UserEntity();
        entity.setName("fengW");
        entity.setBirthday(new Date());
        entity.setSex(0);
        entity.setMoney(new BigDecimal("11111.11"));
        dao.save(entity);
    }

    @Override
    public List<UserEntity> query() {
        return dao.query("fengW");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void rollback() {
        UserEntity entity = new UserEntity();
        entity.setName("fengW");
        entity.setBirthday(new Date());
        entity.setSex(0);
        entity.setMoney(new BigDecimal("11111.11"));
        dao.save(entity);
        int i = 7 / 0; // 特意除0抛出异常，验证回滚
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update() {
        UserEntity entity = new UserEntity();
        entity.setId(Integer.valueOf(1));
        entity.setName("fengW");
        entity.setBirthday(new Date());
        entity.setSex(2);
        entity.setMoney(new BigDecimal("22222.22"));
        dao.saveAndFlush(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateUseAnnotation() {
        UserEntity entity = new UserEntity();
        entity.setId(Integer.valueOf(1));
        entity.setName("fengW");
        entity.setBirthday(new Date());
        entity.setSex(2);
        entity.setMoney(new BigDecimal("22222.22"));
        dao.update(entity);
    }
}
