import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

abstract public class BasicTest {
    protected WebDriver driver;

    protected void setup () {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        driver = new FirefoxDriver();
    }
}
