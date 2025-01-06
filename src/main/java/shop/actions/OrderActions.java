package shop.actions;

import shop.elements.OrderElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class OrderActions extends OrderElements {
    public WebDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;


    public OrderActions(WebDriver driver1){
        this.driver=driver1;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void checkThatSuccessfulOrderFlashIsPresented(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(successfulOrderFlash));
        Assert.assertTrue(driver.findElement(successfulOrderFlash).isDisplayed());
    }

    public void checkThatOrderNumIsDisplayed(){
        Assert.assertTrue(driver.findElement(orderNumber).isDisplayed());
    }

    public void checkCashOnDeliveryPaymentMethod(){
        Assert.assertEquals(driver.findElement(paymentMethodInHeader).getText(), "Cash on Delivery");
        Assert.assertEquals(driver.findElement(paymentMethodInProductDetails).getText(), "Cash on Delivery");
    }

    public String getOrderNumber (){
        return driver.findElement(orderNumber).getText();
    }
}
