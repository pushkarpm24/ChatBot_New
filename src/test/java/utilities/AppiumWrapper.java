package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumWrapper {

    private static AppiumDriver appiumDriver;

    private static void initializeAppiumDriver() throws MalformedURLException {
        appiumDriver = buildAppiumDriver();

        appiumDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    private static AppiumDriver buildAppiumDriver() throws MalformedURLException {

        AppiumDriver appiumDriver = null;
        String appiumServerURL = "http://127.0.0.1:4723/wd/hub";
        String platformname = MobilePropertiesOperation.getPropertyValueByKey("mobile_platform_name");
        DesiredCapabilities caps = new DesiredCapabilities();


        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformname);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, MobilePropertiesOperation.getPropertyValueByKey("mobile_version"));
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, MobilePropertiesOperation.getPropertyValueByKey("mobile-device"));
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //caps.setCapability("UiAutomator2", ImmutableMap.of("w3c", false));
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("w3c", false);
        caps.merge(chromeOptions);

        appiumDriver = new AndroidDriver(new URL(appiumServerURL), caps);

        //appiumDriver.get("https://www.google.com/");

        return appiumDriver;
    }

    public static AppiumDriver getAppiumDriver() {
        if (appiumDriver == null) {
            try {
                initializeAppiumDriver();
            } catch (MalformedURLException e) {
                Assert.fail("unable to initlize the appium driver because invalid server url or server is already in use..");
            }
        }
        return appiumDriver;
    }



    public static void quitAppiumDriver() {
        if (appiumDriver != null) {
            System.out.println("Quitting Appium.......");
            appiumDriver.quit();
            System.out.println("Quitting Appium - Done....");
            appiumDriver = null;
        }
    }
}
