import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.DemoFormPage;

public class MenuTest extends BasicTest {
    @Test
    public void navigation2FormPageTest () {
        DemoFormPage demoFormPage = new DemoFormPage(driver);

        demoFormPage.navigate2Menu(new String[] {"//li[@class='tree-branch']//a[contains(text(),'Input Forms')]", "//li[@class='tree-branch']//ul//li//a[contains(text(),'Simple Form Demo')]"});

        Assertions.assertThat(driver.getTitle()).isEqualTo("Selenium Easy Demo - Simple Form to Automate using Selenium");
    }

    @Test
    public void navigation2CheckboxPageTest () {

    }
}
