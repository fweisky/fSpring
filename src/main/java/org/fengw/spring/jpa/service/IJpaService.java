package org.fengw.spring.jpa.service;

import java.util.List;

import org.fengw.spring.jpa.entity.UserEntity;

/**
 * JPA
 *
 * @author Feng Wei
 */
public interface IJpaService {

    /**
     * 实体类方式：批量插入
     */
    void batchInsert();

    /**
     * <pre>
     * 实体类方式：删除
     * 会访问2次DB
     * 1.根据主键检索，得到实体类
     * 2.删除处理
     * </pre>
     */
    void delete();

    /**
     * 注解方式：删除
     */
    void deleteUseAnnotation();

    /**
     * 实体类方式：单条插入
     */
    void insert();

    /**
     * 注解方式：查询
     * @return 数据
     */
    List<UserEntity> query();

    /**
     * DB回滚
     */
    void rollback();

    /**
     * <pre>
     * 实体类方式：更新
     * 会访问2次DB
     * 1.根据主键检索，得到实体类
     * 2.更新处理
     * </pre>
     */
    void update();

    /**
     * 注解方式：更新
     */
    void updateUseAnnotation();
}
