package travel.actions;

import travel.elements.BookingPageElements;
import java.time.Duration;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;

public class BookingPageSteps extends BookingPageElements {

    public void setFirstName(String firsN){
        firstNameField.setValue(firsN);
    }
    public void setLastName(String lastN){
        lastNameField.setValue(lastN);
    }

    public void setEmailAddress(String email){
        emailField.setValue(email);
    }

    public void setPhone(String phone){
        phoneField.setValue(phone);
    }
    public void setAddress(String address){
        addressField.setValue(address);
    }

    public void setFirstTravelerFirstName(String firstN){
        traveler1FirstName.setValue(firstN);
    }

    public void setFirstTravelerLastName(String lastN){
        traveler1LastName.setValue(lastN);
    }

    public void setSecondTravelerFirstName(String firstN){
        traveler2FirstName.setValue(firstN);
    }

    public void setSecondTravelerLastName(String lastN){
        traveler2LastName.setValue(lastN);
    }

    public void checkPayLaterPaymentMethod(){
        payLaterButton.shouldBe(visible).click();
    }

    public void checkTermsCheckbox(){
        termAgreeCheckBox.shouldBe(visible, Duration.ofSeconds(10)).shouldBe(clickable).click();
    }

    public void scrollToTheConfirmButton(){
        bookConfirmButton.scrollIntoView(true).shouldBe(visible, Duration.ofSeconds(10));
 }

    public void clickConfirmBookingButton(){
        bookConfirmButton.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void waitUntilBookingDetailsIsVisible(){
        bookingDetailsForm.shouldBe(visible);
    }

}
