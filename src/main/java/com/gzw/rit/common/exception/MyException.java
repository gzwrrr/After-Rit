package com.gzw.rit.common.exception;

import com.gzw.rit.common.resultUtil.Result;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 16271
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyException extends RuntimeException {
    /**
     * 状态码
     */
    private Integer code;

    /**
     * 异常信息
     */
    private String msg;
}
