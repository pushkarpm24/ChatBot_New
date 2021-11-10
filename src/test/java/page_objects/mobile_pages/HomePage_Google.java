package page_objects.mobile_pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.AppiumWrapper;

public class HomePage_Google extends MobileBasePage {

    @FindBy(name = "q")
    WebElement searchBox;

    @FindBy(name = "q")
    WebElement clickEnter;

    public void GoogleSearch() throws InterruptedException {

        searchBox.sendKeys("Automation");
        Thread.sleep(3000);
        clickEnter.sendKeys(Keys.ENTER);
        Thread.sleep(3000);


    }

    public void ScrollDown() throws InterruptedException {
        ((JavascriptExecutor) AppiumWrapper.getAppiumDriver()).executeScript("scroll(0,500)");
        Thread.sleep(3000);
//        scrollDownTillElementFound_Custom(AppiumWrapper.getAppiumDriver(),clickEnter);
    }
}
