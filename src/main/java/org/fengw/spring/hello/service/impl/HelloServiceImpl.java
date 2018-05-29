package org.fengw.spring.hello.service.impl;

import org.fengw.spring.hello.dao.IHelloDao;
import org.fengw.spring.hello.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Hello
 *
 * @author Feng Wei
 *
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
