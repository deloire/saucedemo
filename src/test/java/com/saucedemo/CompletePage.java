package com.saucedemo;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CompletePage {
    private final SelenideElement finishHeader =
            $x("//h2");

    public String headerText() {
        return finishHeader.getText();
    }
}
