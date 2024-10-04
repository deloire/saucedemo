package com.saucedemo;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private final SelenideElement usernameInput = $x("//input[@type='text']");
    private final SelenideElement passwordInput = $x("//input[@type='password']");
    private final SelenideElement submitButton = $x("//input[@type='submit']");

    public LoginPage(String url) {
        Selenide.open(url);
    }

    public String getUsername() {
        Random random = new Random();
        ArrayList<String> usernames = new ArrayList<>
                (Arrays.asList($("[id=login_credentials]").getText().split("\n")));
        usernames.removeFirst();
        return usernames.get(random.nextInt(usernames.size()));
    }

    public String getPassword() {
        ArrayList<String> password = new ArrayList<>
                (Arrays.asList($("[class=login_password]").getText().split("\n")));
        password.removeFirst();
        return password.getFirst();
    }

    public void login(String username, String password) {
        usernameInput.setValue(username);
        passwordInput.setValue(password);
        submitButton.click();
    }
}
