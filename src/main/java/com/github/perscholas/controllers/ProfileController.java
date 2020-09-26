package com.github.perscholas.controllers;

import com.github.perscholas.model.User;
import com.github.perscholas.service.UserService;
import com.github.perscholas.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class ProfileController {

    private UserService userService;
    private UserValidator userValidator;

    @Autowired
    public ProfileController(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }

    @GetMapping(value = "/profile")
    public String getProfile(Model model) {
        model.addAttribute("edit", new User());
        return "profile";
    }


    @PutMapping(value = "/editForm/{username}")
    public String editDetails(@Valid @ModelAttribute("edit") User editForm,@PathVariable String username,
                              BindingResult bindingResult, Model model) {
        User user = userService.findByUsername(username);
        user.setPassword(editForm.getPassword());
        user.setEmail(editForm.getEmail());
        userService.updateById(user.getUserId(), user);
        model.addAttribute("message", "Profile successfully updated!");
        return "profile";
    }


}
