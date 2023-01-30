package com.freeunitconverter.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AreaPageElements extends BasePage implements IGeneral{

    @AndroidFindBy(id = "com.unitconverter.freeunitconversioncalculator:id/unesena_vrednost")
    protected WebElement calcWindow;

    @AndroidFindBy(id = "imageView1")
    protected WebElement valueSelector;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='km²']")
    protected WebElement areaKM2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='km²']//..//parent::android.widget.LinearLayout//*[@resource-id='com.unitconverter.freeunitconversioncalculator:id/vrednost_text_view']")
    protected WebElement areaKM2value;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ha']")
    protected WebElement areaHA;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ha']//..//parent::android.widget.LinearLayout//*[@resource-id='com.unitconverter.freeunitconversioncalculator:id/vrednost_text_view']")
    protected WebElement areaHAvalue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='m²']")
    protected WebElement areaM2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='m²']//..//parent::android.widget.LinearLayout//*[@resource-id='com.unitconverter.freeunitconversioncalculator:id/vrednost_text_view']")
    protected WebElement areaM2value;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='dm²']")
    protected WebElement areaDM2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='dm²']//..//parent::android.widget.LinearLayout//*[@resource-id='com.unitconverter.freeunitconversioncalculator:id/vrednost_text_view']")
    protected WebElement areaDM2value;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='cm²']")
    protected WebElement areaCM2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='cm²']//..//parent::android.widget.LinearLayout//*[@resource-id='com.unitconverter.freeunitconversioncalculator:id/vrednost_text_view']")
    protected WebElement areaCM2value;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='mm²']")
    protected WebElement areaMM2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='mm²']//..//parent::android.widget.LinearLayout//*[@resource-id='com.unitconverter.freeunitconversioncalculator:id/vrednost_text_view']")
    protected WebElement areaMM2value;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='sq mi']")
    protected WebElement areaSqMi;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='sq mi']//..//parent::android.widget.LinearLayout//*[@resource-id='com.unitconverter.freeunitconversioncalculator:id/vrednost_text_view']")
    protected WebElement areaSqMiAvalue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ac']")
    protected WebElement areaAC;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ac']//..//parent::android.widget.LinearLayout//*[@resource-id='com.unitconverter.freeunitconversioncalculator:id/vrednost_text_view']")
    protected WebElement areaACAvalue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='sq yd']")
    protected WebElement areaSqYd;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='sq yd']//..//parent::android.widget.LinearLayout//*[@resource-id='com.unitconverter.freeunitconversioncalculator:id/vrednost_text_view']")
    protected WebElement areaSqYdAvalue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='sq ft']")
    protected WebElement areaSqFt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='sq ft']//..//parent::android.widget.LinearLayout//*[@resource-id='com.unitconverter.freeunitconversioncalculator:id/vrednost_text_view']")
    protected WebElement areaSqFtAvalue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='sq in']")
    protected WebElement areaSqIn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='sq in']//..//parent::android.widget.LinearLayout//*[@resource-id='com.unitconverter.freeunitconversioncalculator:id/vrednost_text_view']")
    protected WebElement areaSqInAvalue;
}
