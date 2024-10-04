package com.saucedemo;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SwagLabsTest extends BaseTest {
    public final static String URL = "https://www.saucedemo.com";

    @Test
    public void saucedemoFirstItemTest() {
        LoginPage loginPage = new LoginPage(URL);
        InventoryPage inventoryPage = new InventoryPage();
        ItemPage itemPage = new ItemPage();

        loginPage.login(loginPage.getUsername(), loginPage.getPassword());
        String getElementPrice = inventoryPage.getItemPrice().getFirst();
        inventoryPage.getXpath().getFirst().click();
        Assertions.assertEquals(getElementPrice, itemPage.getProductPrice());
    }

    @Test
    public void saucedemoSecondItemTest() {
        LoginPage loginPage = new LoginPage(URL);
        InventoryPage inventoryPage = new InventoryPage();
        ItemPage itemPage = new ItemPage();

        loginPage.login(loginPage.getUsername(), loginPage.getPassword());
        String getElementPrice = inventoryPage.getItemPrice().get(1);
        inventoryPage.getXpath().get(1).click();
        Assertions.assertEquals(getElementPrice, itemPage.getProductPrice());
    }

    @Test
    public void saucedemoThirdItemTest() {
        LoginPage loginPage = new LoginPage(URL);
        InventoryPage inventoryPage = new InventoryPage();
        ItemPage itemPage = new ItemPage();

        loginPage.login(loginPage.getUsername(), loginPage.getPassword());
        String getElementPrice = inventoryPage.getItemPrice().get(2);
        inventoryPage.getXpath().get(2).click();
        Assertions.assertEquals(getElementPrice, itemPage.getProductPrice());
    }
}
