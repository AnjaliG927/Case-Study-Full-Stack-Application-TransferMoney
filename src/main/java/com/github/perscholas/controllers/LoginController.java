package com.github.perscholas.controllers;


import com.github.perscholas.model.User;
import com.github.perscholas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    private UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/validUser")
    public String isValidUser(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              HttpSession session, Model model) {

        if (!username.equals("") && !password.equals("")) {
            boolean isValid = userService.validateUser(username, password);
            if (isValid) {
                session.setAttribute("currentUser",username);
                return "userDashboard";
            }
        } else {
            model.addAttribute("error", "Your username and password are invalid.");

        }
        return "login";

    }

        @GetMapping(value = "/logout")
        public String logout(HttpSession session,Model model) {
            session.removeAttribute("username");
            model.addAttribute("message", "You have logged out successfully.");
            return "login";
        }
}





