package com.github.perscholas.config;

import com.github.perscholas.model.User;
import com.github.perscholas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by leon on 9/24/2020.
 */
@Configuration
public class UserConfig {
    @Autowired
    private UserService userService;

    @PostConstruct
    public void setup() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setFirstName("Anjali");
        user.setLastName("G");
        user.setUsername("AnjaliG");
        user.setPassword("abcdefg");
        user.setBirthdate(dateFormat.parse("2014-11-6"));
        user.setEmail("abc@cde.com");
        user.setGender('F');
        userList.add(user);

        User user1 = new User();
        user1.setFirstName("Sammy");
        user1.setLastName("K");
        user1.setUsername("Sammyk");
        user1.setPassword("qwertyu");
        user1.setBirthdate(dateFormat.parse("1978-2-8"));
        user1.setEmail("def@456.com");
        user1.setGender('M');
        userList.add(user1);

        User user2 = new User();
        user2.setFirstName("Garry");
        user2.setLastName("H");
        user2.setUsername("GarryH");
        user2.setPassword("iop34as");
        user2.setBirthdate(dateFormat.parse("1983-1-10"));
        user2.setEmail("def@456.com");
        user2.setGender('M');
        userList.add(user2);

        User user3 = new User();
        user3.setFirstName("Carrol");
        user3.setLastName("M");
        user3.setUsername("CarolM");
        user3.setPassword("deftgy45");
        user3.setBirthdate(dateFormat.parse("1993-2-7"));
        user3.setEmail("carolM@yahoo.com");
        user3.setGender('F');
        userList.add(user3);

        User user4 = new User();
        user4.setFirstName("Micheal");
        user4.setLastName("T");
        user4.setUsername("Mickey");
        user4.setPassword("mickey654");
        user4.setBirthdate(dateFormat.parse("2013-12-8"));
        user4.setEmail("mickey@wertty.com");
        user4.setGender('M');
        userList.add(user4);
        System.out.println();

        userList.stream().forEach(userSave -> userService.create(userSave));


        // purgeUsers();

    }

    private void purgeUsers() {
        userService
                .findAllUsers()
                .stream()
                .forEach(user -> userService.deleteById(user.getUserId()));
    }
}
