package shop.actions;

import shop.elements.MyAccountElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MyAccountActions extends MyAccountElements {
    public WebDriver driver;
    public WebDriverWait wait;

    public MyAccountActions(WebDriver driver1){
        this.driver=driver1;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }


    public void clickOrdersLink(){
        wait.until(ExpectedConditions.elementToBeClickable(ordersLink));
        driver.findElement(ordersLink).click();
    }

   public void checkThatOrderIsPresented(){
       Assert.assertTrue(driver.findElement(orderNum).isDisplayed());
   }

   public void clickAccountDetailsLink(){
       wait.until(ExpectedConditions.elementToBeClickable(accountDetailsLink));
        driver.findElement(accountDetailsLink).click();
   }

   public void setFirstName(String firstName){
        driver.findElement(accountFirstName).sendKeys(firstName);
   }

    public void setLastName(String lastName){
        driver.findElement(accountLastName).sendKeys(lastName);
    }

   public void inputCurrentPassword(String currentPass){
        driver.findElement(currentPasswordField).sendKeys(currentPass);
   }

   public void inputNewPassword(String newPassword){
        driver.findElement(newPasswordField).sendKeys(newPassword);
   }

    public void confirmPassword(String confirmPassword){
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void clickSaveChangesButton(){
        driver.findElement(saveChangesButton).click();
    }

    public void checkAccountDetailsChanged(){
        Assert.assertTrue(driver.findElement(detailChangeFlash).isDisplayed());
    }

    public void clickLogout(){
        driver.findElement(logoutLink).click();
    }


    public void checkThatContentIsDisplayedAfterLogin(){
        Assert.assertTrue(driver.findElement(accountContent).isDisplayed());
    }
}
