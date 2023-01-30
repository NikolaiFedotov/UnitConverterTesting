package com.freeunitconverter.pages;

import com.freeunitconverter.constants.Constants;
import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;

import static com.freeunitconverter.helpers.WebElementHelpers.*;

public class TemperaturePage extends TemperaturePageElements{


    public static final class TemperatureValues {
        public String CELSIUS = findElementUsingScroll(temperatureCelsiusValue).getText();
        public String FARENHEIT = findElementUsingScroll(temperatureFarenheitValue).getText();
        public String KELVIN = findElementUsingScroll(temperatureKelvinValue).getText();;
    }

//    TemperatureValues
    public static TemperaturePage getInstance() {
        return new TemperaturePage();
    }

    @Override
    @Step("swipeValueDown")
    public TemperaturePage swipeValueDown() {
        swipeElement(valueSelector, Constants.Direction.DOWN);

        return getInstance();
    }

    public boolean isCalcOpen() {
        return isDisplayed(calcKeyBoard);
    }

    @Step("verifyPageValueElementsBySwipeValues")
    public void verifyPageValueElementsBySwipeValues(SoftAssertions softAssertions) {
        softAssertions.assertThat(findElementUsingScroll(temperatureCelsiusValue).isDisplayed())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(temperatureFarenheitValue).isDisplayed())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isTrue();
        softAssertions.assertThat(findElementUsingScroll(temperatureKelvinValue).isDisplayed())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isTrue();

    }

    @Step("openCalc")
    public TemperaturePage openCalc() {
        if (!isCalcOpen())
            openCalcButton.click();
        return getInstance();
    }

    @Step("isActionTitleBarEqualsText")
    public boolean isActionTitleBarEqualsText(String title) {
        return actionBarTitle.equals(title);
    }

//    @Override
    @Step("verifyEnteredNumberInField")
    public TemperaturePage verifyEnteredNumberInField(SoftAssertions softAssertions, WebElement element, String expected) {
        softAssertions.assertThat(findElementUsingScroll(element).getText())
                .describedAs("Celsius field does not equal filled number")
                .isEqualTo(expected);

        return getInstance();
    }
}
