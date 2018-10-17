package com.kwdfmzhu.github.springbootswagger.api;

import com.kwdfmzhu.github.springbootswagger.beans.Answer;
import com.kwdfmzhu.github.springbootswagger.beans.TestDTO;
import com.kwdfmzhu.github.springbootswagger.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kwdfmzhu
 * @date 2018/10/17
 */

@RestController
@RequestMapping("/test")
@Api(value = "/TestController", description = "test",tags = "test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    @ApiOperation(value="test-method")
    public Answer<TestDTO> test(){
        return new Answer<>().renderAnswer(testService.getDTO());
    }

}
