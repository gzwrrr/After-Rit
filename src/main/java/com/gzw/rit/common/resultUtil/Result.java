package com.gzw.rit.common.resultUtil;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 16271
 * 数据返回统一格式
 */
@Data
public class Result {
    @ApiModelProperty(value = "是否成功")
    private Boolean success;

    @ApiModelProperty(value = "状态码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<>();

    /**
     * 构造私有，不让其他人调用
     */
    private Result() {}

    /**
     * 成功的结果
     */
    public static Result success() {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResultCode.SUCCESS);
        result.setMessage("成功");
        return result;
    }

    /**
     * 失败的结果
     */
    public static Result error() {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(ResultCode.ERROR);
        result.setMessage("失败");
        return result;
    }

    /**
     * 链式变成，返回类型全是 Result
     */
    public static Result build(Boolean flag) {
        if (flag) {
            return success();
        } else {
            return error();
        }
    }

    public static Result build(String key, Object data) {
        return success().data(key, data);
    }


    public Result success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    public Result message(String message) {
        this.setMessage(message);
        return this;
    }

    public Result code(Integer code) {
        this.setCode(code);
        return this;
    }

    public Result data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public Result data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }
}

