package me.south10.blog.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by south10 on 2016-05-16.
 */
@Controller
public class UserController {
    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public String login() {
        return "connect/login";
    }
}
