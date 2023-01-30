package com.freeunitconverter.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainDriver {
    public static AppiumDriverLocalService service;
     static AndroidDriver driver = null;

    public static AndroidDriver getMainDriver() {
        if (driver == null) {
            driver = createMainDriver();
        }
        return driver;
    }
    private static AndroidDriver createMainDriver() {
        service = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/"))
                .withIPAddress("127.0.0.1").usingPort(4723).withArgument(GeneralServerFlag.BASEPATH, "/wd/hub/").withTimeout(Duration.ofSeconds(10)).build();
        service.start();

//        com.freeunitconverter.driver.LocalConfig.
//        com.freeunitconverter.driver.LocalConfig dev = com.freeunitconverter.driver.LocalConfig.Device
        new LocalConfig().getDeviceConfig("pixel5");
        File appDir = new File( "src/main/resources/");
        File app = new File(appDir, "Free Unit Converter.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Copy_of_Automation Pixel 5 API 31");
        // /Users/mfedotov/Job/CDN/AppiumFirst
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 15);
        cap.setCapability(MobileCapabilityType.NO_RESET, true);

        URL url = null;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        AndroidDriver driver = new AndroidDriver( url, cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }
}
