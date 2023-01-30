package com.freeunit.converter.pages;

import com.freeunit.converter.pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public abstract class MainPageElements extends BasePage {

//    @AndroidFindAll({
//            @AndroidBy(id = "welcomeSubtitleTextView"),
//            @AndroidBy(xpath = "//*[@text = 'Create Account / Sign In']"),
//    })
//    protected WebElement btnInspiration;

    @AndroidFindBy(id = "home")
    protected WebElement homeMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Speed' and @resource-id = 'com.unitconverter.freeunitconversioncalculator:id/vrednost_text_view']")
    protected WebElement speedMenuPoint;

    @AndroidFindBy(id = "imageView1")
    protected WebElement valueSelector;

    @AndroidFindBy(xpath = "//android.widget.ListView//android.widget.TextView[@text='Volume']")
    protected WebElement volumeHomeMenu;

    @AndroidFindBy(id = "com.unitconverter.freeunitconversioncalculator:id/unesena_vrednost")
    protected WebElement calcWindow;

    //action_bar_title

    @AndroidFindBy(id = "action_bar_title")
    protected WebElement actionBarTitle;

    @AndroidFindBy(id = "lista_velicina")
    protected WebElement menuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Area']")
    protected WebElement areaMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Temperature']")
    protected WebElement temoeratureMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Length']")
    protected WebElement lengthMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mass']")
    protected WebElement massMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Speed']")
    protected WebElement speedMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Volume']")
    protected WebElement volumeMenuFrame;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Fuel consumtion']")
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

    // , com.unitconverter.freeunitconversioncalculator:id/zarez
    // 1 com.unitconverter.freeunitconversioncalculator:id/jedinica
    // 2 com.unitconverter.freeunitconversioncalculator:id/dvojka
    // 3 com.unitconverter.freeunitconversioncalculator:id/trojka
    // 4 com.unitconverter.freeunitconversioncalculator:id/cetvorka
    // 5 com.unitconverter.freeunitconversioncalculator:id/petica
    // 6 com.unitconverter.freeunitconversioncalculator:id/sestica
    // 7 com.unitconverter.freeunitconversioncalculator:id/sedmica
    // 8 com.unitconverter.freeunitconversioncalculator:id/osmica
    // 9 com.unitconverter.freeunitconversioncalculator:id/devetka
    // 0 com.unitconverter.freeunitconversioncalculator:id/nula
    // - com.unitconverter.freeunitconversioncalculator:id/plusminus
    // c com.unitconverter.freeunitconversioncalculator:id/clear
    // del com.unitconverter.freeunitconversioncalculator:id/delete
    // ok com.unitconverter.freeunitconversioncalculator:id/spustitastaturu

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
