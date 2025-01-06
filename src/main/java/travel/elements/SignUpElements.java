package travel.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class SignUpElements {
    public SelenideElement

    firstNameElement = $("#firstname"),
    lastNameElement = $("#last_name"),
    country = $x("//button[@title='Select Country']"),
    afghanistanFromCountryDropDown = $x("//ul[contains(@class, 'inner') and contains(@class, 'show')]//li[2]"),
    phoneNumberElement = $("#phone"),
    emailAddressElement = $("#user_email"),
    passwordElement = $("#password"),
    signUpButton = $x("//div[@class='signup_button']"),
    accountCreatedSuccessfulMessage = $x("//strong[(contains(normalize-space(text()), 'Your account has been created'))]\n");
}
