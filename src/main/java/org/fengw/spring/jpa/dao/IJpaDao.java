package org.fengw.spring.jpa.dao;

import java.util.List;

import org.fengw.spring.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * <pre>
 * JPA
 * 使用注解方式进行RUD操作，不支持C操作
 * </pre>
 *
 * @author Feng Wei
 */
public interface IJpaDao extends JpaRepository<UserEntity, Integer> {

    /**
     * 使用注解方式删除
     * @param name 姓名
     */
    @Modifying
    @Query(value = "delete from UserEntity u where u.name = :name")
    void delete(@Param("name") String name);

    /**
     * 使用注解方式查询
     * @param name 姓名
     * @return 查询的用户列表
     */
    @Query(value = "from UserEntity u where u.name = :name")
    List<UserEntity> query(@Param("name") String name);

    /**
     * <pre>
     * 使用注解方式更新
     * 参数是实体类
     * </pre>
     * @param user
     */
    @Modifying
    @Query(value = " update UserEntity u"
            + " set u.birthday = :#{#user.birthday}, u.sex = :#{#user.sex}, u.money = :#{#user.money}"
            + " where u.name = :#{#user.name}")
    void update(@Param("user") UserEntity user);
}
