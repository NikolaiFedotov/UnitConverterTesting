package com.freeunit.converter.helpers;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public abstract class WebElementHelpers {

    protected static final AppiumDriver currentDriver = MainDriver.getMainDriver();

    public static boolean isDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean findElements(WebElement element) {
        currentDriver = MainDriver.getMainDriver()
    }
}
