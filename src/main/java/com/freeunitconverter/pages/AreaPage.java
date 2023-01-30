package com.freeunitconverter.pages;

import com.freeunitconverter.constants.Constants;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.freeunitconverter.helpers.WebElementHelpers.*;

public class AreaPage extends AreaPageElements{

    public static AreaPage getInstance() {
        return new AreaPage();
    }

    @Step("getCalcWindowText")
    public String getCalcWindowText() {
        return calcWindow.getText();
    }

    @Override
    @Step("swipeValueDown")
    public AreaPage swipeValueDown() {
        swipeElement(valueSelector, Constants.Direction.DOWN);

        return getInstance();
    }

    @Override
    @Step("verifyPageValueElements")
    public void verifyPageValueElements(SoftAssertions softAssertions) {
        softAssertions.assertThat(findElementUsingScroll(areaKM2).isDisplayed())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isTrue();
    }

    @Step("verifyPageValueElementsBySwipeValues")
    public void verifyPageValueElementsBySwipeValues(SoftAssertions softAssertions) {
        softAssertions.assertThat(findElementUsingScroll(areaKM2value).isDisplayed())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isTrue();
    }

    @Step("verifyKM2Values")
    public void verifyKM2Values(SoftAssertions softAssertions) {
        softAssertions.assertThat(findElementUsingScroll(areaKM2value).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo(getCalcWindowText());
        softAssertions.assertThat(findElementUsingScroll(areaHAvalue).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("100");
        softAssertions.assertThat(findElementUsingScroll(areaM2value).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("1000000");
        softAssertions.assertThat(findElementUsingScroll(areaDM2value).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("1 E8");
        softAssertions.assertThat(findElementUsingScroll(areaCM2value).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("1 E10");
        softAssertions.assertThat(findElementUsingScroll(areaMM2value).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("1 E12");
        softAssertions.assertThat(findElementUsingScroll(areaSqMiAvalue).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("0.38610");
        softAssertions.assertThat(findElementUsingScroll(areaACAvalue).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("247.10538");
        softAssertions.assertThat(findElementUsingScroll(areaSqYdAvalue).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("1195990.05");
        softAssertions.assertThat(findElementUsingScroll(areaSqFtAvalue).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("1.07639 E7");
        softAssertions.assertThat(findElementUsingScroll(areaSqInAvalue).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("1.55000 E9");
    }

    @Step("verifyHAValues")
    public void verifyHAValues(SoftAssertions softAssertions) {
        softAssertions.assertThat(findElementUsingScroll(areaKM2value).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("0.001");
        softAssertions.assertThat(findElementUsingScroll(areaHAvalue).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo(getCalcWindowText());
        softAssertions.assertThat(findElementUsingScroll(areaM2value).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("10000");
        softAssertions.assertThat(findElementUsingScroll(areaDM2value).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("1000000");
        softAssertions.assertThat(findElementUsingScroll(areaCM2value).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("1 E8");
        softAssertions.assertThat(findElementUsingScroll(areaMM2value).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("1 E10");
        softAssertions.assertThat(findElementUsingScroll(areaSqMiAvalue).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("0.00386");
        softAssertions.assertThat(findElementUsingScroll(areaACAvalue).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("2.47105");
        softAssertions.assertThat(findElementUsingScroll(areaSqYdAvalue).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("11959.9005");
        softAssertions.assertThat(findElementUsingScroll(areaSqFtAvalue).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("107639.10399");
        softAssertions.assertThat(findElementUsingScroll(areaSqInAvalue).getText())
                .describedAs("The 'km²' point doesn't present in the Menu Frame").isEqualTo("1.55000 E7");
    }
}
