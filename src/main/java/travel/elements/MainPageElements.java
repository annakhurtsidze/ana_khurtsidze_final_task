package travel.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPageElements {
    public SelenideElement

    accountDropdown = $x("(//li[@class='nav-item dropdown'])[last()]"),
    signUpButton = $x("//strong[contains(text(), 'Signup')]"),
    hotelsLink = $x("//a[contains(text(), 'Hotels')]");
}
