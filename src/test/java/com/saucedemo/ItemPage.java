package com.saucedemo;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class ItemPage {
    private final SelenideElement productPrice = $x("//div[@class='inventory_details_price']");

    public String getProductPrice() {
        return productPrice.getText();
    }
}
