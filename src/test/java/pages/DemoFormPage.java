package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoFormPage extends Page {

    @FindBy(id = "user-message")
    private WebElement userMessageInput;

    @FindBy(xpath = "//button[contains(text(),'Show Message')]")
    private WebElement showMessageButton;

    @FindBy(id = "display")
    private WebElement userMessage;

    @FindBy(id = "sum1")
    private WebElement sum1Input;

    @FindBy(id = "sum2")
    private WebElement sum2Input;

    @FindBy(xpath = "//button[contains(text(),'Get Total')]")
    private WebElement getTotalButton;

    @FindBy(id = "displayvalue")
    private WebElement totalResultMessage;

    public DemoFormPage (WebDriver driver) {
       super(driver, "https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }

    public String singleInputFields (String inputMessage) {

        userMessageInput.sendKeys("Hello");

        showMessageButton.click();

        return userMessage.getText();
    }

    public String multiInputFields (String a, String b) {

        sum1Input.sendKeys(a);

        sum2Input.sendKeys(b);

        getTotalButton.click();

        return totalResultMessage.getText();
    }
}
