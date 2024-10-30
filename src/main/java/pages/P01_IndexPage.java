package pages;

import actions.CustomDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static common.PageBase.shortWait;

public class P01_IndexPage {
    // 1-constructor builder design pattern
    // 2-locaters
    // 3- public action methods

    // define web driver
    WebDriver driver;

    //define constructor
    public P01_IndexPage(WebDriver driver) {
        this.driver = driver;
    }

    //locaters
    private final By MYACCOUNT_LIST = By.xpath("(//a)[2]");
    private final By REGISTER_BUTTON = By.xpath("//a[text()='Register']");
    private final By LOGIN_BUTTON = By.xpath("//a[text()='Login']");

    //public action method
    public P01_IndexPage openMyAccountList() {
        shortWait(driver).until(ExpectedConditions.elementToBeClickable(MYACCOUNT_LIST));
        new CustomDecorator(driver, MYACCOUNT_LIST).click();
        return this;
    }

    public P01_IndexPage clickRegisterButton() {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(REGISTER_BUTTON));
        new CustomDecorator(driver, REGISTER_BUTTON).click();
        return this;
    }

    public P01_IndexPage clickLoginButton() {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
        new CustomDecorator(driver, LOGIN_BUTTON).click();
        return this;
    }

}