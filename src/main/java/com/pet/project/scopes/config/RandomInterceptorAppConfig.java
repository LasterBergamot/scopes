package com.pet.project.scopes.config;

import com.pet.project.scopes.interceptor.RandomInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class RandomInterceptorAppConfig implements WebMvcConfigurer {

    @Autowired
    private RandomInterceptor randomInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(randomInterceptor);
    }
}
