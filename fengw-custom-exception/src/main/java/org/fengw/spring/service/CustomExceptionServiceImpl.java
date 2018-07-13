package org.fengw.spring.service;

import java.math.BigDecimal;
import java.util.Date;

import org.fengw.spring.common.entity.UserEntity;
import org.fengw.spring.dao.ICustomExceptionDao;
import org.fengw.spring.exception.CustomException;
import org.fengw.spring.exception.CustomRuntimeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 自定义异常的事务回滚
 *
 * @author Feng Wei
 */
@Service
public class CustomExceptionServiceImpl implements ICustomExceptionService {

    @Autowired
    private ICustomExceptionDao dao;

    @Override
    @Transactional
    public void insertForCustomException1() throws CustomException {
        try {
            insert();
        } catch (Exception e) {
            throw new CustomException("发生自定义Exception，不能回滚", e);
        }
    }

    @Override
    @Transactional(rollbackFor = CustomException.class)
    public void insertForCustomException2() throws CustomException {
        try {
            insert();
        } catch (Exception e) {
            throw new CustomException("发生自定义Exception，可以回滚", e);
        }
    }

    @Override
    @Transactional
    public void insertForCustomRuntimeException1() {
        try {
            insert();
        } catch (Exception e) {
            throw new CustomRuntimeException("发生自定义RuntimeException，可以回滚", e);
        }
    }

    @Override
    @Transactional(rollbackFor = CustomRuntimeException.class)
    public void insertForCustomRuntimeException2() throws CustomRuntimeException {
        try {
            insert();
        } catch (Exception e) {
            throw new CustomRuntimeException("发生自定义RuntimeException，可以回滚", e);
        }
    }

    /**
     * 插入数据
     */
    private void insert() {
        UserEntity entity = new UserEntity();
        entity.setName("fengW");
        entity.setBirthday(new Date());
        entity.setSex(7);
        entity.setMoney(new BigDecimal("77777.77"));
        dao.insert(entity);

        // 除以0为了发生异常
        int i = 7 / 0;
    }
}
