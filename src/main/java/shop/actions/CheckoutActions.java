package shop.actions;

import shop.elements.CheckoutElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CheckoutActions extends CheckoutElements {
    public WebDriver driver;
    public JavascriptExecutor js;

    public CheckoutActions(WebDriver driver1){
        this.driver=driver1;
    }

    public void setFirstName(String firstname){
        driver.findElement(firstName).sendKeys(firstname);}

    public void setLastName(String lastname){
        driver.findElement(lastName).sendKeys(lastname);}

    public void setPhoneNumber(String phoneNum){
        driver.findElement(phone).sendKeys(phoneNum);}

    public void setStreetAddress(String street){
        driver.findElement(streetAddress).sendKeys(street);}

    public void setCityAddress(String city){
        driver.findElement(cityAddress).sendKeys(city);}

    public void setPostalCode(String postalCode){
        driver.findElement(postCode).sendKeys(postalCode);}

    public void checkCashOnDeliveryOption(){
        js = (JavascriptExecutor)  driver;
        js.executeScript("window.scrollBy(0, 600);");
        driver.findElement(cashOnDeliveryRadioButton).click();
    }

    public void placeOrderClick(){
        driver.findElement(placeOrderButton).click();
    }


}
