package shop.elements;

import org.openqa.selenium.By;

public class OrderElements {
    public By

    successfulOrderFlash = By.xpath("//p[@class='woocommerce-thankyou-order-received']"),
    paymentMethodInHeader = By.xpath("//li[@class='method']//strong"),
    paymentMethodInProductDetails = By.xpath("//td[contains(text(), 'Cash on Delivery')]"),
    orderNumber = By.xpath("//li[@class='order']//strong");

}
