package com.saucedemo;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SwagLabsTest extends BaseTest {
    public final static String URL = "https://www.saucedemo.com";

    @Test
    public void saucedemoFirstItemTest() {
        LoginPage loginPage = new LoginPage(URL);
        InventoryPage inventoryPage = new InventoryPage();
        CartPage cartPage = new CartPage();
        InformationPage informationPage = new InformationPage();

        loginPage.login(loginPage.getUsername(), loginPage.getPassword());
        for (SelenideElement cart: inventoryPage.itemToCart()) {
            cart.click();
        }
        cartPage.toShopping();
        informationPage.fillInformation();

    }
}
