package com.spring.samples.controller;

import com.spring.samples.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class UserController {

    @Autowired private UserService userService;


    @RequestMapping(value = "/users", method = GET)
    public ModelAndView showAllUsers(){
        ModelMap modelMap = new ModelMap("users", userService.getAllUsers());
        return new ModelAndView("list", modelMap);
    }
}
