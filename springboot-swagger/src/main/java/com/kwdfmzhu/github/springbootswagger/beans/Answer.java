package com.kwdfmzhu.github.springbootswagger.beans;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 *
 * @author reveewu
 * @date 28/06/2017
 */
@ApiModel(description = "响应对象")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Data
public class Answer<T> {
    @ApiModelProperty(value = "状态码", example="0", required = true)
    private Integer code;
    @ApiModelProperty(value = "返回消息", example="操作完成", required = true)
    private String msg;
    @ApiModelProperty(value = "具体数据")
    private T result;

    public Answer() {
        code = 0;
    }

    @SuppressWarnings("rawtypes")
    public static Answer<?> newBuilder() {
        return new Answer();
    }

    public <T> Answer<T> renderAnswer(T result) {
        Answer<T> answer = new Answer<>();
        answer.setCode(0);
        answer.setMsg("操作完成");
        answer.setResult(result);
        return answer;
    }
}
