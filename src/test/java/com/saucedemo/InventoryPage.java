package com.saucedemo;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;


import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;

public class InventoryPage {
    private final ElementsCollection addToCartButtons = $$x("//div[@class='pricebar']//button");


    public ArrayList<SelenideElement> itemToCart() {
        ArrayList<SelenideElement> items = new ArrayList<>();
        for (SelenideElement item: addToCartButtons) {
            items.add(item);
        }
        return items;
    }

}
