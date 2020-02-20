import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckboxTest extends BasicTest {
    @Test
    public void singleCheckboxTest () {

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement ageCheckbox = driver.findElement(By.id("isAgeSelected"));

        ageCheckbox.click();

        WebElement ageText = driver.findElement(By.id("txtAge"));

        String ageMessage = ageText.getText();

        Assertions.assertThat(ageText.isDisplayed()).isEqualTo(true);

        Assertions.assertThat("Success - Check box is checked").isEqualTo(ageMessage);
    }
}
