import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoFormTest {

    @Test
    public void testMessage () {

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        driver.quit();
    }

    @Test
    public void testMessage2 () {

    }
}
