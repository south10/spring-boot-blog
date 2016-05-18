package me.south10.blog.application.configuration;

import me.south10.blog.application.aop.CategoryInterceptor;
import me.south10.blog.application.aop.UserSessionArgumentResolver;
import me.south10.blog.application.aop.UserSessionInterceptor;
import me.south10.blog.infrastructure.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by south10 on 2016-05-17.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter{
    @Autowired
    private ConnectionRepository connectionRepository;

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserSessionInterceptor(connectionRepository));
        registry.addInterceptor(new CategoryInterceptor(categoryDao));
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new UserSessionArgumentResolver(connectionRepository));
    }
}
