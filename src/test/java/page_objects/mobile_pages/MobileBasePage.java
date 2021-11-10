package page_objects.mobile_pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.ActionEngine;

import java.time.Duration;

import static utilities.AppiumWrapper.getAppiumDriver;

public class MobileBasePage {

    public MobileBasePage() {
        initPageElements();
    }

    protected void initPageElements() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver(), Duration.ofSeconds(15)), this);
    }
}
