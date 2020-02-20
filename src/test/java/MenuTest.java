import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.CheckboxPage;
import pages.DemoFormPage;

public class MenuTest extends BasicTest {
    @Test
    public void navigation2FormPageTest () {

        DemoFormPage demoFormPage = new DemoFormPage(driver);

        demoFormPage.navigate2Menu(new String[] {"Input Forms", "Simple Form Demo"});

        Assertions.assertThat(driver.getTitle()).isEqualTo("Selenium Easy Demo - Simple Form to Automate using Selenium");
    }

    @Test
    public void navigation2CheckboxPageTest () {

        CheckboxPage checkboxPage = new CheckboxPage(driver);

        checkboxPage.navigate2Menu(new String[] {"Input Forms", "Checkbox Demo"});

        Assertions.assertThat(driver.getTitle()).isEqualTo("Selenium Easy - Checkbox demo for automation using selenium");
    }
}
