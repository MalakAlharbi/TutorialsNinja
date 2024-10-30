package pages;

import actions.CustomDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static common.PageBase.longWait;
import static common.PageBase.shortWait;

public class P02_LoginPage {
    // 1-constructor builder design pattern
    // 2-locaters
    // 3- public action methods

    // define web driver
    WebDriver driver;

    //define constructor
    public P02_LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //locaters
    private final By EMAIL_TEXT = By.id("input-email");
    private final By PASSWORD_TEXT = By.id("input-password");
    private final By LOGIN_BUTTON = By.xpath("//input[@type=\"submit\"]");

    //public action method
    public P02_LoginPage enterEmail(String email) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(EMAIL_TEXT));
        new CustomDecorator(driver, EMAIL_TEXT).sendKeys(email);
        return this;
    }

    public P02_LoginPage enterPassword(String password) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(PASSWORD_TEXT));
        new CustomDecorator(driver, PASSWORD_TEXT).sendKeys(password);
        return this;
    }

    public P02_LoginPage clickLoginButton() {
        longWait(driver).until(ExpectedConditions.elementToBeClickable(LOGIN_BUTTON));
        new CustomDecorator(driver, LOGIN_BUTTON).click();
        return this;
    }

}