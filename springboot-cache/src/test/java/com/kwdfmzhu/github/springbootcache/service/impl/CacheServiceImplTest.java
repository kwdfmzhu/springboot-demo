package com.kwdfmzhu.github.springbootcache.service.impl;

import com.kwdfmzhu.github.springbootcache.App;
import com.kwdfmzhu.github.springbootcache.service.CacheService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author kwdfmzhu
 * @date 2018/10/18
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class CacheServiceImplTest {

    @Autowired
    private CacheService cacheService;
    @Test
    public void testCache() throws Exception {
        for(int i = 0; i < 100; i++) {
            cacheService.testCache();
        }
    }

    @Test
    public void multiTestCache() throws Exception {
    }

}