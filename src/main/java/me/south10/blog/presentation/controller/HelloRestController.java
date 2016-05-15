package me.south10.blog.presentation.controller;

import me.south10.blog.domain.model.entity.Hello;
import me.south10.blog.infrastructure.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by spring on 2016-05-14.
 */
@RestController
public class HelloRestController {
    @Autowired
    private HelloDao helloDao;

    @RequestMapping("/add")
    public Hello add(Hello hello){
        Hello helloData = helloDao.save(hello);
        return helloData;
    }

    @RequestMapping("/list")
    public List<Hello> list(Model model){
        List<Hello> helloList = helloDao.findAll();
        return helloList;
    }

    @RequestMapping("/test")
    public String index(){
        return "Hello World";
    }
}
