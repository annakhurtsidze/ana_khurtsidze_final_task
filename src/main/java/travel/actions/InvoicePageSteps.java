package travel.actions;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.JavascriptExecutor;
import travel.elements.InvoicePageElements;
import java.time.Duration;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;


public class InvoicePageSteps extends InvoicePageElements {

    public void  assertThatInvoiceQrIsPresented(){
        invoiceQR.shouldBe(visible);
    }

    public void clickDownloadInvoice()  {
        JavascriptExecutor js = (JavascriptExecutor) Selenide.webdriver().driver().getWebDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        downloadInvoiceButton.scrollIntoView(true);
        downloadInvoiceButton.shouldBe(clickable).click();
        downloadInvoiceButton.shouldBe(visible, Duration.ofSeconds(30));
    }
}
