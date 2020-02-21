import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

abstract public class BasicTest {

    private static final Logger LOGGER = Logger.getLogger(BasicTest.class);
    protected WebDriver driver;

    @BeforeMethod
    protected void setup () {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        driver = new FirefoxDriver();
    }

    @AfterMethod
    protected void close (ITestResult testResult) {
        
        makeScreenshot(testResult);

        driver.quit();
    }

    private void makeScreenshot(ITestResult testResult) {
        if (!testResult.isSuccess()) {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.moveFile(screenshot, new File("c:/Git/selenium2epam/screenshots/" + testResult.getName() + ".png"));
            } catch (IOException e) {
                LOGGER.error(e.getMessage());
            }
        }
    }
}
