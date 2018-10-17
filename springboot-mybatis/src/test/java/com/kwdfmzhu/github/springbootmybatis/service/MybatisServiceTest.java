package com.kwdfmzhu.github.springbootmybatis.service;

import com.kwdfmzhu.github.springbootmybatis.App;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author kwdfmzhu
 * @date 2018/10/17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class MybatisServiceTest {

    @Autowired
    private MybatisService mybatisService;

    @Test
    public void insert() throws Exception {
        mybatisService.insert();
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void select() throws Exception {
        mybatisService.select();
    }

    @Test
    public void delete() throws Exception {
    }

}