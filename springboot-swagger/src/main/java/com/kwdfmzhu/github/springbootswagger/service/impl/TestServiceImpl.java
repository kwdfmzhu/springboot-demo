package com.kwdfmzhu.github.springbootswagger.service.impl;

import com.kwdfmzhu.github.springbootswagger.beans.TestDTO;
import com.kwdfmzhu.github.springbootswagger.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author kwdfmzhu
 * @date 2018/10/17
 */

@Service
public class TestServiceImpl implements TestService {

    @Override
    public TestDTO getDTO() {
        return TestDTO.builder().message("testDTO").build();
    }
}
