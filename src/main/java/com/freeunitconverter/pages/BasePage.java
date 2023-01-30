package com.freeunitconverter.pages;

import com.freeunitconverter.driver.MainDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.PageFactory.initElements;

public abstract class BasePage {

    protected final AppiumDriver currentDriver;

    public final static Duration IMPLICIT_WAIT = Duration.ofSeconds(10);

    protected BasePage() {
        currentDriver = MainDriver.getMainDriver();// getMainDriver();
        initElements(new AppiumFieldDecorator(currentDriver, IMPLICIT_WAIT), this);
    }
}
