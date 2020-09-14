package com.github.perscholas;

import com.github.perscholas.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
    @GetMapping(value="/welcome")
    String getLandingPage(Model model) {
       return "welcome";
    }

    @GetMapping(value = "/register")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "register";
    }
    @GetMapping(value = "/login")
    public String login(Model model) {
        model.addAttribute("userForm", new User());
        return "login";
    }
}