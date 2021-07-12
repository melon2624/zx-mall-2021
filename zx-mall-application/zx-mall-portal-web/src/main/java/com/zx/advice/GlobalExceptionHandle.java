package com.zx.advice;

import com.baomidou.kaptcha.exception.KaptchaException;
import com.baomidou.kaptcha.exception.KaptchaIncorrectException;
import com.baomidou.kaptcha.exception.KaptchaNotFoundException;
import com.baomidou.kaptcha.exception.KaptchaTimeoutException;
import com.zx.exception.TokenException;
import com.zx.result.ResultWrapper;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author： zhangxin
 * @date： 2021-07-10 22:01
 */
@RestControllerAdvice
public class GlobalExceptionHandle {


    @ExceptionHandler(ArithmeticException.class)
    public ResultWrapper customException(){
        return ResultWrapper.builder().code(301).msg("统一异常").build();
    }


    @ExceptionHandler(TokenException.class)
    public ResultWrapper login(Exception e){

        return ResultWrapper.getFailBuilder().msg(e.getMessage()).build();
    }

    @ExceptionHandler(KaptchaException.class)
    public String kcaptchaException(KaptchaException e){
        if (e instanceof KaptchaTimeoutException){
            return "超时";
        }else if (e instanceof KaptchaIncorrectException){
            return "不正确";
        }else if (e instanceof KaptchaNotFoundException){

            return "没找到";
        }else {
            return  "反正错了";
        }
    }


}
