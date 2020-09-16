package com.github.perscholas.controllers;

import com.github.perscholas.model.User;
import com.github.perscholas.service.UserService;
import com.github.perscholas.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/")
public class UserController {
    private UserService userService;
    private UserValidator userValidator;

    @Autowired
    public UserController(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;

    }

    @InitBinder("user")
    public void customizeBinding (WebDataBinder binder) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        dateFormatter.setLenient(false);
        binder.registerCustomEditor(Date.class, "birthdate",
                new CustomDateEditor(dateFormatter, true));
    }

    @PostMapping(value = "/save")
    public String registration(@Valid @ModelAttribute("userForm") User userForm,
                                BindingResult bindingResult, Model model) {

        userValidator.validate(userForm, bindingResult);
        if (bindingResult.hasErrors()) {
            return "register";
        }
        userService.create(userForm);
        model.addAttribute("userFirstName", userForm.getFirstName());
        return "userDashboard";
    }




//    @GetMapping(value = "/login")
//    public String login(Model model, String error, String logout) {
//        if (error != null) {
//            model.addAttribute("error", "Your username and password are invalid.");
//        }
//        if (logout != null) {
//            model.addAttribute("message", "You have logged out successfully.");
//        }
//
//        return "login";
//    }

}

