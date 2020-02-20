package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoFormPage {

    private WebDriver driver;

    public DemoFormPage (WebDriver driver) {
       this.driver = driver;
    }

    public String singleInputFields (String inputMessage) {

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        WebElement userMessageInput = driver.findElement(By.id("user-message"));

        userMessageInput.sendKeys("Hello");

        WebElement showMessageButton = driver.findElement(By.xpath("//button[contains(text(),'Show Message')]"));

        showMessageButton.click();

        WebElement userMessage = driver.findElement(By.id("display"));

        return userMessage.getText();
    }

    public String multiInputFields (String a, String b) {

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        WebElement sum1Input = driver.findElement(By.id("sum1"));

        sum1Input.sendKeys(a);

        WebElement sum2Input = driver.findElement(By.id("sum2"));

        sum2Input.sendKeys(b);

        WebElement getTotalButton = driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));

        getTotalButton.click();

        WebElement totalResultMessage = driver.findElement(By.id("displayvalue"));

        return totalResultMessage.getText();
    }
}
