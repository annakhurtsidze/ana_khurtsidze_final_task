package shop.elements;

import org.openqa.selenium.By;

public class RegistrationElements {

    public By

    emailField  = By.xpath("//input[@id='reg_email']"),
    passwordField = By.xpath(("//input[@id='reg_password']")),
    registerButton = By.xpath("//input[@value='Register' and @type='submit']"),
    loginEmailField = By.id("username"),
    loginPasswordField =By.id("password"),
    loginButton = By.xpath("//input[@name='login']"),
    strongPasswordFlash = By.xpath("//div[contains(@class, 'woocommerce-password-strength')]");
}
