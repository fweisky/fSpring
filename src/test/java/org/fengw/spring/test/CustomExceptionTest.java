package org.fengw.spring.test;

import org.fengw.spring.common.constant.ConfigFileConstant;
import org.fengw.spring.customexception.exception.CustomException;
import org.fengw.spring.customexception.exception.CustomRuntimeException;
import org.fengw.spring.customexception.service.ICustomExceptionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 自定义异常的事务回滚
 *
 * @author Feng Wei
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(ConfigFileConstant.PATH_SPRING_CUSTOM_EXCEPTION_CONFIG)
public class CustomExceptionTest {

    @Autowired
    private ICustomExceptionService service;

    /**
     * 测试自定义异常不能回滚
     * @throws CustomException 自定义异常
     */
    @Test
    public void testInsertForCustomException1() throws CustomException {
        service.insertForCustomException1();
    }

    /**
     * 测试自定义异常可以回滚
     * @throws CustomException 自定义异常
     */
    @Test
    public void testInsertForCustomException2() throws CustomException {
        service.insertForCustomException2();
    }

    /**
     * 测试自定义异常可以回滚
     * @throws CustomRuntimeException 自定义异常
     */
    @Test
    public void testInsertForCustomRuntimeException1() throws CustomRuntimeException {
        service.insertForCustomRuntimeException1();
    }

    /**
     * 测试自定义异常可以回滚
     * @throws CustomRuntimeException 自定义异常
     */
    @Test
    public void testInsertForCustomRuntimeException2() throws CustomRuntimeException {
        service.insertForCustomRuntimeException2();
    }
}
