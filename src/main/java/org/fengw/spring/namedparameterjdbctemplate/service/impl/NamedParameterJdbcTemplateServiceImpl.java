package org.fengw.spring.namedparameterjdbctemplate.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fengw.spring.common.entity.Test1Entity;
import org.fengw.spring.namedparameterjdbctemplate.dao.INamedParameterJdbcTemplateDao;
import org.fengw.spring.namedparameterjdbctemplate.service.INamedParameterJdbcTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * NamedParameterJdbcTemplate
 *
 * @author Feng Wei
 *
 */
@Service
public class NamedParameterJdbcTemplateServiceImpl implements INamedParameterJdbcTemplateService {

    @Autowired
    private INamedParameterJdbcTemplateDao dao;

    @Override
    public int insert() {
        Test1Entity entity = new Test1Entity();
        entity.setName("fengW");
        entity.setBirthday(new Date());
        entity.setSex(7);
        entity.setMoney(new BigDecimal("77777.77"));
        return dao.insert(entity);
    }

    @Override
    public List<Test1Entity> query() {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("name", "fengW");
        return dao.query(paramMap);
    }

    @Override
    public int update() {
        Test1Entity entity = new Test1Entity();
        entity.setName("fengW");
        entity.setBirthday(new Date());
        entity.setSex(8);
        entity.setMoney(new BigDecimal("88888.88"));
        return dao.update(entity);
    }
}
