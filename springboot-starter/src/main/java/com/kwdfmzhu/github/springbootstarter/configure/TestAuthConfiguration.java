package com.kwdfmzhu.github.springbootstarter.configure;

import com.kwdfmzhu.github.springbootstarter.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kwdfmzhu
 * @date 2018/10/17
 */

@Configuration
public class TestAuthConfiguration {

    @Bean(name = "testService")
    public TestService testService() {
        return new TestService();
    }
}
