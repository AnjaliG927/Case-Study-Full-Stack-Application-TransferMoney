package com.github.perscholas.controllers;

import com.github.perscholas.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class welcomeController {
    @GetMapping(value = "/")
    public String welcome(Model model) {
        return "welcome";
    }


    @GetMapping(value = "/welcome/register")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "register";
    }
    @GetMapping(value = "/welcome/login")
    public String login(Model model) {
        return "login";
    }
}