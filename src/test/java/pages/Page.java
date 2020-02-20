package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

abstract public class Page {
    protected WebDriver driver;

    protected Page (WebDriver driver, String url) {
        this.driver = driver;

        driver.get(url);
    }

    public void navigate2Menu (String[] menu) {
        for (String menuPoint : menu) {
            driver.findElement(By.xpath(menuPoint)).click();
        }
    }
}
