package testcases;

import org.testng.annotations.Test;
import pages.P02_LoginPage;

import static common.PageBase.captureScreenshot;

public class TC02_Login extends TestBase{

    String email="test";
    String password="test";

    @Test(priority = 1,description = "Validate Login to TutorialsNinja Web Application")
    public void validateLoginToSystem(){
        new P02_LoginPage(driver).enterEmail(email).enterPassword(password).clickLoginButton();
        // take screenshot
        captureScreenshot(driver,"login_successfully");
        // hard assert
    }
}
