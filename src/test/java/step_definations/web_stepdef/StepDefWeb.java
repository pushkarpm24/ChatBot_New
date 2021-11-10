package step_definations.web_stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import page_objects.web_pages.WebBasePage;
import utilities.BrowserFactory;
import utilities.DriverFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.assertj.core.api.SoftAssertions;

public class StepDefWeb extends WebBasePage{

    SoftAssertions softAssertions = new SoftAssertions();

    @Given("User Launch {string} Browser")
    public void user_Launch_Browser(String browser) {

        System.out.println("***************Launching the Browser For Scenario****************");
        DriverFactory.getInstance().setDriver(BrowserFactory.createInstance(browser));
    }

    @When("User Opens URL {string}")
    public void user_Opens_URL(String url) throws InterruptedException {
        DriverFactory.getInstance().getDriver().manage().window().maximize();
        Thread.sleep(3000);
        DriverFactory.getInstance().getDriver().get(url);

    }

    @When("Click On Bot Icon")
    public void click_On_Bot_Icon() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnBotIcon();
    }

    @Then("Validate The More Option Buttons")
    public void validate_The_More_Option_Buttons() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnMenuOption();

        //Validation Of Buttons

        //Home Button
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[normalize-space()='Home']")).isEnabled());

        //Sount Off/On Button
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[normalize-space()='Sound Off']")).isEnabled());
        String expectedText = "Sound Off";
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[normalize-space()='Sound Off']"));
        Assert.assertEquals(expectedText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[normalize-space()='Sound Off']")).getText());

        //Email Button
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[normalize-space()='Email']")).isEnabled());

        //Exit Chat Button
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[normalize-space()='Exit Chat']")).isEnabled());

        //Close Button On Left Top
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='close-menu']//*[local-name()='svg']")).isEnabled());

    }

    @Then("Validate The Language Selection Options")
    public void validate_The_Language_Selection_Options() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnCloseButton();
        Thread.sleep(4000);
        lp.ClickOnLanguageSelector();
        System.out.println("***************Clicked On Dropdown**************");

        //Validation Of Language Buttons

        //Marathi
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='मराठी']")).isEnabled());
        //2
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='Español']")).isEnabled());
        //3
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='عربي']")).isEnabled());
        //4
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='हिंदी']")).isEnabled());
        //5
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='Melayu']")).isEnabled());
        //6
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='বাংলা']")).isEnabled());
        //7
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='বাংলা']")).isEnabled());
        //8
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='বাংলা']")).isEnabled());
        //9
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='lang-generate-dropdown-hover'][normalize-space()='Eng']")).isEnabled());

        //Close Button On Left Top
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='close-menu']//*[local-name()='svg']")).isEnabled());


        lp.ClickOnCloseButton();
        //Validate Minimize Button
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(@style,'width: 43px; height: 26px; cursor: pointer;')]")).isEnabled());

    }

    @Then("Validate The Greeting Text With Following Buttons")
    public void validate_The_Greeting_Text_With_Following_Buttons() throws InterruptedException {

        //Validate Bot Name
        String botName = "Hi there! I'm Hitee ...";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),' Hitee ..')]"));
        Assert.assertEquals(botName,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),' Hitee ..')]")).getText());

        //Validate The Greeting Message
        String expectedMessage = "I can help answer any general queries about Insurance. Please choose any of the options:";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@data-text='true'][normalize-space()='I can help answer any general queries about Insurance. Please choose any of the options:']"));
        Assert.assertEquals(expectedMessage,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@data-text='true'][normalize-space()='I can help answer any general queries about Insurance. Please choose any of the options:']")).getText());

        //Validate Buttons

        //1 Button
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'Know More About Policies')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'Know More About Policies')]")).isEnabled());
        //2 Button
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'Buy Insurance')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'Buy Insurance')]")).isEnabled());
        //3 Button
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'Renew A Policy')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'Renew A Policy')]")).isEnabled());
        //4 Button
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'Check Claim Status')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'Check Claim Status')]")).isEnabled());
        //5 Button
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'FAQ')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'FAQ')]")).isEnabled());

    }

    @Then("Validate Text Field With Microphone Symbol And Send Button")
    public void validate_Text_Field_With_Microphone_Symbol_And_Send_Button() throws InterruptedException {

        Thread.sleep(2000);
        //Validate Text Field
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//input[@placeholder='Type Your Message']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//input[@placeholder='Type Your Message']")).isEnabled());
        //Validate Send Button
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.className("Submit-button"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.className("Submit-button")).isEnabled());
        //Validate Microphone Button
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//*[name()='path' and contains(@fill,'#fff')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//*[name()='path' and contains(@fill,'#fff')]")).isEnabled());

    }

    @Then("Click On Know More About Policies And Validate bot dialog with the Carousels, Get quote and No thanks buttons")
    public void click_On_Know_More_About_Policies_And_Validate_bot_dialog_with_the_Carousels_Get_quote_and_No_thanks_buttons() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnKnowMorePolicies();

        Thread.sleep(2000);
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//p[normalize-space()='Would you like to get a quote?']"));


        //Validate The Bot Message
        String expectedMessage = "Sure thing! Here are some simple explainers of insurance policy, to help you get started.  ";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),'Sure thing! Here are some simple explainers of insurance policy, to help you get started.  ')]"));
        Assert.assertEquals(expectedMessage,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),'Sure thing! Here are some simple explainers of insurance policy, to help you get started.  ')]")).getText());


        //Validate Both The Carousels
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//a[@class='carousel-control-prev']//i[@class='fa fa-angle-left']")).isEnabled());

        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//a[@class='carousel-control-next']//i[@class='fa fa-angle-right']")).isEnabled());

        //Validate Get Quote Button
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'Get Quote')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'Get Quote')]")).isEnabled());

        //Validate No Thanks Button
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'No Thanks!')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'No Thanks!')]")).isEnabled());
    }

    @Then("Click On No Thanks Button And Validate bot dialog along with Main Menu and Rate your experience buttons")
    public void click_On_No_Thanks_Button_And_Validate_bot_dialog_along_with_Main_Menu_and_Rate_your_experience_buttons() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnNoThanksBtn();

        //Validate Bot Dialog
        String expectedMessage = "Okey-Dokey! If you'd like to see other options, please click on the";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),\"Okey-Dokey! If you'd like to see other options, please click on the\")]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),\"Okey-Dokey! If you'd like to see other options, please click on the\")]")).getText().contains(expectedMessage));

        //Validate Main Menu Button
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'Main Menu')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'Main Menu')]")).isEnabled());

        //Validate Rate Your Exp Button
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'Rate Your Experience')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'Rate Your Experience')]")).isEnabled());

    }

    @Then("Click On Rate Your Experience Button And Validate bot dialog and Emoji along with text field and submit button")
    public void click_On_Rate_Your_Experience_Button_And_Validate_bot_dialog_and_Emoji_along_with_text_field_and_submit_button() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnRateYourExp();

        //Validate Bot Dialog
        String expectedMessage = "To help me serve you better, please rate your experience below:";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@data-text='true'][normalize-space()='To help me serve you better, please rate your experience below:']"));
        Assert.assertEquals(expectedMessage,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@data-text='true'][normalize-space()='To help me serve you better, please rate your experience below:']")).getText());

        //Validate Emoji
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//img[@src='data:image/png;base64,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']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//img[@src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAFwAAABcCAYAAADj79JYAAAAAXNSR0IArs4c6QAAADhlWElmTU0AKgAAAAgAAYdpAAQAAAABAAAAGgAAAAAAAqACAAQAAAABAAAAXKADAAQAAAABAAAAXAAAAABCwOslAAANG0lEQVR4Ae1deWwU1xl/b3ZtbHxgGxA0mJTDdtJwmKSUgg+OJGqBRg1HqyKiSiRKW6lSha91rbagrfpHiu+IlCbpiTjUJFBI1AQqtY3BB63rJjQccbABBxuHBvANXuPdef2+sccer2d353izXsw+yZ6Z9953vN988737LSUhFnLrclPsjKYTkSWDanMZJXMpI7MIJUmM0Hi4j4f7RMKIC9J6KGPdEN9DKelgjLXBtZUQ1soYbRmIcNfvXbm3J5SKSCdaGecFZ+Sdju4nAbQNhLKNlNAUXjoxwgaBVy38vcdE4d2y1WUXefE2ymdCAHe+77TfiQSQGdkOim8GkOONFkAXHWNXiEAOe0R6oDy7/JIuWk6Zgwq443ROJqN0Owj9NqF0JqcyGGPD2AdMoIdohO1wyYqSG8aY6KcKCuCFNTsfEZnwU1BvO6XUpl9NCykYucEEUkJihddK00vvWChJYm0p4Ag0Y7ZfQCW3FaQJVhfGHH92G+jLWZztZSuBtwRwZ8P3p/b1x+6G1kIOWPQUc0AEmRr8vGgTfliWUfZXKyTzBRyaGo6a/G2EiMXgo7FZd/8Gxk5SKuYUZ738Cc9CcAO8qLoo0U0HDkGLYwNPBSeY1z1o7+eVZJf/ipceXADPr83/isDEI4TQh3kpFkp8oEN15K574Pl96/b1mdXLNOCO6tz1UCkeBbCnmlUmtOnZObvofuql1XtvmtHTVMuhoDb3eUbIXyY/2AgxXTIo2OsctY6FEwK4oyZ3N2X09yHXrjaDRgBaHHZgzFOHLjRAVp/JhlyKozrvd+BGXvDJdZInwJAEdJDEZ0qzK6v0FlW3SymoznM+yGAjwDAiGUOp8M6Pa3IX6QVcl4UX1OT9AAhe1StkEudvdzOWXZFdcUVrGTUDXlCb8w3KhHeAse6vQqsy92m+y26BrajIqOjQor8m8ArP5HwJKsg3w2CrQrrQ5iFvQAdJk/EGHLmDGZho6hH+Bq2Rh1TFhSPBp9MFGddWkbo/nKkKBEdAC7eJ5NdQSTwWiNGDng4Y7Sqsy10RCAe/n4GjLncNEWlVICbh9CEEoLnYGpsUn+Jc5LznCxOfFo5zjUQkr/kiDMePRwCsfG5fR89PxqeMxvgEfIiQPjKalf9d/+1+MngX53mtDygH5VkfWFFedV6aLzl2tYQhAlYETXy1ZFNxHU2dpOXkp6T3eh/x9HskXlFJU0hcchxJ2bSARE+PNsVfSYwANx+/QnrbeomrY0BKskXbSNycWDJv/RdJUmqiMjuXe5xwgZYI9lWeVGOoimhBTe5xGDd4Vo3ATNylo02k7XS7TxYIxoIN88jcNebnLq5VtZGrJ1tGXqqa0OQ1c0jaFm6rMsaIoALdXJxRdnxMJDyMcymO2pxlEP9N74xmnwOBjfzR4pv+fJnc/OiWKXGf/esGaT522S/YKKDt1HWCelkRmEfcpcZ3HOCECUVg3aqWr8ZASxy6EX+W7c3j4uFGw/4W3cilY83eLH0+o16oH/dA6RPSXIEX4zGAS2O9TJph98pm7hGtVk9AS78Kft5IQDq5btBKj1+DRQHqwbFhDOCMuXdBPalakY4l0/d0p13/cg9Xh0ufkOHcvW36Z8H6ruvXT5NylK4pqM5Zq8w7AjguPyOMfkuZyOPe6Ofa1dxtSLyRl4uCjOoZUEkqbFPmGQH87pTeZ8BzxygTw/fmEaCEbZKMeZjVCOCiKO4wz348B6Nt3ZiHjL17o3RG9RxfYu8YOguNWY6VAM9vyJ8BERvlSN5XIyDEJccaUsMInRH99CinNGYJcNs9kgVNwQg9TPTkTd2ib6LbHm0n86EnaCQgHdLrCXr108Mb88Jcwtfl8XIJcMbEtXqZ6MmPn2vyau3D6djtNtrFRzqk1xpQL+vcybAWlEQ56nLS8WkYcLp2OMmyy3zosgcCHS0zZfNC8vBac117pEc+gSwd9UG9ghEYE9aiHIprAj30HvalJfAx0sqAzS8cvMK2r7vfLYlCYBJSppFUAMmoZavpjL3OJujUYBNTKSt2Toxlg1dqemAcbH95uzSrYpPdTVzplAhBARsF4+crf8IICIIdMdWa6gNf3tIXF6NYaRgYQef5QiXGmv9RHKMidioI8wD+CQnBLDy+VKterCbwGEt2MqcAi17Jo5oIwplMIYBLAnvP9KYJ0GYJA24KSu3EMDHxqADuZLZ2knBOMwh4RHG2AOMnCWaYhGm1IwAtkwRsnYQB146ZqZywHR0Bp1GmuISJtSMA3kSA/SthwLVDZjIniwpah8ekppOEnLqw0uyaJKUJ/WIw0iXAKltjk4ehX7xQ1BAsnLAw4EF6NZQyF1SatCVI8sJiKL0hUIE1hpEIDgJwfFRj2MKDg7Uk5V6M2CgIQtilBAnz7srHK6GVwjwtQRL4QIuBDqbkuoWSjMr/wvSPpi1vDzRiZgtP6VlkAePh0nxPtVl+YXr/CIDrPok5hrv24Y1T/uEylwoehNFI+/sjgMNRQ1XmWIap/SNAP9qzfI+0OlWy8JLMyrPwEjTvF/fPPJw6DgFGjstxI6OFMKZyQI7kdb1R/z/S2XT/jI11NneNrF/hhQG6E7td/KPMb3QRXqSwnw16dvPabnLxUCNBwDHMXjGLPPZc6M5V43qVD/aelRYn2aJsJNO5MuCqLRnAgFdG6n+5qrJFzjdi4aVfLb0K7ZV6OcHsVQYb+eA9voBQDP2w00IGG/XzuDwEN2VxC5T+SclrBHAp0itRmVHvvfc6QgT93G8vcP9k9eqlzI/bU+r3NEiWLcfbo+xkxlJcvW0+gDsZZFH0oJLTGMBjB+NfhUTfGymVlAHu07amSq5Eme3muVukvrgBNqrq34ej5MPjvhW2DP675D+SRcv8EOzHf5ROopP4zDrC5M6+suVluG5zJMDalNFQtb/KnfnCykiYWH56NNb43UywFFw72NE4ui3PDTvU2us+AxFE2hEsRIx558aFaaREF4JfWnvtWLuSwTayoF9VNCNuEmnfWvebujHWNW4/Zs6HOQkRfcIVAITbvmi07I8PfkLcrqHVsrKCuOV7wYb5474EOZ3nFSvG1lOwO/nE+O2IuANi6fcWc7Ns1BvcyX5YLbvDuwzjAMcMcEReEZjgS96ZzTyjG8GKU22XmQz8jCXT+bUOhpVFi756okXa3YwVonfAugbdH88AA1UDQoQ7pXjl3jZvvqqA49EdcJrEh+CDuB9Mc+W9FmnLtbe1o2LYJEM3JP0tMV5xIcjdsCb8WlXrmApRWfgpiVOkpmpiaoIymss9nJvy89LscqcaM1XAMePQEaf0hBqR2TgEpOloM7l1Ho/s9h0SUhJIYuo0sPoIgovoMSRCnByQj7yBtgs6Lf23XbD4vmvk5Ag5n/KKvhoPNViwcZ4ymtt9oENqfAKOGlh1qoRcOvlzV7bZ5TTeVxnoh9clc3dbSl19nSIh5/EL+M5/7pwVMSg0wtrmUbOSKTleEfhbcIIEHrkx0Dl0rgkv9jMWTycz02eQL6yYzYulPz5vlGSVb/OXwS/gSFhYl7+JieyYPyY807ByRbeAYzDS3hyvlk0gWdjiSIT9QolpiZL7CbSxKhA/7emsRYiKXCaPCvqiCwg4EjpqcythH/5OX0ysjMfmHL4EV6eL9N9yqYqKmxtLohKj4FShWNV0qyOxRwm9iYzirIqGQLJGB6/85OyecscxrT9mFRyjEvCYOD9sDCWhhVrRkjCkjE8iWlicVR4QbCTX1M17ffnrg5RGbIY3ed2nzAc0AfajHSzNKq/UWnxNgCOz4qzidkJt6wH0kPptM60FtSIfYPGPTzNbd+jhrRlwZFqaWXoeJkO3oM/SI2Qy5gXLPn93cODZt+hb47uvfgqsC3DkU5xR/nfYrP+iH54PQlK7WxS/ZuRHODS1UtQQHDpaiB6zuo2uJnti41iDy+5+yujPRuq2cLmw0nH8gi0bPq3P5bjJfgVXesItkNVGwUZ8DFu4DG7eqby5NoEdmYgmo6yD1VcAmgFQe1oy236m12d762YacGQojS529jhhFJj7mYfeCgf7GcDugGXGz5VkV5zkIZsL4LIiOMIIpoA/D5Ykx93XV8ZOwY+dfrd8TXkrr3IY9uFqCqAVwJKuRWAVb6ql3y9xoD/0NVhejHva0zzBxvJztXAloIU1eetERl6xYhJDKYfn/ZCvpgcYFRzQ57CkMWAZ4AiE9NvH9p7tjLJd4GZSeILDmxeA/bZNILv2ZFSc481byc9SwGVBoQx8sICWsQgK4LKwUAI+2EDLGAQVcFkoXgtrCuM8ZHALKPAd+FsD1clUZTr3e8ba4BfH34W/w2WZZae589fIcMIA99Yvvzr/y7AZIxNOKMqEyY5lUNmmeefR+gzW2w9t53PQRK2HZkGtYHPXqC1Z0MqPZ76QAVytUI4zOU+IbrIIDkJbAL+4kgQvYxqssImHCjgemm2DAGgPvJxueFE9RGCfM5F+DEN3F/T8NpqaXCvj/g9b6nLoESQ+HQAAAABJRU5ErkJggg==']")).isEnabled());

        //Validate Text Field
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//textarea[@placeholder='Tell Us How we can improve our Services']")).isEnabled());

//        //Validate Submit Button Is Disabled
//        Assert.assertFalse(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Input-Submit-button']")).isEnabled());
    }

    @Then("Click On Any Emoji As Per Experience")
    public void click_On_Any_Emoji_As_Per_Experience() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnEmoji();
    }

    @Then("Click On Submit Button")
    public void click_On_Submit_Button() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnSubmitBtn();
        Thread.sleep(3000);
    }

    @Then("Validate Bot Dialog According To The Emoji")
    public void validate_Bot_Dialog_According_To_The_Emoji() {

//        //Validate Emoji Msg
//        String expectedMsg = "Happy";
//        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(normalize-space(),'Happy')]/parent::div[@style='margin-bottom: 10px;']/parent::div[contains(@style,'padding-right: 20px; margin-bottom: 25px;')]"));
//        Assert.assertEquals(expectedMsg,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(normalize-space(),'Happy')]/parent::div[@style='margin-bottom: 10px;']/parent::div[contains(@style,'padding-right: 20px; margin-bottom: 25px;')]")).getText());

        //Validate Bot Dialog
        String expectedDialog = "Thanks a lot. Will train further to make it more wonderful.";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@data-text='true'][normalize-space()='Thanks a lot. Will train further to make it more wonderful.']"));
        Assert.assertEquals(expectedDialog,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@data-text='true'][normalize-space()='Thanks a lot. Will train further to make it more wonderful.']")).getText());
    }

    @Then("Click On Home Button")
    public void click_On_Home_Button() {

        lp.ClickOnHomeBtn();
    }

    @Then("Click On Know More About Policies")
    public void click_On_Know_More_About_Policies() throws InterruptedException {
        DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(@class,'Buttons')]//div[contains(text(),'Know More About Policies')]")).click();

        Thread.sleep(2000);
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//p[normalize-space()='Would you like to get a quote?']"));


        //Validate The Bot Message
        String expectedMessage = "Sure thing! Here are some simple explainers of insurance policy, to help you get started.  ";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),'Sure thing! Here are some simple explainers of insurance policy, to help you get started.  ')]"));
        Assert.assertEquals(expectedMessage,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),'Sure thing! Here are some simple explainers of insurance policy, to help you get started.  ')]")).getText());

        //Validate Both The Carousels
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//a[@class='carousel-control-prev']//i[@class='fa fa-angle-left']")).isEnabled());

        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//a[@class='carousel-control-next']//i[@class='fa fa-angle-right']")).isEnabled());

        //Validate Get Quote Button
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'Get Quote')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'Get Quote')]")).isEnabled());

        //Validate No Thanks Button
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'No Thanks!')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'No Thanks!')]")).isEnabled());
    }

    @Then("Click On Get Quote Button")
    public void click_On_Get_Quote_Button() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnGetQuote();

        //Thread.sleep(50000);
    }

    @Then("Validate Bot Dialog And Product Name Dropdown")
    public void validate_Bot_Dialog_And_Product_Name_Dropdown() throws InterruptedException {
        Thread.sleep(3000);
        //Validate Bot Dialog
        String dialogOne = "That's great! I can help you build a free insurance quote in just a minute.  ";
        String dialogTwo = "Choose your insurance product and type from the drop-down below:";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),\"That's great! I can help you build a free insurance quote in just a minute.\")]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),\"That's great! I can help you build a free insurance quote in just a minute.\")]")).getText().contains(dialogOne));
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),'Choose your insurance product and type from the drop-down below:')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),'Choose your insurance product and type from the drop-down below:')]")).getText().contains(dialogTwo));

        //Validate product Name Dropdown

        String dropdownHeading = "Product Name";
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@style='margin-bottom: 20px;']//div[.='Product Name *']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@style='margin-bottom: 20px;']//div[.='Product Name *']")).getText().contains(dropdownHeading));
    }

    @Then("Click On Product Name Dropdown")
    public void click_On_Product_Name_Dropdown() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnProductNameDropdown();

        //Validate Health And Travel Insurance Radio Button
        String healthBtnText = "Health Insurance";
        String travelBtnText = "Travel Insurance";

        Assert.assertEquals(healthBtnText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Dropdown-list-cont']//div[contains(text(),'Health Insurance')]")).getText());
        Assert.assertEquals(travelBtnText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Dropdown-list-cont']//div[contains(text(),'Travel Insurance')]")).getText());

    }

    @Then("Click On Any Required Product Name Radio Button")
    public void click_On_Any_Required_Product_Name_Radio_Button() {

        lp.ClickProductNameRadioBtn();

        //Validate  selected Product name in the field
        String fieldText = "Health Insurance";

        Assert.assertEquals(fieldText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Dropdown Dropdown-close']//div[contains(text(),'Health Insurance')]")).getText());


    }

    @Then("Click On Product Type Dropdown")
    public void click_On_Product_Type_Dropdown() {

        lp.ClickOnProductTypeDropdown();

        //Validate Health And Travel Insurance Radio Button
        String healthBtnText = "Medicare";
        String travelBtnText = "Medicare Plus";

        Assert.assertEquals(healthBtnText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Dropdown-list-cont']//div[contains(text(),'Medicare')]")).getText());
        Assert.assertEquals(travelBtnText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Dropdown-list-cont']//div[contains(text(),'Medicare Plus')]")).getText());

    }

    @Then("Click On Any Required Product Type Radio Button")
    public void click_On_Any_Required_Product_Type_Radio_Button() {

        lp.ClickProductTypeBtn();

        //Validate  selected Product name in the field
        String fieldText = "Medicare";

        Assert.assertEquals(fieldText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Dropdown Dropdown-close']//div[contains(text(),'Medicare')]")).getText());


    }

    @Then("Validate Bot Dialog With Slider By Default INR {int} Lakhs Should Be Selected, Tenure Required Dropdown And Submit Button")
    public void Validate_bot_Dialog_With_Slider_By_Default_INR_Lakhs_Should_Be_Selected_Tenure_Required_Dropdown_And_Submit_Button(Integer int1) throws InterruptedException {

        Thread.sleep(3000);
        //Validate the bot dialog
        String dialog = "Choose your sum insured and policy period:";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),'Choose your sum insured and policy period:')]"));
        Assert.assertEquals(dialog,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),'Choose your sum insured and policy period:')]")).getText());

//        //Slider with by default 1 lakh
//        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbColorPrimary jss18']//span[contains(@class,'jss20 MuiSlider-valueLabel')]//span[contains(@class,'jss21')]//span[contains(text(),'1')]"));
//        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbColorPrimary jss18']//span[contains(@class,'jss20 MuiSlider-valueLabel')]//span[contains(@class,'jss21')]//span[contains(text(),'1')]")).isEnabled());

        //Validate policy period Drop down
        String fieldText = "Policy Period";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@class='Dropdown Dropdown-close']//div[text()='Policy Period']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Dropdown Dropdown-close']//div[text()='Policy Period']")).getText().contains(fieldText));

    }

    @Then("Drag The Slider According To The Required Insured Sum")
    public void drag_The_Slider_According_To_The_Required_Insured_Sum() throws InterruptedException, AWTException {

        Thread.sleep(3000);
        lp.ClickOnSliderIcon();

        //Validate

        String inr = "2";
        Assert.assertEquals(inr,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(@style,'display: flex; align-items: center; margin-bottom: 10px;')]//div[starts-with(text(),'2')]")).getText());

        
    }

    @Then("Click on Tenure Required drop down")
    public void click_on_Tenure_Required_drop_down() throws InterruptedException {

        Thread.sleep(2000);
        lp.ClickOnTenureDropDown();

        //Validate  radio buttons which contains number of years
        String healthBtnText = "1";
        String travelBtnText = "2";

        Assert.assertEquals(healthBtnText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Dropdown-list-cont']//div[contains(text(),'1')]")).getText());
        Assert.assertEquals(travelBtnText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Dropdown-list-cont']//div[contains(text(),'2')]")).getText());

    }

    @Then("Select required tenure year")
    public void select_required_tenure_year() throws InterruptedException {

        Thread.sleep(2000);
        lp.ClickOnTenureYear();

        //Validate  Tenure Year in the field
        String fieldText = "2";

        Assert.assertEquals(fieldText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(@class,'Dropdown-name')][starts-with(text(),'2')]")).getText());


    }

    @Then("Validate The Bot Message Eldest member age Members slider Yes and No radio buttons")
    public void validate_The_Bot_Message_Eldest_member_age_Members_slider_Yes_and_No_radio_buttons() throws InterruptedException {

        Thread.sleep(3000);
        //Validate the bot dialog
        String dialog = "Please provide additional details:";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),'Please provide additional details:')]"));
        Assert.assertEquals(dialog,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),'Please provide additional details:')]")).getText());

//        //Validate Eldest member age field
//        String placeholder = "Enter The Age";
//
//        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//input[@class='FormInput-container-input'][@placeholder='Enter The Age']"));
//        Assert.assertEquals(placeholder,DriverFactory.getInstance().getDriver().findElement(By.xpath("//input[@class='FormInput-container-input'][@placeholder='Enter The Age']")).getText());

        //Validate slider is till 4
        String fieldText = "4";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[normalize-space()='4']"));
        Assert.assertEquals(fieldText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[normalize-space()='4']")).getText());

        //Validate yes and no radio buttons
        String radioBtnOne = "Yes";
        String radioBtnTwo = "No";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[normalize-space()='Yes']"));
        Assert.assertEquals(radioBtnOne,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='Yes']")).getText());
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[normalize-space()='No']"));
        Assert.assertEquals(radioBtnTwo,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='No']")).getText());


    }

    @Then("Enter age value with {string} three digits in member age")
    public void enter_age_value_with_three_digits_in_member_age(String age) throws InterruptedException {

        Thread.sleep(2000);
        lp.EnterThreeDigitAge(age);

        //Validate System should not accept the third digit
        try {
            Assert.assertEquals("111",DriverFactory.getInstance().getDriver().findElement(By.xpath("//input[contains(@class,'FormInput-container-input')][@value='11']")).getAttribute("value"));
            Assert.fail();
        }catch (ComparisonFailure e)
        {
            Assert.assertEquals("11",DriverFactory.getInstance().getDriver().findElement(By.xpath("//input[contains(@class,'FormInput-container-input')][@value='11']")).getAttribute("value"));
        }
    }

    @Then("Enter {string} character in member age And validate {string} message")
    public void enter_character_in_member_age_And_validate_message(String aa, String msg) throws InterruptedException {
        Thread.sleep(2000);
        lp.EnterCharacterAge(aa);

        Assert.assertEquals(msg,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Error-msg'][contains(text(),'Please enter only numbers')]")).getText());

    }

    @Then("Enter {string} Special characters in Member age And validate {string} message")
    public void enter_Special_characters_in_Member_age_And_validate_message(String splchar, String msg) throws InterruptedException {

        Thread.sleep(2000);
        lp.EnterSplCharAge(splchar);

        Assert.assertEquals(msg,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Error-msg'][contains(text(),'Please enter only numbers')]")).getText());


    }

    @Then("Enter {string} Zeros in member age And validate {string} message")
    public void enter_Zeros_in_member_age_And_validate_message(String oo, String msg) throws InterruptedException {

        Thread.sleep(2000);
        lp.EnterZeroAge(oo);

        Assert.assertEquals(msg,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(@class,'Error-msg')][.='Please maintain exactly 2 characters']")).getText());

        Thread.sleep(2000);
        DriverFactory.getInstance().getDriver().findElement(By.xpath("//input[@placeholder='Enter The Age']")).sendKeys(Keys.BACK_SPACE);
        DriverFactory.getInstance().getDriver().findElement(By.xpath("//input[@placeholder='Enter The Age']")).sendKeys(Keys.BACK_SPACE);
    }

    @Then("Enter one digit and one alphabet {string} in members age And validate {string} message")
    public void enter_one_digit_and_one_alphabet_in_members_age_And_validate_message(String alphachar, String msg) throws InterruptedException, AWTException {

        Thread.sleep(2000);
        lp.EnterAlphabetCharAge(alphachar);

        Assert.assertEquals(msg,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Error-msg'][contains(text(),'Please enter only numbers')]")).getText());

        Thread.sleep(2000);
        DriverFactory.getInstance().getDriver().findElement(By.xpath("//input[@placeholder='Enter The Age']")).sendKeys(Keys.BACK_SPACE);
        DriverFactory.getInstance().getDriver().findElement(By.xpath("//input[@placeholder='Enter The Age']")).sendKeys(Keys.BACK_SPACE);



    }

    @Then("Enter one digit and one special character {string} in members age And validate {string} message")
    public void enter_one_digit_and_one_special_character_in_members_age_And_validate_message(String alpsplchar, String msg) throws InterruptedException {

        Thread.sleep(3000);
        lp.EnterAlphabetSplCharAge(alpsplchar);

        Assert.assertEquals(msg,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Error-msg'][contains(text(),'Please enter only numbers')]")).getText());

        Thread.sleep(2000);
        DriverFactory.getInstance().getDriver().findElement(By.xpath("//input[@placeholder='Enter The Age']")).sendKeys(Keys.BACK_SPACE);
        DriverFactory.getInstance().getDriver().findElement(By.xpath("//input[@placeholder='Enter The Age']")).sendKeys(Keys.BACK_SPACE);
    }

    @Then("Drag Slider as per the members present")
    public void drag_Slider_as_per_the_members_present() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnSliderIconMember();

        //Validate

        String inr = "2";
        Assert.assertEquals(inr,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(@style,'display: flex; align-items: center; margin-bottom: 10px;')]//div[starts-with(text(),'2')]")).getText());

    }

    @Then("Click any radio button for the ongoing medical conditions")
    public void click_any_radio_button_for_the_ongoing_medical_conditions() throws InterruptedException {

        Thread.sleep(2000);

        lp.ClickOnNoRadioBtn();
    }

    @Then("Validate submitted details greeting message for buying a product with the quoted amount and connect to agent button")
    public void validate_submitted_details_greeting_message_for_buying_a_product_with_the_quoted_amount_and_connect_to_agent_button() throws InterruptedException {

        Thread.sleep(3000);

        //Validate submitted details
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Input-val'][contains(text(),'11')]")).getText().contains("11"));

        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'2 Member (s)')]")).getText().contains("2"));

        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='No']")).getText().contains("No"));

        //Validate Greeting message
        String greetingMsg = "Thanks for the details. Based on the input provided, your product quotation amount is Rs :  1.0 ";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),'Thanks for the details. Based on the input provided, your product quotation amount is Rs :  1.0')]"));
        Assert.assertEquals(greetingMsg,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),'Thanks for the details. Based on the input provided, your product quotation amount is Rs :  1.0')]")).getText());

    }

    @Then("Click on connect with agent button")
    public void click_on_connect_with_agent_button() throws InterruptedException {

        Thread.sleep(2000);

        lp.ClickOnConnectAgentBtn();

        //Validate the 3 Buttons
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'Chat With Our Agent')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'Chat With Our Agent')]")).isEnabled());

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'Video Appointment')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'Video Appointment')]")).isEnabled());

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'Book An Appointment')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'Book An Appointment')]")).isEnabled());
    }

    @Then("Click on Chat with our agent")
    public void click_on_Chat_with_our_agent() throws InterruptedException {

        Thread.sleep(2000);

        lp.ClickOnChatAgent();

        //Validate bot dialog
        String dialog = "Please wait, our agent will connect with you shortly.";
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@data-text='true'][normalize-space()='Please wait, our agent will connect with you shortly.']"));
        Assert.assertEquals(dialog,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@data-text='true'][normalize-space()='Please wait, our agent will connect with you shortly.']")).getText());
    }

    @Then("Click on video appoint button")
    public void click_on_video_appoint_button() throws InterruptedException {

        Thread.sleep(2000);
        lp.ClickOnVideoAppoint();

        //Validate bot dialog
        String dialog = "Please click here to speak with our agent:";
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),'Please click here to speak with our agent:')]"));
        Assert.assertEquals(dialog,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),'Please click here to speak with our agent:')]")).getText());

    }

    @Then("Click on connect button")
    public void click_on_connect_button() throws InterruptedException {

        Thread.sleep(2000);
        lp.ClickOnConnectBtn();

        //Validate bot dialog for popup
        String dialog = "Do you want to initiate a Video chat?";
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'Do you want to initiate a Video chat?')]"));
        Assert.assertEquals(dialog,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'Do you want to initiate a Video chat?')]")).getText());

    }

    @Then("Click on No button")
    public void click_on_No_button() throws InterruptedException {

        Thread.sleep(2000);
        lp.ClickoOnNoBtnPopup();


    }

    @Then("Click on No button in claim status")
    public void click_on_No_button_in_claim_status() throws InterruptedException {

        Thread.sleep(2000);
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@class='Button-effect']//div[contains(text(),'No')]"));
        click_custom(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Button-effect']//div[contains(text(),'No')]")),"No Button In claim Status Section");


    }

    @Then("Click on Yes btton")
    public void click_on_Yes_btton() throws InterruptedException {

        Thread.sleep(2000);
        lp.ClickOnYesBtnPopup();

        //Validate A video call pop up window should open with Mic, Video, call disconnect, Lower / raise hand, open/ close chat, toggle title view, more actions, video on left had corner and hide button icons


        Thread.sleep(30000);
    }

    @Then("Click on close icon")
    public void click_on_close_icon() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnCloseBtnVideo();

        //Validate bot dialog for popup
        String dialog = "We hope that we were able to answer your queries today.";
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@data-text='true'][normalize-space()='We hope that we were able to answer your queries today.']"));
        Assert.assertEquals(dialog,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@data-text='true'][normalize-space()='We hope that we were able to answer your queries today.']")).getText());


    }

    @Then("Click On Main Menu")
    public void Click_On_Main_Menu() throws InterruptedException {

        Thread.sleep(5000);

        lp.ClickOnMainMenu();

    }

    @Then("Click on Book appointment button")
    public void click_on_Book_appointment_button() throws InterruptedException {

        Thread.sleep(2000);
        lp.ClickOnBookAppointment();

        //Validate bot dialog for popup
        String dialog = "Sure! Please help us with your details:  ";
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),'Sure! Please help us with your details:')]"));
        Assert.assertEquals(dialog,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),'Sure! Please help us with your details:')]")).getText());

    }

    @Then("Provide {string} in name field")
    public void provide_in_name_field(String name) throws InterruptedException {

        Thread.sleep(2000);
        lp.EnterName(name);
    }

    @Then("Provide {string} phone number")
    public void provide_any_phone_number(String number) throws InterruptedException {

        Thread.sleep(2000);
        lp.EnterNumber(number);
    }

    @Then("Provide {string} valid email id")
    public void provide_any_valid_email_id(String email) throws InterruptedException {

        Thread.sleep(2000);
        lp.EnterEmail(email);
    }

    @Then("Click on calendar icon")
    public void click_on_calendar_icon() throws InterruptedException {

        Thread.sleep(2000);
        DateFormat dateFormat = new SimpleDateFormat("dd");
        Date date = new Date();
        String date1= dateFormat.format(date);
        System.out.println(date1);

        Calendar c = Calendar.getInstance();
        String month = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH );

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//input[contains(@value,'"+month+", 2021')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//input[contains(@value,'"+month+", 2021')]")).isEnabled());


        Thread.sleep(2000);
        lp.ClickOnCalanderIcon();
    }

    @Then("Select required date and time")
    public void select_required_date_and_time() throws InterruptedException {

        Thread.sleep(2000);
        lp.SelectTimeSlot();
    }

    @Then("Validate The Autopopulated Values Of sum insured and policy period Screen")
    public void validate_The_Autopopulated_Values_Of_sum_insured_and_policy_period_Screen() {

        //Validate the bot dialog
        String dialog = "Choose your sum insured and policy period:";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),'Choose your sum insured and policy period:')]"));
        Assert.assertEquals(dialog,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),'Choose your sum insured and policy period:')]")).getText());


        //Validate Sum Insured
        String si = "2";
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@class='Slider-value'][text()='2']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Slider-value'][text()='2']")).getText().contains(si));

        //Validate Policy Period
        String policyPeriod = "2";
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@class='Dropdown-name'][text()='2']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Dropdown-name'][text()='2']")).getText().contains(policyPeriod));



    }

    @Then("Validate All the Autopopulated Fields of additional details Screen")
    public void validate_All_the_Autopopulated_Fields_of_additional_details_Screen() {

        //Validate Eldest Member Age
        String age = "11";
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//input[@class='FormInput-container-input'][contains(@value,'11')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//input[@class='FormInput-container-input'][contains(@value,'11')]")).getAttribute("value").contains(age));

        //Validate Members
        String member = "2";
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@class='Slider-value'][text()='2']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Slider-value'][text()='2']")).getText().contains(member));


    }

    @Then("Click on Buy Insurance button")
    public void click_on_Buy_Insurance_button() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnBuyInsurance();

        //Validate the bot dialog
        String dialog = "That's great! I can help build a free insurance quote in just a minute. Please help us with basic details";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),\"That's great! I can help build a free insurance quote in just a minute. Please help us with basic details\")]"));
        Assert.assertEquals(dialog,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),\"That's great! I can help build a free insurance quote in just a minute. Please help us with basic details\")]")).getText());

    }

    @Then("Click on Validate Mobile Number button")
    public void click_on_Validate_Mobile_Number_button() throws InterruptedException {

        Thread.sleep(3000);

        lp.ClickOnValidateMobileNo();
    }

    @Then("Enter received OTP")
    public void enter_received_OTP() throws InterruptedException {
        Thread.sleep(50000);


        DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Input-Submit-button']")).click();

//        //Validate the bot dialog
//        String dialog = "Thanks pushkar, for validating your mobile number.";
//
//        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@data-offset-key='do2mc-0-0']//span[contains(text(),'Thanks pushkar, for validating your mobile number.')]"));
//        Assert.assertEquals(dialog,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@data-offset-key='do2mc-0-0']//span[contains(text(),'Thanks pushkar, for validating your mobile number.')]")).getText());
//

    }

    @Then("Click on validate button")
    public void click_on_validate_button() {

    }

    @Then("Click on Health insurance button")
    public void click_on_Health_insurance_button() throws InterruptedException {

        Thread.sleep(3000);
        //Validate the bot dialog
        String dialog = "Please let me know what you are looking for today:";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),'Please let me know what you are looking for today:')]"));
        Assert.assertEquals(dialog,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),'Please let me know what you are looking for today:')]")).getText());


        lp.ClickOnHealthInsuranceBtn();


        //Validate the Dropdown
        String ddText = "Health Insurance - Medicare";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(@class,'Dropdown-name')][contains(.,'Health Insurance - Medicare')]"));
        Assert.assertEquals(ddText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(@class,'Dropdown-name')][contains(.,'Health Insurance - Medicare')]")).getText());


    }

    @Then("Click on Insurance type drop down")
    public void click_on_Insurance_type_drop_down() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnInsuranceTypeDropdown();


        //Validate Insurance Type Radio Button
        String safeBtnText = "Safe";
        String freedomBtnText = "Freedom";
        String seniorBtnText = "Senior";

        Assert.assertEquals(safeBtnText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Dropdown-list-cont']//div[contains(text(),'Safe')]")).getText());
        Assert.assertEquals(freedomBtnText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Dropdown-list-cont']//div[contains(text(),'Freedom')]")).getText());
        Assert.assertEquals(seniorBtnText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Dropdown-list-cont']//div[contains(text(),'Senior')]")).getText());

    }

    @Then("Select required Insurance type")
    public void select_required_Insurance_type() throws InterruptedException {
        Thread.sleep(2000);
        lp.ClickOnRequiredInsuranceType();

        //Validate  selected Product name in the field
        String fieldText = "Safe";

        Assert.assertEquals(fieldText,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Dropdown Dropdown-close']//div[contains(text(),'Safe')]")).getText());


    }

    @Then("Click on Self")
    public void click_on_Self() throws InterruptedException {
        Thread.sleep(3000);
        //Validate the bot dialog
        String dialog = "Whom do you want the insurance for?";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),'Whom do you want the insurance for?')]"));
        Assert.assertEquals(dialog,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),'Whom do you want the insurance for?')]")).getText());

        lp.ClickOnSelfBtn();


        //Validate Payment Screen components
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//i[@class='fa fa-angle-right']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//i[@class='fa fa-angle-right']")).isEnabled());

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[normalize-space()='INR 0']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='INR 0']")).getText().contains("0"));






    }

    @Then("Click on scrolling icon")
    public void click_on_scrolling_icon() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnScrollIcon();

        //Validate the scroll section
        String name = "Medicare Plus";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[normalize-space()='Medicare Plus']"));
        Assert.assertEquals(name,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='Medicare Plus']")).getText());

    }

    @Then("Select required product and click on Add button")
    public void select_required_product_and_click_on_Add_button() throws InterruptedException {

        Thread.sleep(6000);
        lp.ClickOnAddBtn();

        //Validate plus and minus icons
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//i[@class='fa fa-minus']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//i[@class='fa fa-minus']")).isEnabled());

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//i[@class='fa fa-plus']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//i[@class='fa fa-plus']")).isEnabled());

        //Validate Total Count
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@class='Payment-total']//div[contains(normalize-space(),'INR ')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Payment-total']//div[contains(normalize-space(),'INR ')]")).getText().contains("1"));



    }

    @Then("Click on pay button")
    public void click_on_pay_button() throws InterruptedException {
        Thread.sleep(3000);

        //Validate Filled data
        String name = "Medicare Plus 1yr(INR 1 x 1) = INR 1";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'Medicare Plus 1yr(INR 1 x 1) = INR 1')]"));
        Assert.assertEquals(name,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'Medicare Plus 1yr(INR 1 x 1) = INR 1')]")).getText());

        String inr = "INR 1";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[normalize-space()='INR 1']"));
        Assert.assertEquals(inr,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='INR 1']")).getText());

        //Validate the bot dialog
        String dialog = "Please click on the button below to make a payment:";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@data-text='true'][normalize-space()='Please click on the button below to make a payment:']"));
        Assert.assertEquals(dialog,DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@data-text='true'][normalize-space()='Please click on the button below to make a payment:']")).getText());

        Thread.sleep(2000);

        //lp.ClickoOnPayBtn();

        Thread.sleep(3000);

        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(@class,'Input-Submit-button')][.='Pay']")).isEnabled());

//        //Validate the popup fields countdown timer popup along with Razorpay popup with Mantra logo Language Dropdown
//        String timerMsg = "Payment will close in";
//
//        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@id='ShowTimer'][contains(text(),'Payment will close in ')]"));
//        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@id='ShowTimer'][contains(text(),'Payment will close in ')]")).getText().contains(timerMsg));

//        String mantraLogoSrc = "https://media-exp1.licdn.com/dms/image/C4D0BAQFWFhXUVj9C6w/company-logo_200_200/0/1519899680629?e=2159024400&v=beta&t=YkFfu4ShB0l95bwKRVGB87BE11ImKdsZ1YFhu3gBAL8";
//
//        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@id='logo']"));
//        Assert.assertEquals(mantraLogoSrc,DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@id='logo']")).getAttribute("src"));

//        //Language Dropdown
//        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@class='selected svelte-1cac35y']"));
//        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='selected svelte-1cac35y']")).isEnabled());


//        //Validate total amount
//        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@class='original-amount']"));
//        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@class='original-amount']")).getText().contains("1"));
//


    }

    @Then("Click on Phone number filed")
    public void click_on_Phone_number_filed() throws InterruptedException {

        Thread.sleep(2000);

        lp.ClickOnPhoneField();

        //Validate Message
        String msg = "Please enter a valid contact number";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@class='help'][contains(text(),'Please enter a valid contact number')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='help'][contains(text(),'Please enter a valid contact number')]")).getText().contains(msg));

    }

    @Then("Enter valid phone number {string}")
    public void enter_valid_phone_number(String number) throws InterruptedException {
        Thread.sleep(3000);
        lp.EnterValidPhoneNo(number);
    }

    @Then("Click on Email field")
    public void click_on_Email_field() throws InterruptedException {
        Thread.sleep(2000);

        lp.ClickOnEmailField();

        //Validate Message
        String msg = "Please enter a valid email. Example: you@example.com";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@class='help'][contains(text(),'Please enter a valid email. Example: you@example.com')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='help'][contains(text(),'Please enter a valid email. Example: you@example.com')]")).getText().contains(msg));

    }

    @Then("Enter valid mail id {string}")
    public void enter_valid_mail_id(String email) throws InterruptedException {

        Thread.sleep(2000);
        lp.EnterValidEmail(email);
    }

    @Then("Click on Proceed button")
    public void click_on_Proceed_button() throws InterruptedException {

        Thread.sleep(2000);
        lp.ClickOnProceedBtn();

        //Validate

        String timerMsg = "Payment will close in";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@id='ShowTimer'][contains(text(),'Payment will close in ')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@id='ShowTimer'][contains(text(),'Payment will close in ')]")).getText().contains(timerMsg));

        String mantraLogo = "Mantra Labs";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@id='merchant-name'][contains(text(),'Mantra Labs')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@id='merchant-name'][contains(text(),'Mantra Labs')]")).getText().contains(mantraLogo));

        //Language Dropdown
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@class='selected svelte-1cac35y']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='selected svelte-1cac35y']")).isEnabled());


        //Validate total amount
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@class='original-amount']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@class='original-amount']")).getText().contains("1"));

        //Validate Entered mobile number and email
        String number = "7768076656";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@class='svelte-egvx8c'][contains(text(),'')][1]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@class='svelte-egvx8c'][contains(text(),'')][1]")).getText().contains(number));

        //Validate Entered mobile number and email
        String email = "test@asdf.asd";
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@class='svelte-egvx8c'][contains(text(),'')][2]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@class='svelte-egvx8c'][contains(text(),'')][2]")).getText().contains(email));


    }

    @Then("Click on Card")
    public void click_on_Card() throws InterruptedException {
        Thread.sleep(3000);
        //Validate All The Payment Option
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@slot='title'][normalize-space()='UPI - Google Pay']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@slot='title'][normalize-space()='UPI - Google Pay']")).isEnabled());

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@slot='title'][normalize-space()='UPI - PayTM']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@slot='title'][normalize-space()='UPI - PayTM']")).isEnabled());

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@slot='title'][normalize-space()='UPI - PhonePe']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@slot='title'][normalize-space()='UPI - PhonePe']")).isEnabled());

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@slot='title'][normalize-space()='Card']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@slot='title'][normalize-space()='Card']")).isEnabled());

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@slot='title'][normalize-space()='UPI / QR']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@slot='title'][normalize-space()='UPI / QR']")).isEnabled());

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@slot='title'][normalize-space()='Netbanking']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@slot='title'][normalize-space()='Netbanking']")).isEnabled());

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@slot='title'][normalize-space()='Wallet']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@slot='title'][normalize-space()='Wallet']")).isEnabled());

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@slot='title'][normalize-space()='Pay Later']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@slot='title'][normalize-space()='Pay Later']")).isEnabled());


        //Click On Close Btn

        lp.ClickOnCloseBtn();

    }


    @Then("Click on Renew policy button")
    public void click_on_Renew_policy_button() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnRenewPolicyBtn();
        Thread.sleep(3000);
    }


    @Then("Provide {string} in name field for Renew Policy")
    public void provide_in_name_field_for_Renew_Policy(String name) throws InterruptedException {

        Thread.sleep(2000);
        lp.EnterNameForRenew(name);
    }

    @Then("Provide {string} valid email id for Renew Policy")
    public void provide_valid_email_id_for_Renew_Policy(String email) throws InterruptedException {

        Thread.sleep(2000);
        lp.EnterEmailForRenew(email);
    }

    @Then("Provide {string} phone number for Renew Policy")
    public void provide_phone_number_for_Renew_Policy(String number) throws InterruptedException {
        Thread.sleep(2000);
        lp.EnterNumberForRenew(number);
    }



    @Then("Validate bot dialog with the existing policies and their details along with yes or no buttons")
    public void validate_bot_dialog_with_the_existing_policies_and_their_details_along_with_yes_or_no_buttons() throws InterruptedException {
       Thread.sleep(5000);

        //Validate Message
        String msg = "Thanks , For validating your mobile number.";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@class='Speech']//div[@id='rdw-wrapper-1098']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Speech']//div[@id='rdw-wrapper-1098']")).getText().contains(msg));

        String msgTwo = "Here we found 2009999999  is about to expire within 10 days. Would like to renew a policy now.";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(@class,'Speech')]//div[@id='rdw-wrapper-8041']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(@class,'Speech')]//div[@id='rdw-wrapper-8041']")).getText().contains(msgTwo));


    }


    @Then("Click on Yes button")
    public void click_on_Yes_button() throws InterruptedException {

        Thread.sleep(2000);
        lp.ClickOnYesBtnForRenew();

        //Validate INR is 0 by default
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[normalize-space()='INR 0']"));
        Assert.assertEquals("INR 0",DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='INR 0']")).getText());

    }

    @Then("Click on Yes button for upload file")
    public void click_on_Yes_button_for_upload_file() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnYesBtnForCheckClaim();


    }

    @Then("Click on scrolling icon For Renew")
    public void click_on_scrolling_icon_For_Renew() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Select required product and click on Add button For Renew")
    public void select_required_product_and_click_on_Add_button_For_Renew() throws InterruptedException {
        Thread.sleep(2000);
        lp.ClickOnAddBtn();

        //Validate INR is 1
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[normalize-space()='INR 1']"));
        Assert.assertEquals("INR 1",DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='INR 1']")).getText());

    }

    @Then("Click on Check claim status")
    public void click_on_Check_claim_status() throws InterruptedException {
        Thread.sleep(2000);

        lp.ClickOnCheckClaimStatus();

        //Validate Bot Dialog
        String msg = "I can definitely help you on that. Please enter your details below  ";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(text(),'I can definitely help you on that. Please enter your details below')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),'I can definitely help you on that. Please enter your details below')]")).getText().contains(msg));


    }

    @Then("Enter invalid claim id with characters {string}")
    public void enter_invalid_claim_id_with_characters(String abcd) throws InterruptedException {
        Thread.sleep(2000);
        lp.EnterInvalidClaimId(abcd);

        //Validate error message
        String msg = "Please enter only numbers";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@class='Error-msg'][contains(text(),'Please enter only numbers')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@class='Error-msg'][contains(text(),'Please enter only numbers')]")).getText().contains(msg));

    }

    @Then("Enter invalid claim id {string}")
    public void enter_invalid_claim_id(String number) throws InterruptedException {
        Thread.sleep(3000);
        lp.EnterInvalidClaimId(number);
        lp.ClickOnGetStatus();

        //Validate error message
        String msg = "Rejected";

//        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[contains(@data-offset-key,'3173h-0-1')]/parent::div[contains(@class,'public-DraftStyleDefault-block public-DraftStyleDefault-ltr')]"));
//        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(@data-offset-key,'3173h-0-1')]/parent::div[contains(@class,'public-DraftStyleDefault-block public-DraftStyleDefault-ltr')]")).getText().contains(msg));
//

    }

    @Then("Click on Upload Button")
    public void click_on_Upload_Button() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnUploadBtn();

        //Popup heading Validate
        String msg = "File size more than 3 MB can not be uploaded";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'File size more than 3 MB can not be uploaded')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'File size more than 3 MB can not be uploaded')]")).getText().contains(msg));


        //Validate Select File button
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[normalize-space()='Select File']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[normalize-space()='Select File']")).isEnabled());

    }

    @Then("Click on cancel")
    public void click_on_cancel() throws InterruptedException {
        Thread.sleep(2000);

        lp.ClickOnCancelBtn();
    }

    @Then("Click on upload button to upload the file")
    public void click_on_upload_button_to_upload_the_file() throws InterruptedException {
        Thread.sleep(2000);
        lp.ClickOnUploadOnPopup();

        //Validate error message
        String msg = "Please choose a pdf file less than 3 MB";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@id='message-id']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@id='message-id']")).getText().contains(msg));


    }

    @Then("Click on select file")
    public void click_on_select_file() throws InterruptedException, AWTException {

        Thread.sleep(2000);
        lp.ClickOnSelectFileBtn();


    }

    @Then("Select any Image file and click on upload")
    public void select_any_Image_file_and_click_on_upload() throws InterruptedException, AWTException {

        Thread.sleep(3000);
        //UPLOAD FILE
        Robot robo = new Robot();

        StringSelection str = new StringSelection("C:\\Users\\Pushkar.m\\Desktop\\C2CImage.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);

        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_V);

        robo.keyPress(KeyEvent.VK_ENTER);

        robo.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(3000);

        //Click On Upload
        lp.ClickOnUploadOnPopup();

        //Validate error message
        String msg = "Please choose a pdf file less than 3 MB";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@id='message-id']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@id='message-id']")).getText().contains(msg));

    }

    @Then("Click on Delete icon on the uploaded file")
    public void click_on_Delete_icon_on_the_uploaded_file() throws InterruptedException {

        Thread.sleep(3000);
        lp.ClickOnDeleteIcon();

        //Validate the popup
        String msg = "Are you sure you want to delete?";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[contains(text(),'Are you sure you want to delete?')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'Are you sure you want to delete?')]")).getText().contains(msg));


    }

    @Then("Click on Yes")
    public void click_on_Yes() {

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@class='MuiButton-label'][contains(normalize-space(),'Yes')]"));
        click_custom(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@class='MuiButton-label'][contains(normalize-space(),'Yes')]")),"Yes button In Popup");
        //Validate message
        String msg = "File deleted Successfully";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@id='message-id'][contains(text(),'File deleted Successfully')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@id='message-id'][contains(text(),'File deleted Successfully')]")).getText().contains(msg));


    }

    @Then("Select any document \\(Word or excel) file and click on upload")
    public void select_any_document_Word_or_excel_file_and_click_on_upload() throws InterruptedException, AWTException {
        Thread.sleep(3000);
        //UPLOAD FILE
        Robot robo = new Robot();

        StringSelection str = new StringSelection("C:\\Users\\Pushkar.m\\Desktop\\Bookswagon_credentials123.xlsx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);

        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_V);

        robo.keyPress(KeyEvent.VK_ENTER);

        robo.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(3000);

        //Click On Upload
        lp.ClickOnUploadOnPopup();

        //Validate error message
        String msg = "Please choose a pdf file less than 3 MB";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@id='message-id']"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@id='message-id']")).getText().contains(msg));

    }

    @Then("Click on any PDF document and click on upload button")
    public void click_on_any_PDF_document_and_click_on_upload_button() throws InterruptedException, AWTException {

        Thread.sleep(3000);
        //UPLOAD FILE
        Robot robo = new Robot();

        StringSelection str = new StringSelection("C:\\Users\\Pushkar.m\\Desktop\\sample.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);

        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_V);

        robo.keyPress(KeyEvent.VK_ENTER);

        robo.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(3000);

        //Click On Upload
        lp.ClickOnUploadOnPopup();

        //Validate error message
        String msg = "All the file(s) uploaded successfully";

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//span[@id='message-id'][contains(text(),'All the file(s) uploaded successfully')]"));
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[@id='message-id'][contains(text(),'All the file(s) uploaded successfully')]")).getText().contains(msg));

    }




}
