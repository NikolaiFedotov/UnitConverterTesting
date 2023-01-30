import com.freeunitconverter.helpers.TestListener;
import com.freeunitconverter.pages.MainPage;
import com.freeunitconverter.pages.TemperaturePage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Calc Tests")
public class CalcTest extends BaseTest {

//    @Epic("Testing for https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html")
//    @Feature(value = "Text area")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test the Calc Window text and the Calc keyboard actions")
    @Story(value = "US_001.001 As user I can clear text field and print any text into and click submit button")
    @Test
    public void inputClearNumbers() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(mainPage.tapVolumeHomeMenu()
                .fillNumberToCalcWindow("12345678901")
                .getCalcWindowText())
                    .describedAs("The number in the Calc Window contains more than 10 digits")
                    .isEqualTo("1234567890");
        softAssertions.assertThat(mainPage.deleteOneCalcDigit()
                .tapPlusMinus()
                .tapComa()
                .getCalcWindowText())
                    .describedAs("The number in the Calc Window doesn't contain minus '-' symbol, and zero '0' symbol after tap on coma")
                    .isEqualTo("-123456789.0");
        softAssertions.assertThat(mainPage.deleteFewCalcDigit(7)
                .tapComa()
                .tapPlusMinus()
                .fillNumberToCalcWindow("1234567890")
                .getCalcWindowText())
                    .describedAs("The number in the Calc Window contains over 2 digits after coma")
                    .isEqualTo("123.123456");
        softAssertions.assertThat(mainPage.clearCalcWindowText()
                .getCalcWindowText())
                    .describedAs("The clear Calc Window doesn't contain digit one '1'")
                    .isEqualTo("1");
        softAssertions.assertThat(mainPage.tapPlusMinus()
                 .getCalcWindowText())
                    .describedAs("The number in the Calc Window contains minus '-' symbol")
                    .isEqualTo("-1");
        softAssertions.assertAll();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Test the Calc Window text and the Calc keyboard actions")
    @Story(value = "US_001.001 As user I can clear text field and print any text into and click submit button")
    @Test
    public void testCalcFrameAndFilledDigitsDisappearAfterSwitchPage() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(mainPage.tapHomeMenu()
                .openCalc().fillNumberToCalcWindow("123")
                .tapHomeMenu()
                .tapDigitalStorageDataHomeMenu()
                .isCalcOpen())
                    .describedAs("Calc is open after switching page")
                    .isFalse();
        softAssertions.assertThat(mainPage.getCalcWindowText())
                    .describedAs("Tha Calc Window is not empty after switching page")
                    .isEqualTo("1");
        softAssertions.assertAll();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Test the Calc Window text and the Calc keyboard actions")
    @Story(value = "US_001.001 As user I can clear text field and print any text into and click submit button")
    @Test
    public void testCalcDoesNotCloseAfterOpenHomeMenuAndReturnToPage() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(mainPage.tapHomeMenu()
                .openCalc()
                .tapHomeMenu()
                .tapHomeMenu()
                .isCalcOpen())
                    .describedAs("The Calc disappears after opening Home Menu and returning to the page")
                    .isTrue();
        softAssertions.assertAll();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Test the Calc Window text and the Calc keyboard actions")
    @Story(value = "US_001.001 As user I can clear text field and print any text into and click submit button")
    @Test
    public void testFilledNumberDoesNotDisappearAfterOpenHomeMenuAndReturnToPage() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(mainPage.tapHomeMenu()
                        .openCalc()
                        .fillNumberToCalcWindow("987654321")
                        .tapHomeMenu()
                        .tapHomeMenu()
                        .getCalcWindowText())
                .describedAs("The filled number disappears after opening Home Menu and returning to the page")
                .isEqualTo("987654321");
        softAssertions.assertAll();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Test the Calc Window text and the Calc keyboard actions")
    @Story(value = "US_001.001 As user I can clear text field and print any text into and click submit button")
    @Test
    public void testCalcFrameDisappearsAfterOpenHomeMenuAndSwitchToAnotherPage() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(mainPage.tapHomeMenu()
                        .openCalc()
                        .fillNumberToCalcWindow("55555555")
                        .tapHomeMenu()
                        .tapPowerHomeMenu()
                        .isCalcOpen())
                .describedAs("The filled number disappears after opening Home Menu and returning to the page")
                .isFalse();
        softAssertions.assertAll();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Test the Calc Window text and the Calc keyboard actions")
    @Story(value = "US_001.001 As user I can clear text field and print any text into and click submit button")
    @Test
    public void testFilledNumberDisappearsAfterOpenHomeMenuAndSwitchToAnotherPage() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(mainPage.tapHomeMenu()
                        .openCalc()
                        .fillNumberToCalcWindow("55555555")
                        .tapHomeMenu()
                        .tapDigitalImagingHomeMenu()
                        .getCalcWindowText())
                .describedAs("The filled number disappears after opening Home Menu and returning to the page")
                .isEqualTo("1");
        softAssertions.assertAll();
    }

/*    @Severity(SeverityLevel.CRITICAL)
    @Description("Test the Calc Window text and the Calc keyboard actions")
    @Story(value = "US_001.001 As user I can clear text field and print any text into and click submit button")
    @Test
    public void testSwipeValuesIsWorkingWhileCalcIsOpen() throws InstantiationException, IllegalAccessException {
        SoftAssertions softAssertions = new SoftAssertions();
        final String NUMBERS = "10";
        mainPage.tapTemperatureHomeMenu()
                .openCalc()
                .fillNumberToCalcWindow(NUMBERS)

//                .verifyEnteredNumberInField();
                .swipeValueDown()
                .verifyPageValueElementsBySwipeValues(softAssertions, temperaturePage, NUMBERS);
        mainPage.swipeValueDown()
                .verifyPageValueElementsBySwipeValues();
//                .

    }*/
}
