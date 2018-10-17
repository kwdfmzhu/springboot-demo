package com.kwdfmzhu.github.springbootswagger.beans;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author kwdfmzhu
 * @date 2018/10/17
 */

@Data
@Builder
@ApiModel(description = "TestDTO")
public class TestDTO {

    @ApiModelProperty(value = "message")
    private String message;
}
