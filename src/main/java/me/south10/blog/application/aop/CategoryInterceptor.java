package me.south10.blog.application.aop;

import me.south10.blog.infrastructure.dao.CategoryDao;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by south10 on 2016-05-18.
 */
public class CategoryInterceptor extends HandlerInterceptorAdapter {

    private CategoryDao categoryDao;

    public CategoryInterceptor(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        request.setAttribute("_CATEGORY_LIST", categoryDao.findAll());

        return true;
    }
}
