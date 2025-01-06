package shop.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import shop.actions.*;


public class SetUp {
   public WebDriver driver;
    public RegisterActions registerActions;
    public MainPageActions mainPageActions;
    public ShopActions shopActions;
    public BasketActions basketActions;
    public CheckoutActions checkoutActions;
    public OrderActions orderActions;
    public MyAccountActions myAccountActions;


    @BeforeClass
    public void openBrows(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/my-account/");
    }

    @AfterClass
    public void closeBrows(){
        driver.close();
    }

    @BeforeClass
    public void setUpActions() {
        registerActions = new RegisterActions(driver);
        mainPageActions = new MainPageActions(driver);
        shopActions = new ShopActions(driver);
        basketActions = new BasketActions(driver);
        checkoutActions = new CheckoutActions(driver);
        orderActions = new OrderActions(driver);
        myAccountActions = new MyAccountActions(driver);
    }
}
