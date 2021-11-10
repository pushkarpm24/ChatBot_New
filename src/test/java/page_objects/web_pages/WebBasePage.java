package page_objects.web_pages;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import utilities.ActionEngine;
import utilities.DriverFactory;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.List;

public class WebBasePage extends ActionEngine {

    public landingPage lp = new landingPage();

    public static String screenshotdir = System.getProperty("user.dir") + "/test-output/screenshots/";


//    //Created for generating random string for Unique email
//    public static String randomestring() {
//        String generatedString1 = RandomStringUtils.randomAlphabetic(5);
//        return (generatedString1);
//    }


    public String getBase64Screenshot() throws IOException {
        String Base64StringOfScreenshot = "";
        File src = ((TakesScreenshot) DriverFactory.getInstance().getDriver()).getScreenshotAs(OutputType.FILE);

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
        String sDate = sdf.format(date);
        FileUtils.copyFile(src, new File(screenshotdir + "image_" + sDate + ".png"));

        byte[] fileContent = FileUtils.readFileToByteArray(src);
        Base64StringOfScreenshot = "data:image/png;base64," + Base64.getEncoder().encodeToString(fileContent);
        return Base64StringOfScreenshot;
    }

    public byte[] getByteScreenShot() {
        File src = ((TakesScreenshot) DriverFactory.getInstance().getDriver()).getScreenshotAs(OutputType.FILE);
        byte[] fileContent = new byte[0];
        try {
            fileContent = FileUtils.readFileToByteArray(src);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }

    public void analyzeLog() {
        LogEntries logEntries = DriverFactory.getInstance().getDriver().manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            System.out.println("_______________________________________________________________________________________________________________________");
            System.out.println(new Date(entry.getTimestamp()) + " ==>" + entry.getLevel() + " ==>" + entry.getMessage()+ " ==>"+ entry.getTimestamp());
            System.out.println("________________________________________________________________________________________________________________________");
            //do something useful with the data
        }
    }



}


