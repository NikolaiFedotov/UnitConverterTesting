import com.freeunitconverter.driver.MainDriver;
import com.freeunitconverter.helpers.TestListener;
import com.freeunitconverter.pages.AreaPage;
import com.freeunitconverter.pages.CalcFramePage;
import com.freeunitconverter.pages.MainPage;
import com.freeunitconverter.pages.TemperaturePage;
import io.appium.java_client.AppiumDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static com.freeunitconverter.driver.MainDriver.getMainDriver;

public class BaseTest {


    protected MainPage mainPage;
    protected AreaPage areaPage;
    protected TemperaturePage temperaturePage;



    public BaseTest() {
        this.mainPage = new MainPage();
        this.areaPage = new AreaPage();
        this.temperaturePage = new TemperaturePage();
    }


    @BeforeSuite
    public void beforeSuite(ITestContext context) {
        getMainDriver();
    }

    @BeforeMethod
    public void configure() {
        getMainDriver().launchApp();
    }

    @AfterMethod(alwaysRun=true)
    protected void afterMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            TestListener.saveAllureScreenshot(getMainDriver());
            TestListener.saveTextLog(TestListener.getTestMethodName(result) + " failed and screenshot taken!");
        }

        getMainDriver().closeApp();

        //driver.close();
    }

    @AfterSuite
    public void tearDown() {
        getMainDriver().quit();
    }
}
