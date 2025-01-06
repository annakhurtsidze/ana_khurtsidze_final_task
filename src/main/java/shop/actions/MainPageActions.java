package shop.actions;

import shop.elements.MainPageElements;
import org.openqa.selenium.WebDriver;


public class MainPageActions extends MainPageElements {
    public WebDriver driver;

    public MainPageActions(WebDriver driver1){
        this.driver=driver1;
    }

    public void goToTheShopPage(){
        driver.findElement(shopLink).click();
    }

    public void goToMyAccount(){
        driver.findElement(myAccount).click();
    }

}
