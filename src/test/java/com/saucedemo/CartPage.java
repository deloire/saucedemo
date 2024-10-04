package com.saucedemo;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CartPage {
    private final SelenideElement cartButton =
            $x("/html/body/div/div/div/div[1]/div[1]/div[3]/a");
    private final SelenideElement checkoutButton =
            $x("//div//button[@name='checkout']");

    public void toShopping() {
        cartButton.click();
        Selenide.sleep(3000);
        checkoutButton.click();
    }

}
