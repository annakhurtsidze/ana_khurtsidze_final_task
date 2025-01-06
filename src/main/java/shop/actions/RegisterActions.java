package shop.actions;

import shop.elements.RegistrationElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterActions extends RegistrationElements {

    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;
    public JavascriptExecutor js ;

    public RegisterActions(WebDriver driver1){
        this.driver=driver1;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.actions = new Actions(driver);
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    //ეს მეთოდი სხვანაირად ვერ დავჰენდლე, ხელით პაროლის შეყვანისას როგორც კი სიმბოლოს შევიყვან გამოდის პაროლის სიძლიერის მაჩვენებელი,
    //sendkeys-ს მეთოდით ეგრევე ისეტებოდა რასაც ვაგზავნიდი და არც ვეითით ელოდებოდა მაჩვენებელს ამიტომ ვიყენებ ექშენს.
    //ექშენ კლასიც ორჯერ იმიტომ მაქვს რომ მხოლოდ  ესე აღიქვა ამ ველზე მოქმედება და გამოიტანა პაროლის სიძლიერის მაჩვენებელი,
    // ამიტომ ჯერ ვსეტავ პაროლს, მერე ვშლი და მერე თავიდან ვსეტავ
    public void setPassword(String password){
        actions.moveToElement(driver.findElement(passwordField))
                .click()
                .sendKeys(password)
                .perform();

        driver.findElement(passwordField).clear();
        actions.moveToElement(driver.findElement(passwordField))
                .click()
                .sendKeys(password)
                .perform();
    }

    public void clickRegisterButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(strongPasswordFlash));
        driver.findElement(registerButton).click();

    }

    public void inputLoginEmail(String loginEmail){
        driver.findElement(loginEmailField).sendKeys(loginEmail);
    }

    public void inputLoginPassword(String loginPass){
        driver.findElement(loginPasswordField).sendKeys(loginPass);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
}
