package org.fengw.spring.service.impl;

import java.util.List;

import org.fengw.spring.dao.INamedParameterJdbcTemplateDao;
import org.fengw.spring.entity.Test1Entity;
import org.fengw.spring.service.INamedParameterJdbcTemplateService;
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
        return dao.insert();
    }

    @Override
    public List<Test1Entity> query() {
        return dao.query();
    }

    @Override
    public int update() {
        return dao.update();
    }
}
