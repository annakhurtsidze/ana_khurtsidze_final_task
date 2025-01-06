package shop.elements;

import org.openqa.selenium.By;

public class ShopElements {
    public By

            priceSort = By.xpath("//select[@name='orderby']"),

    priceAscOrder = By.xpath("//option[@value='price']"),
            jsProductCategory = By.xpath("//li[contains(@class, 'cat-item-21')]//a"),
    jsCategoryProductCount = By.xpath("//li[contains(@class, 'cat-item-21')]//span"),
    productsOnPage = By.xpath("//ul[contains(@class, 'products')]//li"),
    productPrices = By.xpath("//span[@class='price']//ins | //span[@class='price']//span[contains(@class, 'woocommerce-Price-amount') and not(ancestor::span[@class='price']/del)]"),
    addBasketButton = By.xpath("//ul[contains(@class, 'products')]//li//a[contains(@class, 'add_to_cart_button')]"),
    viewBasketTitle = By.xpath("//a[@title='View Basket']"),
            shoppingCartLink = By.id("wpmenucartli"),
    htmlFormBook = By.xpath("//li[contains(@class, 'post-181')]//a[2]"),
    seleniumRubyBook = By.xpath("//li[contains(@class, 'post-160')]//a[2]"),
    leftSliderButton = By.xpath("//span[@tabindex='0'][1]"),
    filterButton = By.xpath("//button[@type='submit' and @class='button']"),
    fromPriceLabel = By.xpath("//span[@class='from']");
}
