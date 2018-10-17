package com.kwdfmzhu.github.springbootstarter;

import com.kwdfmzhu.github.springbootstarter.annotation.EnableTestAuth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Hello world!
 *
 * @author zhukewei
 */

@SpringBootApplication(scanBasePackages = {"com.kwdfmzhu.github.springbootstarter"}, exclude = {DataSourceAutoConfiguration.class})
@EnableTestAuth
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
