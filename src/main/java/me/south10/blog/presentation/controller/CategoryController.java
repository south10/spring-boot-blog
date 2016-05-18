package me.south10.blog.presentation.controller;

import me.south10.blog.domain.model.entity.Category;
import me.south10.blog.infrastructure.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by south10 on 2016-05-18.
 */
@Controller
public class CategoryController {
    @Autowired
    private CategoryDao categoryDao;

    @ResponseBody
    @RequestMapping(value = "/category/add")
    public Category add(@RequestParam(value = "categoryName", required = true)String categoryName){
        Category category = new Category();
        category.setName(categoryName);
        category.setRegDate(new Date());

        return categoryDao.save(category);
    }
}
