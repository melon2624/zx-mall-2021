package com.zx.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author： zhangxin
 * @date： 2021-07-10 19:57
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authinterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/happy-captcha/generator")
        .excludePathPatterns("/happy-captcha/verify")
        .excludePathPatterns("/easy-captcha/generator-redis");
    }

    @Bean
    public Authinterceptor authinterceptor(){

        return new Authinterceptor();
    }
}
