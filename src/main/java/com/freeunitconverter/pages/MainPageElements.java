package com.freeunitconverter.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public abstract class MainPageElements extends BasePage implements IGeneral{

    @AndroidFindBy(id = "android:id/home")
    protected WebElement homeMenu;

    @AndroidFindBy(id = "imageView1")
    protected WebElement valueSelector;

    @AndroidFindBy(id = "com.unitconverter.freeunitconversioncalculator:id/unesena_vrednost")
    protected WebElement calcWindow;

    @AndroidFindBy(id = "android:id/action_bar_title")
    protected WebElement actionBarTitle;

    @AndroidFindBy(id = "lista_velicina")
    protected WebElement menuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Area']")
    protected WebElement areaMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Temperature']")
    protected WebElement temperatureMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Length']")
    protected WebElement lengthMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mass']")
    protected WebElement massMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Speed']")
    protected WebElement speedMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Volume']")
    protected WebElement volumeMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Fuel consumption']")
    protected WebElement fuelConsumptionMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Time']")
    protected WebElement timeMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Digital Storage/Data']")
    protected WebElement digitalStorageMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Angle']")
    protected WebElement angleMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Power']")
    protected WebElement powerMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Energy']")
    protected WebElement energyMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pressure']")
    protected WebElement pressureMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Force']")
    protected WebElement forceMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Digital Imaging']")
    protected WebElement digitalImagingMenuFrame;

    @AndroidFindBy(id = "tastatura_rl")
    protected WebElement calcKeyBoard;

    @AndroidFindBy(id = "imageView16")
    protected WebElement openCalcButton;

    @AndroidFindBy(id = "zarez")
    protected WebElement calcBoardComa;

    @AndroidFindBy(id = "jedinica")
    protected WebElement calcBoardOne;

    @AndroidFindBy(id = "dvojka")
    protected WebElement calcBoardTwo;

    @AndroidFindBy(id = "trojka")
    protected WebElement calcBoardThree;

    @AndroidFindBy(id = "cetvorka")
    protected WebElement calcBoardFour;

    @AndroidFindBy(id = "petica")
    protected WebElement calcBoardFive;

    @AndroidFindBy(id = "sestica")
    protected WebElement calcBoardSix;

    @AndroidFindBy(id = "sedmica")
    protected WebElement calcBoardSeven;

    @AndroidFindBy(id = "osmica")
    protected WebElement calcBoardEight;

    @AndroidFindBy(id = "devetka")
    protected WebElement calcBoardNine;

    @AndroidFindBy(id = "nula")
    protected WebElement calcBoardZero;

    @AndroidFindBy(id = "plusminus")
    protected WebElement calcBoardPlusMinus;

    @AndroidFindBy(id = "clear")
    protected WebElement calcBoardClearButton;

    @AndroidFindBy(id = "delete")
    protected WebElement calcBoardDeleteButton;

    @AndroidFindBy(id = "spustitastaturu")
    protected WebElement calcBoardOKButton;
}
