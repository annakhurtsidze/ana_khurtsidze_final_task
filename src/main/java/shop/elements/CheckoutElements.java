package shop.elements;

import org.openqa.selenium.By;

public class CheckoutElements {
    public By

    firstName = By.id("billing_first_name"),
    lastName = By.id("billing_last_name"),
    phone = By.id("billing_phone"),
    streetAddress = By.id("billing_address_1"),
    cityAddress = By.id("billing_city"),
    postCode= By.id("billing_postcode"),
    cashOnDeliveryRadioButton = By.xpath("//input[@id='payment_method_cod']"),
    placeOrderButton = By.xpath("//input[@id='place_order']");
}
