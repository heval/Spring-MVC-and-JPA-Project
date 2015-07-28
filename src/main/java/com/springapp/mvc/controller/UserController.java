package com.springapp.mvc.controller;

import com.springapp.mvc.model.User;
import com.springapp.mvc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    IUserService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView login(ModelAndView modelAndView) {
        User user=new User();
        modelAndView.addObject("login", user);
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register(ModelAndView modelAndView) {
        User user=new User();
        modelAndView.addObject("register", user);
        modelAndView.setViewName("register");
        return modelAndView;
    }

    @RequestMapping(value = "/newuser", method = RequestMethod.POST)
    public ModelAndView createUser(@ModelAttribute @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("redirect:/register");
        } else {
            service.saveUser(user);
            return new ModelAndView("redirect:/users");
        }
    }
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView getUserList(ModelAndView modelAndView) {
        List<User> userList=service.getUserList();
        modelAndView.addObject("userList",userList);
        modelAndView.setViewName("users");
        return modelAndView;
    }
}