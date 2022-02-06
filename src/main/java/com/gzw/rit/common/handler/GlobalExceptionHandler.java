package com.gzw.rit.common.handler;

import com.gzw.rit.common.exception.MyException;
import com.gzw.rit.common.resultUtil.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 16271
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 指定出现什么异常执行该方法
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        e.printStackTrace();
        Map<String, Object> map = new HashMap<>();
        map.put("message", e.getMessage());
        map.put("stackTrace", e.getStackTrace());
        return Result.error().message("全局异常处理").data("error", map);
    }

    /**
     * 自定义异常
     */
    @ExceptionHandler(MyException.class)
    @ResponseBody
    public Result error(MyException e) {
        e.printStackTrace();
        Map<String, Object> map = new HashMap<>();
        map.put("stackTrace", e.getStackTrace());
        map.put("message", e.getMessage());
        return Result.error().code(e.getCode()).message(e.getMsg()).data("error", map);
    }
}
