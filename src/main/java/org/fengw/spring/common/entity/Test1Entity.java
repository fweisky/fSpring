package org.fengw.spring.common.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * t_test_1 表的Entity
 *
 * @author Feng Wei
 */
public class Test1Entity {

    /** 姓名 */
    private String name;

    /** 生日 */
    private Date birthday;

    /** 性别 */
    private Integer sex;

    /** 薪水 */
    private BigDecimal money;

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
