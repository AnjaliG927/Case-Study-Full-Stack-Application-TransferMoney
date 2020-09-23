package com.github.perscholas.controllers;

import com.github.perscholas.model.User;
import junit.framework.TestCase;

public class welcomeControllerTest extends TestCase {

    public void testWelcome() {
        WelcomeController homeController = new WelcomeController();
        String result = homeController.welcome();
        assertEquals(result, "welcome");
    }


    public void testLogin() {
        WelcomeController homeController = new WelcomeController();
        String result = homeController.login();
        assertEquals(result, "login");
    }
}