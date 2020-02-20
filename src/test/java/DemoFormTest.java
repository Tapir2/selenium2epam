import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DemoFormTest extends BasicTest {

    public static final String TEST_STRING = "Hello";

    @Test
    public void testMessage () {
            setup();

            driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

            WebElement inputTextField = driver.findElement(By.id("user-message"));

            inputTextField.sendKeys(TEST_STRING);

            WebElement showMessageButton = driver.findElement(By.xpath("//button[contains(text(),'Show Message')]"));

            showMessageButton.click();

            WebElement outTextField = driver.findElement(By.id("display"));

            String outputMessage = outTextField.getText();

        try {
            assert TEST_STRING.equalsIgnoreCase(outputMessage);
        } catch (AssertionError e) {
            throw new AssertionError(e);
        } finally {
            driver.quit();
        }
    }

    @Test
    public void multiInputTest () {

        setup();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        WebElement sum1Input = driver.findElement(By.id("sum1"));

        sum1Input.sendKeys("2");

        WebElement sum2Input = driver.findElement(By.id("sum2"));

        sum2Input.sendKeys("3");

        WebElement getTotalButton = driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));

        getTotalButton.click();

        WebElement totalResultMessage = driver.findElement(By.id("displayvalue"));

        String totalResult = totalResultMessage.getText();

        try {
            assert "5".equalsIgnoreCase(totalResult);
        } catch (AssertionError e) {
            throw new AssertionError(e);
        } finally {
            driver.quit();
        }
    }
}
