package step_definations.web_stepdef;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.ComparisonFailure;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.web_pages.WebBasePage;
import utilities.BrowserFactory;
import utilities.DriverFactory;
import utilities.WebPropertiesOperation;

import java.io.IOException;

public class Hooks {

    WebBasePage base = new WebBasePage();
    BrowserFactory bf = new BrowserFactory();

//    @Before(value = "@web")
//    public void setup() throws IOException, InterruptedException {
//        DriverFactory.getInstance().setDriver(bf.createInstance(WebPropertiesOperation.getPropertyValueByKey("browser")));
//
//
//    }


    @AfterStep
    public void tearDownSteps(Scenario scenario){
        try {

            if(scenario.isFailed())
            {
            scenario.attach(base.getByteScreenShot(), "image/png", "Failed Teat Step Screenshot...");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {

        Thread.sleep(3000);
//        base.analyzeLog();

        DriverFactory.getInstance().closeBrowser();
    }


}
