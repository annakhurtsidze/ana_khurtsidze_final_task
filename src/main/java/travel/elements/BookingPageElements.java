package travel.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BookingPageElements {
    public SelenideElement

    firstNameField = $x("//input[@placeholder='First Name']"),
    lastNameField = $x("//input[@placeholder='Last Name']"),
    emailField =  $x("//input[@placeholder='Email']"),
    phoneField = $x("//input[@placeholder='Phone']"),
    addressField =  $x("//input[@placeholder='Address']"),
    traveler1FirstName = $x("//input[@name='firstname_1']"),
            traveler1LastName = $x("//input[@name='lastname_1']"),
            traveler2FirstName = $x("//input[@name='firstname_2']"),
            traveler2LastName = $x("//input[@name='lastname_2']"),
    payLaterButton = $("#gateway_pay_later"),
    termAgreeCheckBox = $("#agreechb"),
    bookConfirmButton = $("#booking"),
    cancellationAlert= $x("//div[@class='alert alert-danger p-3 mt-2']"),
    bookingDetailsForm = $x("//div[@class='form-box booking-detail-form sticky-top']");

}
