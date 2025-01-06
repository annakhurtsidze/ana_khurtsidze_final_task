package shop.actions;

import shop.elements.BasketElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class BasketActions extends BasketElements {
    public WebDriver driver;
   public WebDriverWait wait;
    public    JavascriptExecutor js;


    public BasketActions(WebDriver driver1){
        this.driver=driver1;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public void checkSoppingTableIsPresented(){
        Assert.assertTrue(driver.findElement(shopTable).isDisplayed());
    }

    public void removeItemFromBasket() {
        List<WebElement> items = driver.findElements(productRemoveButton);
        while (!items.isEmpty()) {
            items = driver.findElements(productRemoveButton);
            if (!items.isEmpty()) {
                WebElement item = items.get(0);
                item.click();
                wait.until(ExpectedConditions.stalenessOf(item));
            }
        }
    }

    public void assertEmptyBasketFlash(){
        Assert.assertTrue(driver.findElement(emptyBasketFlash).isDisplayed());
    }

    public void returnToShopButtonClick(){
        driver.findElement(returnToShopButton).click();
    }

    public void setCouponCode(String coupon){
        wait.until(ExpectedConditions.visibilityOfElementLocated(couponCodeField));
        driver.findElement(couponCodeField).sendKeys(coupon);
    }

    public void applyCouponButton(){
        driver.findElement(applyCouponButton).click();
    }

    public void assertThatCouponWorks(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(couponApplyFlash));
        Assert.assertTrue(driver.findElement(couponApplyFlash).isDisplayed());
    }

    public void removeCoupon(){
        wait.until(ExpectedConditions.elementToBeClickable(removeCouponLink));
        driver.findElement(removeCouponLink).click();
    }

    public void checkThatCouponIsRemoved(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(removeCouponFlash));
        Assert.assertTrue(driver.findElement(removeCouponFlash).isDisplayed());
    }

    public void clickOnCheckoutButton(){
        js = (JavascriptExecutor)  driver;
        js.executeScript("window.scrollBy(0, 600);");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(checkoutButton)));
        wait.until(ExpectedConditions.stalenessOf(driver.findElement(checkoutButton)));
        driver.findElement(checkoutButton).click();
    }

}
