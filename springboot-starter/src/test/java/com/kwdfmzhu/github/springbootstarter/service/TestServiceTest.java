package com.kwdfmzhu.github.springbootstarter.service;

import com.kwdfmzhu.github.springbootstarter.App;
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
public class TestServiceTest {

    @Autowired
    private TestService testService;

    @Test
    public void print() throws Exception {
        testService.print();
    }

}