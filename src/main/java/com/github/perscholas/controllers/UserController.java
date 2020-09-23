package com.github.perscholas.controllers;

import com.github.perscholas.model.User;
import com.github.perscholas.service.UserService;
import com.github.perscholas.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

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
        User existing = userService.findByUsername(userForm.getUsername());
        if (existing != null) {
            bindingResult.rejectValue("username", null, "There is already an account registered with that username");
        }
        userValidator.validate(userForm, bindingResult);
        if (bindingResult.hasErrors()) {
            return "register";
        }
        userService.create(userForm);
        model.addAttribute("userFirstName", userForm.getFirstName());
        return "userDashboard";
    }
    @GetMapping(value = "/show/{id}")
    public ResponseEntity<User> readById(@PathVariable Long id) {
        return new ResponseEntity<>(userService.readById(id), HttpStatus.OK);
    }



}

