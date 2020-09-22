package com.github.perscholas.controllers;

import junit.framework.TestCase;

public class welcomeControllerTest extends TestCase {

    public void testWelcome() {
        WelcomeController homeController = new WelcomeController();
        String result = homeController.welcome();
        assertEquals(result, "welcome");
    }

    public void testRegistration() {

    }

    public void testLogin() {
    }
}