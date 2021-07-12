package com.zx.interceptor;


import com.zx.annotations.TokenCheck;
import com.zx.exception.TokenException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author： zhangxin
 * @date： 2021-07-10 11:20
 */
public class Authinterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

       /* System.out.println("拦截器进入");

       String token= request.getHeader("token");

       if (StringUtils.isBlank(token)){
           throw new  LoginException("token为空");
       }

        HandlerMethod handlerMethod=(HandlerMethod)handler;
        Method method=handlerMethod.getMethod();

        if (method.isAnnotationPresent(TokenCheck.class)){

            TokenCheck annotation=method.getAnnotation(TokenCheck.class);

            if (annotation.required()){

                try {
                    //校验token
                    System.out.println("校验拦截器");
                    int a= 1/0;
                   // throw new TokenException("token 异常");
                    //return  true;
                }catch (Exception e){
                    throw new TokenException("token 异常");
                }
            }
        }*/

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
