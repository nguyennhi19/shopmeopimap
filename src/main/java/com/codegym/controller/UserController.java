package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView();

        Iterable<User> users = userService.findAll();
        modelAndView.setViewName("/user/list");
        modelAndView.addObject("user", users);
        return modelAndView;
    }
}
