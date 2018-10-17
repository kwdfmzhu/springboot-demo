package com.kwdfmzhu.github.springbootstarter.annotation;

import com.kwdfmzhu.github.springbootstarter.configure.TestAuthConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author kwdfmzhu
 * @date 2018/10/17
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(TestAuthConfiguration.class)
@Documented
public @interface EnableTestAuth {
}
