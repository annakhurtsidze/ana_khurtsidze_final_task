package travel.actions;

import static com.codeborne.selenide.Selenide.sleep;
import travel.elements.SignUpElements;

import java.time.Duration;


import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;

public class SignUpPageSteps extends SignUpElements {
    public void setFirstName(String firstName){
        firstNameElement.setValue(firstName);
    }

    public void setLastName(String lastName){
        lastNameElement.setValue(lastName);
    }

    public void clickCountryDropDown(){
        country.click();
    }

    public void setCountry( ){
        afghanistanFromCountryDropDown.click();
    }

    public void setPhoneNumber(String phoneNum){
        phoneNumberElement.setValue(phoneNum);
    }

    public void setEmailAddress(String emailAddress){
        emailAddressElement.setValue(emailAddress);
    }
    public void setPassword(String password){
        passwordElement.setValue(password).shouldBe(visible, Duration.ofSeconds(10));
        sleep(3000);
    }

    public void clickOnSignUp(){
        signUpButton.scrollIntoView(true);
        signUpButton.shouldBe(clickable).click();
    }

    public void assertThatAccountCreatedSuccessfully(){
        accountCreatedSuccessfulMessage.shouldBe(visible);
    }
}
