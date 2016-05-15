package me.south10.blog.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by spring on 2016-05-14.
 */
@Controller
public class HelloController {
    @RequestMapping({"/","/hello"})
    public String index(Model model){
        model.addAttribute("name", "SpringBlog from south10");
        return "hello";
    }

    @RequestMapping({"/blog"})
    public String blog(Model model){
        return "blog";
    }

    @RequestMapping({"/post"})
    public String post(Model model){
        return "post";
    }
}
