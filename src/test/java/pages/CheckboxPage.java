package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxPage extends Page {

    public CheckboxPage (WebDriver driver) {
        super(driver, "https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }

    public String singleCheckboxForm () {

        WebElement ageCheckbox = driver.findElement(By.id("isAgeSelected"));

        ageCheckbox.click();

        WebElement ageText = driver.findElement(By.id("txtAge"));

        return ageText.getText();
    }
}
