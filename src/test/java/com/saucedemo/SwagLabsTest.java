package com.saucedemo;

import org.junit.jupiter.api.Test;


public class SwagLabsTest extends BaseTest {
    public final static String URL = "https://www.saucedemo.com";

    @Test
    public void saucedemoFirstItemTest() {
        LoginPage loginPage = new LoginPage(URL);
        InventoryPage inventoryPage = new InventoryPage();
        loginPage.login(loginPage.getUsername(), loginPage.getPassword());
        inventoryPage.getXpath().getFirst().click();
    }
}
