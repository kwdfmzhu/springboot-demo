package com.kwdfmzhu.github.springbootcache.service.impl;

import com.kwdfmzhu.github.springbootcache.service.CacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author kwdfmzhu
 * @date 2018/10/18
 */

@Service
public class CacheServiceImpl implements CacheService {

    @Override
    @Cacheable(value = "cache1")
    public Integer testCache() {
        return this.genNum();
    }

    @Override
    public void multiTestCache() {

    }

    private Integer genNum() {
        System.out.println("genNum");
        return new Double(Math.random() * 10).intValue();
    }
}
