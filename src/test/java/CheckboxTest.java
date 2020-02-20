import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckboxTest extends BasicTest {
    @Test
    public void singleCheckboxTest () {
        setup();

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }
}
