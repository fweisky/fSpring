package org.fengw.spring.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户表
 *
 * @author Feng Wei
 */
@Entity
@Table(name = "t_user")
public class UserEntity implements Serializable {

    /** Serial Version UID */
    private static final long serialVersionUID = 1L;

    /** ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /** 姓名 */
    @Column(name = "name")
    private String name;

    /** 生日 */
    @Column(name = "birthday")
    private Date birthday;

    /** 性别 */
    @Column(name = "sex")
    private Integer sex;

    /** 薪水 */
    @Column(name = "money")
    private BigDecimal money;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id 要设置的 id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 取得姓名
     *
     * @return 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 取得生日
     *
     * @return 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 取得性别
     *
     * @return 性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 取得薪水
     *
     * @return 薪水
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置薪水
     *
     * @param money 薪水
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
