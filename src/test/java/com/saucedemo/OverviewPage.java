package com.saucedemo;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class OverviewPage {
    private final SelenideElement finishButton =
            $x("//div[@class='cart_footer']//button[@id='finish']");
    private final SelenideElement totalPrice =
            $x("//div[@class='summary_total_label']");

    public String getTotalPrice() {
        return totalPrice.getText();
    }

    public void clickFinish() {
        finishButton.click();
    }
}
