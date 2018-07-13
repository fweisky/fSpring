package org.fengw.spring.service.impl;

import org.fengw.spring.dao.IHelloDao;
import org.fengw.spring.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Hello
 *
 * @author Feng Wei
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Autowired
    private IHelloDao dao;

    @Override
    public void hello() {
        System.out.println("Hello Service");
        dao.hello();
    }
}
