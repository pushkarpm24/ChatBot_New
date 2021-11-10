package page_objects.web_pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ActionEngine;
import utilities.DriverFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class landingPage extends ActionEngine {

    By botIcon = By.xpath("//div[contains(@class,'Chatbot-logo')]//img");
    By moreOption = By.id("Menu");
    By btnClose = By.xpath("//div[@class='close-menu']//*[local-name()='svg']");
    By dropdownLanguage = By.xpath("//div[@class='Lang']//div[contains(text(),'Eng')]");
    By btnKnowMorePolicies = By.xpath("//div[contains(text(),'Know More About Policies')]");
    By btnNoThanks = By.xpath("//div[contains(text(),'No Thanks!')]");
    By btnRateYourExp = By.xpath("//div[@class='Buttons ']//div[contains(text(),'Rate Your Experience')]");
    By btnEmoji = By.xpath("//img[@src='data:image/png;base64,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']");

    By btnSubmit = By.xpath("//div[@class='Input-Submit-button'][normalize-space()='Submit']");
    By btnHome = By.xpath("//span[@class='Menu-icon-name'][normalize-space()='Home']");
    By btnGetQuote = By.xpath("//div[contains(text(),'Get Quote')]");
    By dropdownProductName = By.xpath("");
    By sliderIcon = By.xpath("//span[@role='slider']");
    By dropdownTenure = By.xpath("//div[@class='Dropdown-name'][text()='Policy Period']");
    By ageField = By.xpath("//input[@placeholder='Enter The Age']");
    By noRadioBtn = By.xpath("//*[local-name()='svg']//*[name()='path'][contains(@d,'M14.063 10zM10 1.875A8.125 8.125 0 1 0 18.125 10 8.149 8.149 0 0 0 10 1.875zM10 16.5a6.5 6.5 0 1 1 6.5-6.5 6.519 6.519 0 0 1-6.5 6.5z')]");
    By btnConnectAgent = By.xpath("//div[contains(text(),'Connect With Agent')]");
    By btnChatAgent = By.xpath("//div[contains(text(),'Chat With Our Agent')]");
    By btnVideoAppoint = By.xpath("//div[contains(text(),'Video Appointment')]");
    By btnConnect  = By.xpath("//div[@class='Input-Submit-button']");
    By btnNoPopup = By.xpath("//span[normalize-space()='No']");
    By btnYesPopup = By.xpath("//span[normalize-space()='Yes']");
    By btnCloseVideo = By.xpath("//div[@class='close_btn']//img");
    By btnMainMenu = By.xpath("//div[contains(@class,'Buttons')]//div[contains(text(),'Main Menu')]");
    By btnBookAppoint = By.xpath("//div[contains(text(),'Book An Appointment')]");
    By nameTextField = By.xpath("//input[@placeholder='Enter your name']");
    By numberTextField = By.xpath("//input[@placeholder='Enter your Phone No.']");
    By emailTextField = By.xpath("//input[@placeholder='Enter your Email Id']");
    By nameTextFieldRenew = By.xpath("//input[@class='FormInput-container-input'][@placeholder='Enter Your Name']");
    By numberTextFieldRenew = By.xpath("//input[@class='FormInput-container-input'][@placeholder='Enter Mobile No']");
    By emailTextFieldRenew = By.xpath("//input[@class='FormInput-container-input'][@placeholder='Enter Your Email ID']");
    By calanderIcon = By.xpath("//i[@class='fa fa-calendar-day']");
    By btnBuyInsurance = By.xpath("//div[contains(text(),'Buy Insurance')]");
    By btnValidateMobileNo = By.xpath("//div[@class='Input-Submit-button']");
    By btnHealthInsurance = By.xpath("//div[@class='Buttons ']//div[contains(text(),'Health Insurance')]");
    By dropdownInsuranceType = By.xpath("//div[contains(@class,'Dropdown-name')][contains(.,'Health Insurance - Medicare')]");
    By btnSelf = By.xpath("//div[contains(text(),'Self')]");
    By iconScroll = By.xpath("//div[@class='Claim-right-arrow']//i[@class='fa fa-angle-right']");
    By btnPay = By.xpath("//div[contains(@class,'Input-Submit-button')][.='Pay']");
    By inputPhoneField = By.xpath("//label[contains(text(),'Phone')]");
    By inputEmailField = By.xpath("//input[@id='email']");
    By btnProceed = By.xpath("//span[@id='footer-cta']");
    By paymetCloseIcon = By.xpath("//div[@id='modal-close']");
    By btnRenewPolicy = By.xpath("//div[@class='Buttons ']//div[contains(text(),'Renew A Policy')]");
    By btnYesRenew = By.xpath("//div[contains(@class,'Buttons')]//div[contains(text(),'Yes')]");
    By btnYesCheckClaim = By.xpath("//div[@class='Button-effect']//div[contains(text(),'Yes')]");
    By btnCheckClaimStatus = By.xpath("//div[contains(@class,'Buttons')]//div[contains(text(),'Check Claim Status')]");
    By inputClaimId = By.xpath("//input[@placeholder='Enter Claim ID']");
    By btnGetStatus = By.xpath("//div[@class='Input-Submit-button'][contains(text(),'Get Status')]");
    By btnUpload  = By.xpath("//div[@style='display: flex;']");
    By btnCancel = By.xpath("//div[normalize-space()='CANCEL']");
    By btnUploadPopup = By.xpath("//div[normalize-space()='UPLOAD']");
    By btnSelectFile = By.xpath("//span[contains(normalize-space(),'Select File')]");





    //Action Methods


    public void ClickOnBotIcon() {

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),botIcon);
        click_custom(DriverFactory.getInstance().getDriver().findElement(botIcon),"BotIcon");
    }

    public void ClickOnMenuOption() {

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),moreOption);
        click_custom(DriverFactory.getInstance().getDriver().findElement(moreOption),"MenuOption");

    }

    public void ClickOnCloseButton() {
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),btnClose);
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnClose),"CloseButton In More Options Section");
    }

    public void ClickOnLanguageSelector() {
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),dropdownLanguage);
        click_custom(DriverFactory.getInstance().getDriver().findElement(dropdownLanguage),"Dropdown Language Generator");
    }

    public void ClickOnKnowMorePolicies() {
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),btnKnowMorePolicies);
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnKnowMorePolicies),"Know more about policies button");
    }

    public void ClickOnNoThanksBtn() {
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),btnNoThanks);
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnNoThanks),"No Thanks Button");
    }

    public void ClickOnRateYourExp() {
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),btnRateYourExp);
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnRateYourExp),"Rate Your Experience Button");
    }

    public void ClickOnEmoji() {
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),btnEmoji);
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnEmoji),"Happy Emoji");
    }

    public void ClickOnSubmitBtn() {
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),btnSubmit);
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnSubmit),"Submit Btn");
    }

    public void ClickOnHomeBtn() {
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),btnHome);
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnHome),"Home Button");
    }

    public void ClickOnGetQuote() {
        List<WebElement> getquoteBtn = DriverFactory.getInstance().getDriver().findElements(By.xpath("//div[contains(text(),'Get Quote')]"));
        System.out.println("Size of DD::"+getquoteBtn.size());
        //getquoteBtn.get(0).click();


        if (getquoteBtn.size() == 1) {
            waitForElementToBeVisible(DriverFactory.getInstance().getDriver(), btnGetQuote);
            click_custom(DriverFactory.getInstance().getDriver().findElement(btnGetQuote), "Get Quote Button");
        }
        else if (getquoteBtn.size() == 2) {
            getquoteBtn.get(1).click();
        }
        else if (getquoteBtn.size() == 3)
        {
            getquoteBtn.get(2).click();
        }
    }

    public void ClickOnProductNameDropdown() {
//        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),);
//        click_custom(DriverFactory.getInstance().getDriver().findElement(),"Product Name Dropdown");

        List<WebElement> dropDowns = DriverFactory.getInstance().getDriver().findElements(By.className("Dropdown-name"));
        System.out.println("Size of DD::"+dropDowns.size());
        dropDowns.get(0).click();

    }

    public void ClickProductNameRadioBtn() {
        List<WebElement> productList = DriverFactory.getInstance().getDriver().findElements(By.xpath("//div[@class='Dropdown-list-cont']//div[contains(@style,'display: flex; align-items: center; cursor: pointer;')]"));
        System.out.println("Size of product list ::"+productList.size());
        productList.get(0).click();
    }

    public void ClickOnProductTypeDropdown() {

        List<WebElement> dropDowns = DriverFactory.getInstance().getDriver().findElements(By.className("Dropdown-name"));
        System.out.println("Size of DD::"+dropDowns.size());
        dropDowns.get(1).click();

    }

    public void ClickProductTypeBtn() {

        List<WebElement> productList = DriverFactory.getInstance().getDriver().findElements(By.xpath("//div[@class='Dropdown-list-cont']//div[contains(@style,'display: flex; align-items: center; cursor: pointer;')]"));
        System.out.println("Size of product list ::"+productList.size());
        productList.get(0).click();
    }

    public void ClickOnSliderIcon() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(sliderIcon),"Slider Icon");

        DriverFactory.getInstance().getDriver().findElement(sliderIcon).sendKeys(Keys.ARROW_RIGHT);
    }

    public void ClickOnTenureDropDown() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(dropdownTenure),"Tenure DropDown");
    }

    public void ClickOnTenureYear() {
        List<WebElement> productList = DriverFactory.getInstance().getDriver().findElements(By.xpath("//div[@class='Dropdown-list-cont']//div[contains(@style,'display: flex; align-items: center; cursor: pointer;')]"));
        System.out.println("Size of product list ::"+productList.size());
        productList.get(1).click();
    }

    public void EnterThreeDigitAge(String age) {
        click_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"Eldest Member Age Field");
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"Eldest Member Age Field", age);
    }

    public void EnterCharacterAge(String aa) {

        //clear_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"");
        click_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"Eldest Member Age Field");
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"Eldest Member Age Field", aa);
    }

    public void EnterSplCharAge(String splchar) {
        //clear_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"");
        click_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"Eldest Member Age Field");
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"Eldest Member Age Field", splchar);
    }

    public void EnterZeroAge(String oo) {
        //clear_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"");
        click_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"Eldest Member Age Field");
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"Eldest Member Age Field", oo);
    }

    public void EnterAlphabetCharAge(String alphachar) {


        //click_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"Eldest Member Age Field");
        clear_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"");
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"Eldest Member Age Field", alphachar);
    }

    public void EnterAlphabetSplCharAge(String alpsplchar) {
        //clear_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"");
        click_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"Eldest Member Age Field");
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(ageField),"Eldest Member Age Field", alpsplchar);
    }

    public void ClickOnSliderIconMember() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(sliderIcon),"Slider Icon");

        DriverFactory.getInstance().getDriver().findElement(sliderIcon).sendKeys(Keys.ARROW_RIGHT);
    }

    public void ClickOnNoRadioBtn() {
        //click_custom(DriverFactory.getInstance().getDriver().findElement(noRadioBtn),"No Radio Btn");

        List<WebElement> radioBtn = DriverFactory.getInstance().getDriver().findElements(By.xpath("//div[@style='margin-right: 18px; display: flex; align-items: center; cursor: pointer;']"));
        System.out.println("Size of product list ::"+radioBtn.size());
        radioBtn.get(1).click();
    }

    public void ClickOnConnectAgentBtn() {
       // click_custom(DriverFactory.getInstance().getDriver().findElement(btnConnectAgent),"Connect With Agent Btn");

        List<WebElement> connectagntBtn = DriverFactory.getInstance().getDriver().findElements(By.xpath("//div[contains(text(),'Connect With Agent')]"));
        System.out.println("Size of DD::"+connectagntBtn.size());
        //getquoteBtn.get(0).click();


        if (connectagntBtn.size() == 1) {
            waitForElementToBeVisible(DriverFactory.getInstance().getDriver(), btnConnectAgent);
            click_custom(DriverFactory.getInstance().getDriver().findElement(btnConnectAgent), "Get Quote Button");
        }
        else if (connectagntBtn.size() == 2) {
            connectagntBtn.get(1).click();
        }
        else if (connectagntBtn.size() == 3)
        {
            connectagntBtn.get(2).click();
        }
    }

    public void ClickOnChatAgent() {

        click_custom(DriverFactory.getInstance().getDriver().findElement(btnChatAgent),"Chat With Agent Btn");
    }

    public void ClickOnVideoAppoint() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnVideoAppoint),"Video Appointment Btn");
    }

    public void ClickOnConnectBtn() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnConnect),"Video Connect Btn");
    }

    public void ClickoOnNoBtnPopup() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnNoPopup),"No option Of Popup");
    }

    public void ClickOnYesBtnPopup() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnYesPopup),"Yes Btn Of Popup");
    }

    public void ClickOnCloseBtnVideo() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnCloseVideo),"Close Btn Of Video Field");
    }

    public void ClickOnMainMenu() {
        //click_custom(DriverFactory.getInstance().getDriver().findElement(btnMainMenu),"Main Menu Btn");

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(), btnMainMenu);

        List<WebElement> mainMenu = DriverFactory.getInstance().getDriver().findElements(By.xpath("//div[contains(@class,'Buttons')]//div[contains(text(),'Main Menu')]"));
        System.out.println("Size of menu::"+mainMenu.size());
        //getquoteBtn.get(0).click();


        if (mainMenu.size() == 1) {
            waitForElementToBeVisible(DriverFactory.getInstance().getDriver(), btnMainMenu);
            click_custom(DriverFactory.getInstance().getDriver().findElement(btnMainMenu), "Get Quote Button");
        }
        else if (mainMenu.size() == 2) {
            mainMenu.get(1).click();
        }
        else if (mainMenu.size() == 3)
        {
            mainMenu.get(2).click();
        }

    }

    public void ClickOnBookAppointment() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnBookAppoint),"Main Menu Btn");
    }

    public void EnterName(String name) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(nameTextField),"Name In[ute Field",name);
    }


    public void EnterNumber(String number) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(numberTextField),"Name In[ute Field",number);
    }

    public void EnterEmail(String email) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(emailTextField),"Name In[ute Field",email);
    }

    public void ClickOnCalanderIcon() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(calanderIcon),"Calander Icon");
    }

    public void SelectTimeSlot() {
        int i = 0;

        DateFormat dateFormat = new SimpleDateFormat("HH");
        Date date = new Date();
        String date1= dateFormat.format(date);


        while (true)
        {
            List<WebElement> timeSlots = DriverFactory.getInstance().getDriver().findElements(By.xpath("//ul[@class='react-datepicker__time-list']//li[contains(text(),'')]"));
            System.out.println("Size of Slot::"+timeSlots.size());
            //System.out.println(timeSlots.get(i).getText());

            if (DriverFactory.getInstance().getDriver().findElement(By.xpath("//button[normalize-space()='Next Month']")).isEnabled())
            {
                timeSlots.get(i).click();
                System.out.println("i position:"+i);
//                break;
            }

            try {
                DriverFactory.getInstance().getDriver().findElement(By.xpath("//button[normalize-space()='Next Month']")).isEnabled();
            }catch (Exception e){
                break;
            }

            i++;

        }
    }

    public void ClickOnBuyInsurance() {

        click_custom(DriverFactory.getInstance().getDriver().findElement(btnBuyInsurance),"Buy Insurance Btn");
    }

    public void ClickOnValidateMobileNo() {

        click_custom(DriverFactory.getInstance().getDriver().findElement(btnValidateMobileNo),"Validate Mobile Number Btn Btn");
    }

    public void ClickOnHealthInsuranceBtn() {

        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),btnHealthInsurance);
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnHealthInsurance),"Health Insurance Btn");
    }

    public void ClickOnInsuranceTypeDropdown() {

        click_custom(DriverFactory.getInstance().getDriver().findElement(dropdownInsuranceType),"Insurance Type Dropdown");
    }

    public void ClickOnRequiredInsuranceType() {
        List<WebElement> productList = DriverFactory.getInstance().getDriver().findElements(By.xpath("//div[@class='Dropdown-list-cont']//div[contains(@style,'display: flex; align-items: center; cursor: pointer;')]"));
        System.out.println("Size of product list ::"+productList.size());
        productList.get(0).click();
    }

    public void ClickOnSelfBtn() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnSelf),"Self Btn");
    }


    public void ClickOnScrollIcon() {
        //click_custom(DriverFactory.getInstance().getDriver().findElement(iconScroll),"Scroll Icon");

        List<WebElement> rightArrowBtn = DriverFactory.getInstance().getDriver().findElements(iconScroll);
        System.out.println("Size of Arrow::"+rightArrowBtn.size());
        //getquoteBtn.get(0).click();


        if (rightArrowBtn.size() == 1) {
            waitForElementToBeVisible(DriverFactory.getInstance().getDriver(), iconScroll);
            click_custom(DriverFactory.getInstance().getDriver().findElement(iconScroll), "Get Quote Button");
        }
        else if (rightArrowBtn.size() == 2) {
            rightArrowBtn.get(1).click();
        }
        else if (rightArrowBtn.size() == 3)
        {
            rightArrowBtn.get(2).click();
        }
    }

    public void ClickOnAddBtn() {
        List<WebElement> addBtnList = DriverFactory.getInstance().getDriver().findElements(By.xpath("//div[@style='margin-left: auto;']//div[@class='Input-Submit-button']//div[contains(text(),'ADD')]"));
        System.out.println("Size of product list ::"+addBtnList.size());
        //addBtnList.get(1).click();

        if (addBtnList.size() == 1) {
            waitForElementToBeVisible(DriverFactory.getInstance().getDriver(), By.xpath("//div[@style='margin-left: auto;']//div[@class='Input-Submit-button']//div[contains(text(),'ADD')]"));
            click_custom(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[@style='margin-left: auto;']//div[@class='Input-Submit-button']//div[contains(text(),'ADD')]")), "Get Quote Button");
        }
        else if (addBtnList.size() == 2) {
            addBtnList.get(1).click();
        }
        else if (addBtnList.size() == 3)
        {
            addBtnList.get(2).click();
        }
    }

    public void ClickoOnPayBtn() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnPay),"Pay Btn");
    }

    public void ClickOnPhoneField() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(inputPhoneField),"Phone number field");
    }

    public void EnterValidPhoneNo(String number) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(inputPhoneField),"Phone number field",number);
    }

    public void ClickOnEmailField() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(inputEmailField),"email field");
    }

    public void EnterValidEmail(String email) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(inputEmailField),"Email field",email);
    }

    public void ClickOnProceedBtn() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnProceed),"Proceed Btn");
    }

    public void ClickOnCloseBtn() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(paymetCloseIcon),"Card Payment Close");

    }

    public void ClickOnRenewPolicyBtn() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnRenewPolicy),"Renew Policy Btn");
    }

    public void EnterNameForRenew(String name) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(nameTextFieldRenew),"Name In[ute Field",name);
    }


    public void EnterNumberForRenew(String number) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(numberTextFieldRenew),"Name In[ute Field",number);
    }

    public void EnterEmailForRenew(String email) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(emailTextFieldRenew),"Name In[ute Field",email);
    }

    public void ClickOnYesBtnForRenew() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnYesRenew),"Yes Button For Renew ");
    }

    public void ClickOnYesBtnForCheckClaim() {
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),btnYesCheckClaim);
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnYesCheckClaim),"Yes Button For Renew ");
    }

    public void ClickOnCheckClaimStatus() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnCheckClaimStatus),"Check Claim Status Btn");
    }

    public void EnterInvalidClaimId(String abcd) {
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),inputClaimId);
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(inputClaimId),"Claim Id Input Field", abcd);
    }

    public void ClickOnGetStatus() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnGetStatus), "Get Status Button");
    }

    public void ClickOnUploadBtn() {
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),btnUpload);
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnUpload),"Upload Btn");
    }

    public void ClickOnCancelBtn() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnCancel), "Cancel Btn In Popup");
    }

    public void ClickOnUploadOnPopup() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnUploadPopup),"ClickOn Upload In Popup");
    }

    public void ClickOnSelectFileBtn() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(btnSelectFile),"Select File Button");
    }

    public void ClickOnDeleteIcon() {
        waitForElementToBeVisible(DriverFactory.getInstance().getDriver(),By.xpath("//div[@style='cursor: pointer;']"));
        List<WebElement> deleteBtn = DriverFactory.getInstance().getDriver().findElements(By.xpath("//div[@style='cursor: pointer;']"));
        System.out.println("Size of delete btn list ::"+deleteBtn.size());
        deleteBtn.get(deleteBtn.size() - 1).click();
    }
}
