package com.saucedemo;

import org.junit.jupiter.api.Test;


public class SwagLabsTest extends BaseTest {
    public final static String URL = "https://www.saucedemo.com";

    @Test
    public void saucedemoUiTest() {
        LoginPage loginPage = new LoginPage(URL);
        loginPage.login(loginPage.getUsername(), loginPage.getPassword());
    }
}
