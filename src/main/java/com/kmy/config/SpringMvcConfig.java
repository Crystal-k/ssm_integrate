package com.kmy.config;

import com.kmy.controller.interceptor.ProjectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({"com.kmy.controller", "com.kmy.config"})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
//    @Autowired
//    private ProjectInterceptor projectInterceptor;

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(projectInterceptor).addPathPatterns("/books", "/books/*");
//    }
}
