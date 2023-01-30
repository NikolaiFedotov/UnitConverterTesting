import com.freeunitconverter.helpers.TestListener;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.freeunitconverter.constants.Constants.FrameMenu.*;

@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Menu Frame Tests")
public class MenuFrameTest extends BaseTest{

    @Severity(SeverityLevel.CRITICAL)
    @Description("Test the Action Title Bar text and the Menu Frame items after launching app")
    @Story(value = "As user I can all items in the Menu Frame after the launching app")
    @Test
    public void isMenuFrameOpenAndContainsAllItems() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(mainPage.isMenuFrameOpen())
                 .describedAs("The Menu Frame doesn't displays after the launching app")
                 .isTrue();
        softAssertions.assertThat(mainPage.isActionTitleBarEqualsText(AREA))
                 .describedAs("The Action Title Bar doesn't contains 'Area' text after the launching app")
                 .isTrue();
        mainPage.verifyMenuFrame(softAssertions);
        softAssertions.assertAll();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Test the Action Title Bar text and the Menu Frame items after launching app")
    @Story(value = "As user I can all items in the Menu Frame after the launching app")
    @Test
    public void testOpenAnyPageAfterLaunching() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(mainPage.tapAreaHomeMenu().isActionTitleBarEqualsText(AREA))
                .describedAs("The Action Title Bar doesn't contains 'Area' text")
                .isTrue();
        softAssertions.assertThat(mainPage.tapHomeMenu().tapTemperatureHomeMenu().isActionTitleBarEqualsText(TEMPERATURE))
                .describedAs("The Action Title Bar doesn't contains 'Area' text")
                .isTrue();
        softAssertions.assertThat(mainPage.tapHomeMenu().tapLengthHomeMenu().isActionTitleBarEqualsText(LENGTH))
                .describedAs("The Action Title Bar doesn't contains 'Area' text")
                .isTrue();
        softAssertions.assertThat(mainPage.tapHomeMenu().tapMassHomeMenu().isActionTitleBarEqualsText(MASS))
                .describedAs("The Action Title Bar doesn't contains 'Area' text")
                .isTrue();
        softAssertions.assertThat(mainPage.tapHomeMenu().tapSpeedHomeMenu().isActionTitleBarEqualsText(SPEED))
                .describedAs("The Action Title Bar doesn't contains 'Area' text")
                .isTrue();
        softAssertions.assertThat(mainPage.tapHomeMenu().tapVolumeHomeMenu().isActionTitleBarEqualsText(VOLUME))
                .describedAs("The Action Title Bar doesn't contains 'Area' text")
                .isTrue();
        softAssertions.assertThat(mainPage.tapHomeMenu().tapFuelConsumptionHomeMenu().isActionTitleBarEqualsText(FUEL_CONSUMPTION))
                .describedAs("The Action Title Bar doesn't contains 'Area' text")
                .isTrue();
        softAssertions.assertThat(mainPage.tapHomeMenu().tapTimeHomeMenu().isActionTitleBarEqualsText(TIME))
                .describedAs("The Action Title Bar doesn't contains 'Area' text")
                .isTrue();
        softAssertions.assertThat(mainPage.tapHomeMenu().tapDigitalStorageDataHomeMenu().isActionTitleBarEqualsText(DIGITAL_STORAGE_DATA))
                .describedAs("The Action Title Bar doesn't contains 'Area' text")
                .isTrue();
        softAssertions.assertThat(mainPage.tapHomeMenu().tapAngleHomeMenu().isActionTitleBarEqualsText(ANGLE))
                .describedAs("The Action Title Bar doesn't contains 'Area' text")
                .isTrue();
        softAssertions.assertThat(mainPage.tapHomeMenu().tapPowerHomeMenu().isActionTitleBarEqualsText(POWER))
                .describedAs("The Action Title Bar doesn't contains 'Area' text")
                .isTrue();
        softAssertions.assertThat(mainPage.tapHomeMenu().tapEnergyHomeMenu().isActionTitleBarEqualsText(ENERGY))
                .describedAs("The Action Title Bar doesn't contains 'Area' text")
                .isTrue();
        softAssertions.assertThat(mainPage.tapHomeMenu().tapPressureHomeMenu().isActionTitleBarEqualsText(PRESSURE))
                .describedAs("The Action Title Bar doesn't contains 'Area' text")
                .isTrue();
        softAssertions.assertThat(mainPage.tapHomeMenu().tapForceHomeMenu().isActionTitleBarEqualsText(FORCE))
                .describedAs("The Action Title Bar doesn't contains 'Area' text")
                .isTrue();
        softAssertions.assertThat(mainPage.tapHomeMenu().tapDigitalImagingHomeMenu().isActionTitleBarEqualsText(DIGITAL_IMAGING))
                .describedAs("The Action Title Bar doesn't contains 'Area' text")
                .isTrue();
    }
}
