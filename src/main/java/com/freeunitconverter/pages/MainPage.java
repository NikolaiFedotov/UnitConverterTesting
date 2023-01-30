package com.freeunitconverter.pages;

import com.freeunitconverter.constants.Constants;
import com.freeunitconverter.helpers.WebElementHelpers;
import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;

import static com.freeunitconverter.helpers.WebElementHelpers.*;

public class MainPage extends MainPageElements {

//    private com.freeunit.converter.pages.BasePage basePage;
//    private final AppiumDriver currentDriver;

/*    protected com.freeunit.converter.pages.MainPage() {
//        new com.freeunit.converter.pages.BasePage();
//        currentDriver = new com.freeunit.converter.driver.MainDriver().getMainDriver();
        getInstance();
    }*/

    private final String BASE_CALC_WINDOW_TEXT = "1";
    private final String ATTRIBUTE_INDEX = "index";

    public static MainPage getInstance() {
        return new MainPage();
    }

    @Step("tapHomeMenu")
    public MainPage tapHomeMenu() {
        homeMenu.click();
        return getInstance();
    }

    @Step("tapAreaHomeMenu")
    public MainPage tapAreaHomeMenu() {
        findElementUsingScroll(areaMenuFrame).click();
        return getInstance();
    }

    @Step("tapTemperatureHomeMenu")
    public MainPage tapTemperatureHomeMenu() {
        findElementUsingScroll(temperatureMenuFrame).click();
        return getInstance();
    }

    @Step("tapLengthHomeMenu")
    public MainPage tapLengthHomeMenu() {
        lengthMenuFrame.click();
        return getInstance();
    }

    @Step("tapMassHomeMenu")
    public MainPage tapMassHomeMenu() {
        massMenuFrame.click();
        return getInstance();
    }

    @Step("tapSpeedHomeMenu")
    public MainPage tapSpeedHomeMenu() {
        speedMenuFrame.click();
        return getInstance();
    }

    @Step("tapVolumeHomeMenu")
    public MainPage tapVolumeHomeMenu() {
        volumeMenuFrame.click();
        return getInstance();
    }

    @Step("tapFuelConsumptionHomeMenu")
    public MainPage tapFuelConsumptionHomeMenu() {
        fuelConsumptionMenuFrame.click();
        return getInstance();
    }

    @Step("tapTimeHomeMenu")
    public MainPage tapTimeHomeMenu() {
        timeMenuFrame.click();
        return getInstance();
    }

    @Step("tapDigitalStorageDataHomeMenu")
    public MainPage tapDigitalStorageDataHomeMenu() {
        digitalStorageMenuFrame.click();
        return getInstance();
    }

    @Step("tapAngleHomeMenu")
    public MainPage tapAngleHomeMenu() {
        angleMenuFrame.click();
        return getInstance();
    }

    @Step("tapPowerHomeMenu")
    public MainPage tapPowerHomeMenu() {
        powerMenuFrame.click();
        return getInstance();
    }

    @Step("tapEnergyHomeMenu")
    public MainPage tapEnergyHomeMenu() {
        energyMenuFrame.click();
        return getInstance();
    }

    @Step("tapPressureHomeMenu")
    public MainPage tapPressureHomeMenu() {
        pressureMenuFrame.click();
        return getInstance();
    }

    @Step("tapForceHomeMenu")
    public MainPage tapForceHomeMenu() {
        findElementUsingScroll(forceMenuFrame).click();
        return getInstance();
    }

    @Step("tapDigitalImagingHomeMenu")
    public MainPage tapDigitalImagingHomeMenu() {
        findElementUsingScroll(digitalImagingMenuFrame).click();
        return getInstance();
    }

    @Step("openCalc")
    public MainPage openCalc() {
        if (!isCalcOpen())
        openCalcButton.click();
        return getInstance();
    }

    @Step("verifyPageValueElementsBySwipeValues")
    public void verifyPageValueElementsBySwipeValues(SoftAssertions softAssertions, TemperaturePage temperaturePage, String expectedValue) {
        softAssertions.assertThat(findElementUsingScroll(temperaturePage.temperatureCelsiusValue).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo(expectedValue);

    }



    @Override
    @Step("swipeValueDown")
    public MainPage swipeValueDown() {
        swipeElement(valueSelector, Constants.Direction.DOWN);

        return getInstance();
    }

    public boolean isCalcOpen() {
        return isDisplayed(calcKeyBoard);
    }

    @Step("getCalcWindowText")
    public String getCalcWindowText() {
        return calcWindow.getText();
    }

    @Step("clearCalcWindowText")
    public MainPage clearCalcWindowText() {
        openCalc();
        calcBoardClearButton.click();
        return getInstance();
    }

    @Step("deleteOneCalcDigit")
    public MainPage deleteOneCalcDigit() {
        openCalc();
        calcBoardDeleteButton.click();
        return getInstance();
    }

    @Step("deleteFewCalcDigit")
    public MainPage deleteFewCalcDigit(int numberOfDigits) {
        for (int i = 1; i <= numberOfDigits; i++) {
            deleteOneCalcDigit();
        }
        return getInstance();
    }

    @Step("tapDeleteCalcButton")
    public MainPage tapDeleteCalcButton() {
        calcBoardDeleteButton.click();
        return getInstance();
    }

    @Step("tapPlusMinus")
    public MainPage tapPlusMinus() {
        calcBoardPlusMinus.click();
        return getInstance();
    }

    @Step("tapComa")
    public MainPage tapComa() {
        calcBoardComa.click();
        return getInstance();
    }

    @Step("fillNumberToCalcWindow")
    public MainPage fillNumberToCalcWindow(String number) {
        openCalc();
        for (int index = 0; index < number.length(); index++) {
            char s = number.charAt(index);
            switch (s) {
                case '1':
                    calcBoardOne.click();
                    break;
                case '2':
                    calcBoardTwo.click();
                    break;
                case '3':
                    calcBoardThree.click();
                    break;
                case '4':
                    calcBoardFour.click();
                    break;
                case '5':
                    calcBoardFive.click();
                    break;
                case '6':
                    calcBoardSix.click();
                    break;
                case '7':
                    calcBoardSeven.click();
                    break;
                case '8':
                    calcBoardEight.click();
                    break;
                case '9':
                    calcBoardNine.click();
                    break;
                case '0':
                    calcBoardZero.click();
                    break;
                case '-':
                    calcBoardPlusMinus.click();
                    break;
                case ',':
                    calcBoardComa.click();
                    break;
                default:
                    break;
            }
        }

        return getInstance();
    }

    @Step("fillIntegerNumberToCalcWindowAndClickOK")
    public MainPage fillIntegerNumberToCalcWindowAndClickOK(String number) {
        calcBoardClearButton.click();
        fillNumberToCalcWindow(number);
        calcBoardOKButton.click();
        return getInstance();
    }

    @Step("isMenuFrameOpen")
    public boolean isMenuFrameOpen() {
        return isDisplayed(menuFrame);
    }

    @Step("verifyMenuFrame")
    public void verifyMenuFrame(SoftAssertions softAssertions) {
        softAssertions.assertThat(findElementUsingScroll(areaMenuFrame).isDisplayed())
                .describedAs("The 'Area' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(temperatureMenuFrame).isDisplayed())
                .describedAs("The 'Temperature' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(lengthMenuFrame).isDisplayed())
                .describedAs("The 'Length' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(massMenuFrame).isDisplayed())
                .describedAs("The 'Mass' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(speedMenuFrame).isDisplayed())
                .describedAs("The 'Speed' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(volumeMenuFrame).isDisplayed())
                .describedAs("The 'Volume' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(fuelConsumptionMenuFrame).isDisplayed())
                .describedAs("The 'Fuel consumption' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(timeMenuFrame).isDisplayed())
                .describedAs("The 'Time' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(digitalStorageMenuFrame).isDisplayed())
                .describedAs("The 'Digital Storage/Data' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(angleMenuFrame).isDisplayed())
                .describedAs("The 'Angle' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(powerMenuFrame).isDisplayed())
                .describedAs("The 'Power' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(energyMenuFrame).isDisplayed())
                .describedAs("The 'Energy' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(pressureMenuFrame).isDisplayed())
                .describedAs("The 'Pressure' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(forceMenuFrame).isDisplayed())
                .describedAs("The 'Force' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(digitalImagingMenuFrame).isDisplayed())
                .describedAs("The 'Digital Imaging' point doesn't present in the Menu Frame").isTrue();

    }

    @Step("isActionTitleBarEqualsText")
    public boolean isActionTitleBarEqualsText(String title) {
        return actionBarTitle.equals(title);
    }

    @Step("findElement")
    public WebElement findElement(WebElement element) {
        return WebElementHelpers.findElementUsingScroll(element);
    }

    @Step("switchToItem")
    public AreaPage switchToAreaPage() {
        if (!isDisplayed(menuFrame)) tapHomeMenu();
        findElementUsingScroll(areaMenuFrame).click();

        return new AreaPage();
    }

/*    @Step("swipeValueDown")
    public MainPage swipeValueDown() {
        swipeElement(valueSelector, Constants.Direction.DOWN);

        return getInstance();
    }*/

    @Step("swipeValueUp")
    public MainPage swipeValueUp() {
        swipeElement(valueSelector, Constants.Direction.UP);

        return getInstance();
    }
}
