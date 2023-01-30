package com.freeunitconverter.helpers;

import apple.laf.JRSUIConstants;
import com.freeunitconverter.constants.Constants;
import com.freeunitconverter.driver.MainDriver;
import com.freeunitconverter.pages.MainPageElements;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;

//import static com.freeunitconverter.constants;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public abstract class WebElementHelpers {

    protected static final AppiumDriver currentDriver = MainDriver.getMainDriver();

    public static boolean isDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public static WebElement findElement(WebElement element) {
        return currentDriver.findElement((By) element);
    }

    public static Object canScrollMore(Constants.Direction direction) {
        return ((JavascriptExecutor) currentDriver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 200, "height", 200,
                "direction", direction.toString(),
                "percent", 3.0));
    }

    public static WebElement findElementUsingScroll(WebElement element) {
        if (isDisplayed(element))
            return element;
        boolean isScrollingAble;
        do {
            isScrollingAble = (Boolean) canScrollMore(Constants.Direction.DOWN);
        } while (isScrollingAble);
        if (isDisplayed(element))
            return element;
        else {
            do {
            isScrollingAble = (Boolean) canScrollMore(Constants.Direction.UP);
            } while (isScrollingAble);
            return element;
        }
    }

    public static void swipeElement(WebElement element, Constants.Direction direction) {
        ((JavascriptExecutor) currentDriver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement)element).getId(),
                "direction", direction.toString(),
                "percent", 0.3
        ));
    }

    public static WebElement switchValueUsingSwipe(WebElement lookingInsideElement, WebElement lookinElement) {
//            MainPageElements pageElements;
        findElement(lookingInsideElement);
        /*if (isDisplayed(lookinElement)) {
            return lookinElement;
        } else {
            do {
                swipeElement(lookingInsideElement, Constants.Direction.DOWN);
            } while ()
        }*/
        swipeElement(lookingInsideElement, Constants.Direction.DOWN);
        return findElement(lookinElement);
        }
        /*

        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
    "left", 100, "top", 100, "width", 200, "height", 200,
    "direction", "left",
    "percent", 0.75
));

        }
*/

        //executeScript(SCROLL, new HashMap<String, String>() {{
        //                put("element", ((RemoteWebElement) element).getId());
        //                put("toVisible", "not empty string");
        //            }});

}
