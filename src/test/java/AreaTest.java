import com.freeunitconverter.helpers.TestListener;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Area Tests")
public class AreaTest extends BaseTest{

    @Severity(SeverityLevel.CRITICAL)
    @Description("Test the Calc Window text and the Calc keyboard actions")
    @Story(value = "US_001.001 As user I can clear text field and print any text into and click submit button")
    @Test
    public void scrollTest() {

    }
}
