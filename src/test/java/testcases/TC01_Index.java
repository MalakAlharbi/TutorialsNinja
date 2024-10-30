package testcases;

import org.testng.annotations.Test;
import pages.P01_IndexPage;

import static common.PageBase.captureScreenshot;

public class TC01_Index extends TestBase{

    @Test(priority = 1,description = "Validate Navigation to login page")
    public void validateNavigationToLoginPage(){
        new P01_IndexPage(driver).openMyAccountList().clickLoginButton();
        // take screenshot
        captureScreenshot(driver,"login");

        // perform assertion
    }

    @Test(priority = 2,description = "Validate Navigation to register page")
    public void validateNavigationToRegisterPage(){
        new P01_IndexPage(driver).openMyAccountList().clickRegisterButton();
        // take screenshot
        captureScreenshot(driver,"login");
    }
}
