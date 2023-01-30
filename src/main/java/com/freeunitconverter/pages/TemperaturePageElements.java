package com.freeunitconverter.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class TemperaturePageElements extends BasePage implements IGeneral{

    @AndroidFindBy(id = "com.unitconverter.freeunitconversioncalculator:id/unesena_vrednost")
    protected WebElement calcWindow;

    @AndroidFindBy(id = "imageView16")
    protected WebElement openCalcButton;

    @AndroidFindBy(id = "tastatura_rl")
    protected WebElement calcKeyBoard;

    @AndroidFindBy(id = "android:id/action_bar_title")
    protected WebElement actionBarTitle;

    @AndroidFindBy(id = "imageView1")
    protected WebElement valueSelector;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='°C']")
    protected WebElement temperatureCelsius;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='°C']//..//parent::android.widget.LinearLayout//*[@resource-id='com.unitconverter.freeunitconversioncalculator:id/vrednost_text_view']")
    protected static WebElement temperatureCelsiusValue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='°F']")
    protected WebElement temperatureFarenheit;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='°F']//..//parent::android.widget.LinearLayout//*[@resource-id='com.unitconverter.freeunitconversioncalculator:id/vrednost_text_view']")
    protected static WebElement temperatureFarenheitValue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='K']")
    protected WebElement temperatureKelvin;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='K']//..//parent::android.widget.LinearLayout//*[@resource-id='com.unitconverter.freeunitconversioncalculator:id/vrednost_text_view']")
    protected static WebElement temperatureKelvinValue;
}
