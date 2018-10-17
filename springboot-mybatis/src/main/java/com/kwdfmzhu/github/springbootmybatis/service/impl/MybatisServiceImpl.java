package com.kwdfmzhu.github.springbootmybatis.service.impl;

import com.kwdfmzhu.github.springbootmybatis.dao.domain.Person;
import com.kwdfmzhu.github.springbootmybatis.dao.mapper.PersonMapper;
import com.kwdfmzhu.github.springbootmybatis.service.MybatisService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kwdfmzhu
 * @date 2018/10/17
 */

@Service
public class MybatisServiceImpl implements MybatisService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public void insert() {
        Person person = new Person();
        person.setId(135);
        person.setName("Lisywer");
        person.setAge(100);
        personMapper.insert(person);
    }

    @Override
    public void update() {

    }

    @Override
    public void select() {
        Person person = personMapper.selectByPrimaryKey(135);
        System.out.println(person);
    }

    @Override
    public void delete() {

    }
}
