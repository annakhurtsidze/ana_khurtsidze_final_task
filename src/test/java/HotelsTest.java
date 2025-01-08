import org.testng.annotations.Test;
import travel.setUp.SetUpClass;
import static com.codeborne.selenide.Selenide.open;

public class HotelsTest extends SetUpClass {

    @Test(priority = 1)
    public void testUserCanSignUpAndCreateAccount(){
        mainPageSteps.clickAccountButton();
        mainPageSteps.clickSignupButton();
        signUpPageSteps.setFirstName(HotelTestData.FIRST_NAME);
        signUpPageSteps.setLastName(HotelTestData.LAST_NAME);
        signUpPageSteps.clickCountryDropDown();
        signUpPageSteps.setCountry();
        signUpPageSteps.setPhoneNumber(HotelTestData.PHONE_NUMBER);
        signUpPageSteps.setEmailAddress(HotelTestData.EMAIL_ADDRESS);
        signUpPageSteps.setPassword(HotelTestData.PASSWORD);
        signUpPageSteps.clickOnSignUp();
        signUpPageSteps.assertThatAccountCreatedSuccessfully();
    }

    @Test(priority = 2)
    public void testUserCanChooseHotel(){
        mainPageSteps.goToHotelsPage();
        hotelsPageSteps.clickCityDropdown();
        hotelsPageSteps.selectCity();
        hotelsPageSteps.setCheckinAndCheckoutDate();
        hotelsPageSteps.clickSearchButton();
        hotelsPageSteps.waitUntilPageLoad();
        hotelsPageSteps.filterDescOrder();
        hotelsPageSteps.clickApplyFilterButton();
        hotelsPageSteps.clickOnViewMoreButton();
    }

    @Test(priority =  3)
    public void testUserCanBookRoom(){
        roomPageSteps.clickBookNowButton();
        bookingPageSteps.waitUntilBookingDetailsIsVisible();
        bookingPageSteps.setFirstName(HotelTestData.FIRST_NAME);
        bookingPageSteps.setLastName(HotelTestData.LAST_NAME);
        bookingPageSteps.setEmailAddress(HotelTestData.EMAIL_ADDRESS);
        bookingPageSteps.setPhone(HotelTestData.PHONE_NUMBER);
        bookingPageSteps.setAddress(HotelTestData.ADDRESS);
        bookingPageSteps.setFirstTravelerFirstName(HotelTestData.FIRST_TRAVELER_FIRST_NAME);
        bookingPageSteps.scrollToTheConfirmButton();
        bookingPageSteps.setFirstTravelerLastName(HotelTestData.FIRST_TRAVELER_LAST_NAME);
        bookingPageSteps.setSecondTravelerFirstName(HotelTestData.SECOND_TRAVELER_FIRST_NAME);
        bookingPageSteps.setSecondTravelerLastName(HotelTestData.SECOND_TRAVELER_LAST_NAME);
        bookingPageSteps.checkPayLaterPaymentMethod();
        bookingPageSteps.scrollToTheConfirmButton();
        bookingPageSteps.checkTermsCheckbox();
        bookingPageSteps.clickConfirmBookingButton();
    }
    @Test(priority = 4)
    public void testUserCanDownloadInvoice(){
        fileUploadActions.deleteAllGeneratedInvoicesBeforeTest(HotelTestData.DOWNLOADS_DIRECTORY_PATH);
        invoicePageSteps.assertThatInvoiceQrIsPresented();
        invoicePageSteps.clickDownloadInvoice();
    }

    @Test(priority = 5)
    public void testUserCanUploadFile(){
        open("https://webdriveruniversity.com/File-Upload/index.html");
        fileUploadActions.uploadFileClick();
        fileUploadActions.clickSubmitButton();
    }

}
