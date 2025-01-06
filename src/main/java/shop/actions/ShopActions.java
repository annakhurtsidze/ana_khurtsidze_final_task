package shop.actions;

import org.openqa.selenium.interactions.Actions;
import shop.elements.ShopElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ShopActions extends ShopElements {

    public WebDriver driver;
    public WebDriverWait wait;
    public    JavascriptExecutor js;
    public Actions action;

    public ShopActions (WebDriver driver1){
        this.driver=driver1;
        action = new Actions(driver);
    }

    public void clickOnPriceSorter(){
        driver.findElement(priceSort).click();
    }

    public void priceOrderFromLowToHigh(){
        driver.findElement(priceAscOrder).click();
    }

    public void checkThatPriceIsOrderedInAsc(){
        List<WebElement> prices = driver.findElements(productPrices);
        boolean isSortedAsc = true;

        for(int i=1; i<prices.size(); i++){
            double price1 = Double.parseDouble(prices.get(i - 1).getText().replaceAll("[^\\d.]", ""));
            double price2 = Double.parseDouble(prices.get(i).getText().replaceAll("[^\\d.]", ""));

            if( price1 > price2){
                isSortedAsc=false;
                break;
            }
        }
        Assert.assertTrue(isSortedAsc);
    }

    public  void selectAndAssertJsCategory(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(jsProductCategory));
        driver.findElement(jsProductCategory).click();
}


    public void assertProductCategoryJS(){

        List<WebElement> jsProducts = driver.findElements(productsOnPage);
        String jsCategoryAttribute = "product_tag-javascript";
        boolean allHaveProductTag = true;

        for (WebElement product : jsProducts){
            String attributeValue = product.getAttribute("class");
            if (attributeValue == null || !attributeValue.contains(jsCategoryAttribute)) {
                allHaveProductTag = false;
                break;
            }
        }
        Assert.assertTrue(allHaveProductTag);
}

    public void checkNumberOfBooksAfterSelectJs(){
        List<WebElement> jsProductPrices = driver.findElements(productPrices);
        String productCountText = driver.findElement(jsCategoryProductCount).getText().replaceAll("[^0-9]", "");
        int productCount = Integer.parseInt(productCountText);
        Assert.assertEquals(productCount, jsProductPrices.size());
    }

    public void movePriceSlider(){
        WebElement leftSlider = driver.findElement(leftSliderButton);

        action.clickAndHold(leftSlider).moveByOffset(120,0).release().perform();
//        while(driver.findElement(fromPriceLabel).getText() == "300"){
//            action.clickAndHold(leftSlider).moveByOffset(86,0).release().perform();
//        }
    }

    public void clickFilterButton(){
        driver.findElement(filterButton).click();
    }

    public void assertThatOneBookIsLeftAfterPriceFilter(){
        List<WebElement> products = driver.findElements(productsOnPage);
        int productCount = products.size();
        Assert.assertEquals(productCount, 1);
    }

    public void clickOnAddToBasketButton(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        List<WebElement> addToBasketButtons = driver.findElements(addBasketButton);
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400);");

        for(WebElement button : addToBasketButtons){
            button.click();
            wait.until(ExpectedConditions.elementToBeClickable(viewBasketTitle));
        }

    }

    public void checkThatCartIsUpdatedAfterProductAdd(){
        WebElement classAttribute = driver.findElement(shoppingCartLink);
        String cl = classAttribute.getAttribute("class");
        Assert.assertFalse(cl.contains("empty-wpmenucart-visible"));
    }


    public void shoppingCartClick(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.findElement(shoppingCartLink).click();
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartLink));
    }

    public void addHtmlFormBook(){
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 900);");
        driver.findElement(htmlFormBook).click();
    }

    public void addSeleniumRuby(){
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
        driver.findElement(seleniumRubyBook).click();
    }

}
