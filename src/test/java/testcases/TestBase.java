package testcases;

import common.MyScreenRecorder;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static common.PageBase.quitBrowser;
import static drivers.DriverFactory.getNewInstance;
import static drivers.DriverHolder.getDriver;
import static drivers.DriverHolder.setDriver;

public class TestBase {
    static WebDriver driver;

    @BeforeSuite
    public void beforeSuite() throws Exception {
        MyScreenRecorder.startRecording("TutorialsNinja TestCases");
    }

    @Parameters("browsername")
    @BeforeTest
    public void setupDriver(String browsername) {
        setDriver(getNewInstance(browsername));
        driver = getDriver();

        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
    }

    @AfterTest
    public void teardown() {
        quitBrowser(driver);
    }

    @AfterSuite
    public void afterSuite() throws Exception {
        MyScreenRecorder.stopRecording();
    }
}