
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import shop.utils.SetUp;


public class ShopTest extends SetUp {


    @Test(priority = 20)
    public void registrationTest()  {
        registerActions.setEmail(ShopTestData.EMAIL1);
        registerActions.setPassword(ShopTestData.PASSWORD1);
        registerActions.clickRegisterButton();
    }

    @Test(priority =  22)
    public void  productSortByPrice(){
        mainPageActions.goToTheShopPage();
        shopActions.clickOnPriceSorter();
        shopActions.priceOrderFromLowToHigh();
        shopActions.checkThatPriceIsOrderedInAsc();
    }


    @Test(priority =  23)
    public void filterByJSInCategory()  {
        shopActions.selectAndAssertJsCategory();
        shopActions.checkNumberOfBooksAfterSelectJs();
        shopActions.movePriceSlider();
        shopActions.clickFilterButton();
        shopActions.assertProductCategoryJS();
        shopActions.assertThatOneBookIsLeftAfterPriceFilter();
    }

    @Test (priority = 24, dependsOnMethods = "filterByJSInCategory")
    public void addProductToBasket()  {
        shopActions.clickOnAddToBasketButton();
        shopActions.checkThatCartIsUpdatedAfterProductAdd();
        shopActions.shoppingCartClick();
    }

    @Test(priority = 25, dependsOnMethods="addProductToBasket")
    public void basketTest()  {
        basketActions.checkSoppingTableIsPresented();
        basketActions.removeItemFromBasket();
        basketActions.assertEmptyBasketFlash();
        basketActions.returnToShopButtonClick();
        shopActions.addHtmlFormBook();
        shopActions.addSeleniumRuby();
        shopActions.shoppingCartClick();
        shopActions.shoppingCartClick();
    }

    @Test(priority =  26)
    public void couponApplyTest(){
        basketActions.setCouponCode(ShopTestData.COUPON_CODE);
        basketActions.applyCouponButton();
        basketActions.assertThatCouponWorks();
        basketActions.removeCoupon();
        basketActions.checkThatCouponIsRemoved();
        basketActions.setCouponCode(ShopTestData.COUPON_CODE);
        basketActions.applyCouponButton();
        basketActions.assertThatCouponWorks();
        basketActions.clickOnCheckoutButton();
    }


    @Test(priority = 27)
    public void checkoutTest(){
        checkoutActions.setFirstName(ShopTestData.FIRST_NAME);
        checkoutActions.setLastName(ShopTestData.LAST_NAME);
        checkoutActions.setPhoneNumber(ShopTestData.PHONE);
        checkoutActions.setStreetAddress(ShopTestData.STREET_ADDRESS);
        checkoutActions.setCityAddress(ShopTestData.CITY);
        checkoutActions.setPostalCode(ShopTestData.POSTAL_CODE);
        checkoutActions.checkCashOnDeliveryOption();
        checkoutActions.placeOrderClick();
    }

    @Test(priority = 28)
    public void orderDetailsTest(){
        orderActions.checkThatSuccessfulOrderFlashIsPresented();
        orderActions.checkCashOnDeliveryPaymentMethod();
        orderActions.checkThatOrderNumIsDisplayed();


    }

    @Test(priority = 29)
    public void myAccountTest(){
        mainPageActions.goToMyAccount();
        myAccountActions.clickOrdersLink();
        myAccountActions.checkThatOrderIsPresented();
    }

    @Test(priority = 30)
    public void changePasswordTest(){
        myAccountActions.clickAccountDetailsLink();
        myAccountActions.setFirstName(ShopTestData.FIRST_NAME);
        myAccountActions.setLastName(ShopTestData.LAST_NAME);
        myAccountActions.inputCurrentPassword(ShopTestData.PASSWORD1);
        myAccountActions.inputNewPassword(ShopTestData.NEWPASSWORD);
        myAccountActions.confirmPassword(ShopTestData.NEWPASSWORD);
        myAccountActions.clickSaveChangesButton();
        myAccountActions.checkAccountDetailsChanged();
        myAccountActions.clickLogout();
    }

    @Test(priority = 31)
    public void loginAfterPasswordChangeTest(){
        registerActions.inputLoginEmail(ShopTestData.EMAIL1);
        registerActions.inputLoginPassword(ShopTestData.NEWPASSWORD);
        registerActions.clickLoginButton();
        myAccountActions.checkThatContentIsDisplayedAfterLogin();
    }


    }


