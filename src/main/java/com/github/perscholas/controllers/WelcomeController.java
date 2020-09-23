package com.github.perscholas.controllers;

import com.github.perscholas.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class WelcomeController {

    @GetMapping(value = {"/", "/welcome"})
    public String welcome() {
        return "welcome";
    }


    @GetMapping(value = "/register")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "register";
    }
    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }
}