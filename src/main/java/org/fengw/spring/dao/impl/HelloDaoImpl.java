package org.fengw.spring.dao.impl;

import org.fengw.spring.dao.IHelloDao;
import org.springframework.stereotype.Repository;

/**
 * Hello
 *
 * @author Feng Wei
 *
 */
@Repository
public class HelloDaoImpl implements IHelloDao {

    @Override
    public void hello() {
        System.out.println("Hello DAO");
    }
}
