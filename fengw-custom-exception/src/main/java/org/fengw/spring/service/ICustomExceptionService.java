package org.fengw.spring.service;

import org.fengw.spring.exception.CustomException;
import org.fengw.spring.exception.CustomRuntimeException;

/**
 * 自定义异常的事务回滚
 *
 * @author Feng Wei
 */
public interface ICustomExceptionService {

    /**
     * <pre>
     * 演示自定义异常不能回滚
     * 原因（AND关系）：
     *   1.自定义异常继承了Exception
     *   2.@Transactional中没有指定rollbackFor属性
     * </pre>
     * @throws CustomException 自定义Exception异常
     */
    void insertForCustomException1() throws CustomException;

    /**
     * <pre>
     * 演示自定义异常可以回滚
     * 原因：
     *   1.@Transactional中指定了rollbackFor属性
     * </pre>
     * @throws CustomException 自定义Exception异常
     */
    void insertForCustomException2() throws CustomException;

    /**
     * <pre>
     * 演示自定义异常可以回滚
     * 原因:
     *   1.自定义异常继承的是RuntimeException
     * </pre>
     * @throws CustomRuntimeException 自定义RuntimeException异常
     */
    void insertForCustomRuntimeException1() throws CustomRuntimeException;

    /**
     * <pre>
     * 演示自定义异常可以回滚
     * 原因（OR关系）:
     *   1.自定义异常继承的是RuntimeException
     *   2.@Transactional中指定了rollbackFor属性
     * </pre>
     * @throws CustomRuntimeException 自定义RuntimeException异常
     */
    void insertForCustomRuntimeException2() throws CustomRuntimeException;
}
