package shop.elements;

import org.openqa.selenium.By;

public class MyAccountElements {
    public By

    ordersLink = By.xpath("//li[contains(@class, 'woocommerce-MyAccount-navigation-link--orders')]//a"),
    orderNum = By.xpath("//td[@class='order-number']"),
    accountDetailsLink = By.xpath("//li[contains(@class, 'woocommerce-MyAccount-navigation-link--edit-account')]//a"),
    currentPasswordField = By.id("password_current"),
    newPasswordField = By.id("password_1"),
    confirmPasswordField = By.id("password_2"),
    saveChangesButton = By.xpath("//input[@name='save_account_details']"),
    logoutLink = By.xpath("//li[contains(@class, 'woocommerce-MyAccount-navigation-link--customer-logout')]//a"),
    accountFirstName = By.id("account_first_name"),
            accountLastName = By.id("account_last_name"),
    detailChangeFlash = By.xpath("//div[contains(@class, 'woocommerce-message') and contains(text(), 'Account details changed successfully.')]"),
    accountContent = By.className("woocommerce-MyAccount-content");
}
