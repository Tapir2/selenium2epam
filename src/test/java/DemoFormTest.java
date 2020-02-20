import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.DemoFormPage;

public class DemoFormTest extends BasicTest {

    @Test
    public void singleInputTest () {

            String outputMessage = new DemoFormPage(driver).singleInputFields("Hello");

            Assertions.assertThat("Hello").isEqualTo(outputMessage);
    }

    @Test
    public void multiInputTest () {

            String totalResult = new DemoFormPage(driver).multiInputFields("2", "3");

            Assertions.assertThat ("5").isEqualTo(totalResult);
    }

    @Test
    public void multiInputNaNTest () {

        String totalResult = new DemoFormPage(driver).multiInputFields("abc", "3");

        Assertions.assertThat ("NaN").isEqualTo(totalResult);
    }
}
