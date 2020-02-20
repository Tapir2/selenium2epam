package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxPage {

    private WebDriver driver;

    public CheckboxPage (WebDriver driver) {
        this.driver = driver;
    }

    public String singleCheckboxForm () {
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement ageCheckbox = driver.findElement(By.id("isAgeSelected"));

        ageCheckbox.click();

        WebElement ageText = driver.findElement(By.id("txtAge"));

        return ageText.getText();
    }
}
