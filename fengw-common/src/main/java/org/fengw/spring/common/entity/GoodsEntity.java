package org.fengw.spring.common.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品表
 *
 * @author Feng Wei
 */
public class GoodsEntity {

    /** 名称 */
    private String name;

    /** 购买日期 */
    private Date buyDate;

    /** 数量 */
    private Integer count;

    /** 价格 */
    private BigDecimal price;

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 要设置的 name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return buyDate
     */
    public Date getBuyDate() {
        return buyDate;
    }

    /**
     * @param buyDate 要设置的 buyDate
     */
    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count 要设置的 count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price 要设置的 price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
