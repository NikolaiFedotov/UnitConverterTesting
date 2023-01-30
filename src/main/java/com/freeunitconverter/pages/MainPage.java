package com.freeunit.converter.pages;

import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;

import static com.freeunit.converter.helpers.WebElementHelpers.isDisplayed;

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

    @Step("tapVolumeHomeMenu")
    public MainPage tapVolumeHomeMenu() {
        volumeHomeMenu.click();
        return getInstance();
    }

    @Step("openCalc")
    public MainPage openCalc() {
        if (!isCalcOpen())
        openCalcButton.click();
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

    @Step("isCalcWindowCleared")
    public boolean isCalcWindowCleared () {
        return calcWindow.getAttribute(ATTRIBUTE_INDEX).equals("0");
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

    @Step("fillIntegerNumberToCalcWindow")
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
//        softAssertions
    }


}
