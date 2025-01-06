package travel.setUp;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import travel.actions.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SetUpClass {
    public MainPageSteps mainPageSteps;
    public SignUpPageSteps signUpPageSteps;
    public HotelsPageSteps hotelsPageSteps;
   public RoomPageSteps roomPageSteps;
    public BookingPageSteps bookingPageSteps;
    public InvoicePageSteps invoicePageSteps;

    @BeforeClass
    public void openBrows(){
        open("https://www.phptravels.net/");
        getWebDriver().manage().window().maximize();
    }

    @AfterClass
    public void closeBrows(){
        closeWebDriver();
    }

    @BeforeClass
    public void setUpActions(){
        mainPageSteps = new MainPageSteps();
        signUpPageSteps = new SignUpPageSteps();
        hotelsPageSteps = new HotelsPageSteps();
        roomPageSteps =new RoomPageSteps();
        bookingPageSteps = new BookingPageSteps();
        invoicePageSteps = new InvoicePageSteps();
    }
}
