package com.saucedemo;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$x;

public class InformationPage {
    private final SelenideElement firstNameInput =
            $x("//div[@class='form_group']//input[@id='first-name']");
    private final SelenideElement lastNameInput =
            $x("//div[@class='form_group']//input[@id='last-name']");
    private final  SelenideElement zipInput =
            $x("//div[@class='form_group']//input[@id='postal-code']");
    private final SelenideElement continueButton =
            $x("//input[@type='submit']");

    public void fillInformation() {
        Faker faker = new Faker();
        firstNameInput.setValue(faker.name().firstName());
        lastNameInput.setValue(faker.name().lastName());
        zipInput.setValue(faker.address().zipCode());
        Selenide.sleep(4000);
        continueButton.click();
    }
}
