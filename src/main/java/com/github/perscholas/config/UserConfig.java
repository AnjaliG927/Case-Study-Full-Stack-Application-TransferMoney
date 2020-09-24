package com.github.perscholas.config;

import com.github.perscholas.model.User;
import com.github.perscholas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * Created by leon on 9/24/2020.
 */
@Configuration
public class UserConfig {
    @Autowired
    private UserService userService;

    @PostConstruct
    public void setup() {
        User user = new User();
        user.setFirstName("Anjali");
        user.setLastName("G");
        user.setUsername("");
        purgeUsers();

    }

    private void purgeUsers() {
        userService
                .findAllUsers()
                .stream()
                .forEach(user -> userService.deleteById(user.getUserId()));
    }
}
