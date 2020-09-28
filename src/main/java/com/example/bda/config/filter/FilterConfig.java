package com.example.bda.config.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean registrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        //注册自定义过滤器
        registrationBean.setFilter(new LocalUserInfoFilter());
        //过滤应用程序中所有资源,当前应用程序根下的所有文件包括多级子目录下的所有文件，注意这里*前有“/”
        registrationBean.addUrlPatterns("/*");
        //过滤器名称
        registrationBean.setName("crosFilter");
        //优先级
        registrationBean.setOrder(1);
        return registrationBean;
    }
}
