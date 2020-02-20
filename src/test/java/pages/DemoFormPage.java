package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoFormPage extends Page {

    public DemoFormPage (WebDriver driver) {
       super(driver, "https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }

    public String singleInputFields (String inputMessage) {

        WebElement userMessageInput = driver.findElement(By.id("user-message"));

        userMessageInput.sendKeys("Hello");

        WebElement showMessageButton = driver.findElement(By.xpath("//button[contains(text(),'Show Message')]"));

        showMessageButton.click();

        WebElement userMessage = driver.findElement(By.id("display"));

        return userMessage.getText();
    }

    public String multiInputFields (String a, String b) {

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
