package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxPage extends Page {

    @FindBy (id = "isAgeSelected")
    private WebElement ageCheckbox;

    @FindBy (id = "txtAge")
    private WebElement ageText;

    public CheckboxPage (WebDriver driver) {
        super(driver, "https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }

    public String singleCheckboxForm () {

        ageCheckbox.click();

        return ageText.getText();
    }
}
