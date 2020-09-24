package com.github.perscholas.config;

import com.github.perscholas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by leon on 9/24/2020.
 */
@Configuration
public class UserConfig {
    @Autowired
    private UserService userService;

    @PostConstruct
    public void setup() {
        purgeUsers();
    }

    private void purgeUsers() {
        userService
                .findAllUsers()
                .stream()
                .forEach(user -> userService.deleteById(user.getUserId()));
    }
}
