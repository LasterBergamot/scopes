package com.pet.project.scopes.config;

import com.pet.project.scopes.filter.URLFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FilterRegistrationBean<URLFilter> urlFilter() {
        FilterRegistrationBean<URLFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new URLFilter());
        registrationBean.addUrlPatterns("/profiles/*");

        return registrationBean;
    }
}
