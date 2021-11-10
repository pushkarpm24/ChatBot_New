package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.logging.Level;

public class BrowserFactory {

    public static WebDriver createInstance(String browser) {


        WebDriver driver = null;

        try {

            if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", WebPropertiesOperation.getPropertyValueByKey("ChromePath"));
                ChromeOptions opt = new ChromeOptions();
                opt.addArguments("allow-file-access-from-files");
                opt.addArguments("use-fake-device-for-media-stream");
                opt.addArguments("use-fake-ui-for-media-stream");
                opt.addArguments("--disable-features=EnableEphemeralFlashPermission");

//                DesiredCapabilities caps = DesiredCapabilities.chrome();
//                LoggingPreferences logPrefs = new LoggingPreferences();
//                logPrefs.enable(LogType.BROWSER, Level.ALL);
//                caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
                driver = new ChromeDriver(opt);


            } else if (browser.equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", WebPropertiesOperation.getPropertyValueByKey("FireFOxPath"));
                driver = new FirefoxDriver();

            } else if (browser.equals("edge")) {
                System.setProperty("webdriver.edge.driver", WebPropertiesOperation.getPropertyValueByKey("EdgePath"));
                driver = new EdgeDriver();
            }

//            Thread.sleep(500);
//            driver.manage().window().maximize();
//            driver.manage().deleteAllCookies();
        } catch (Exception e) {
            e.printStackTrace();
            return driver;
        }

        return driver;
    }
}
