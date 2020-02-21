import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.CheckboxPage;
import pages.DemoFormPage;

public class CheckboxTest extends BasicTest {

    private static final Logger LOGGER = Logger.getLogger(CheckboxTest.class);

    @Test
    public void singleCheckboxTest () {

        LOGGER.info("Invoke singleCheckboxTest");

        String outputMessage = new CheckboxPage(driver).singleCheckboxForm();

        Assertions.assertThat("Success - Check box is checked").isEqualTo(outputMessage);
    }
}
