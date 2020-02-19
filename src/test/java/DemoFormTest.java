import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoFormTest {

    public static final String TEST_STRING = "Hello";

    @Test
    public void testMessage () throws Throwable {

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

            WebElement inputTextField = driver.findElement(By.id("user-message"));

            inputTextField.sendKeys(TEST_STRING);

            WebElement showMessageButton = driver.findElement(By.xpath("//button[contains(text(),'Show Message')]"));

            showMessageButton.click();

            WebElement outTextField = driver.findElement(By.id("display"));

            String outputMessage = outTextField.getText();

            assert TEST_STRING.equalsIgnoreCase(outputMessage);
        } catch (Throwable t) {
            throw t;
        } finally {
            driver.quit();
        }
    }

    @Test
    public void testMessage2 () {

    }
}
