package travel.actions;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.JavascriptExecutor;
import travel.elements.RoomPageElements;

public class RoomPageSteps extends RoomPageElements {

    public void clickBookNowButton(){
        JavascriptExecutor js = (JavascriptExecutor) Selenide.webdriver().driver().getWebDriver();
        js.executeScript("window.scrollBy(0, 300);");
        bookNowButton.click();
    }

}
