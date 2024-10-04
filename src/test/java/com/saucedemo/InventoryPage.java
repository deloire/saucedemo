package com.saucedemo;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;


import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;

public class InventoryPage {
    private final ElementsCollection itemsPrice = $$x("//div[@class='pricebar']//div");
    private final ElementsCollection itemsXpath = $$x("//div[@class='inventory_item_img']//a");


    public List<String> getItemPrice() {
        return itemsPrice.texts();
    }

    public List<SelenideElement> getXpath() {
        List<SelenideElement> elementsXpath = new ArrayList<>();
        for (SelenideElement xpath: itemsXpath) {
            elementsXpath.add(xpath);
        }
        return elementsXpath;
    }

}
