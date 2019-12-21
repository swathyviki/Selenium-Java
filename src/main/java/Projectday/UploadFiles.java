package Projectday;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {
    public static void main(String[] args) throws InterruptedException, AWTException {
        
    	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
         driver.get("https://smallpdf.com/jpg-to-pdf");
         driver.manage().window().maximize();
        //WebElement uploadElement = driver.findElementByXPath("https://smallpdf.com/jpg-to-pdf");
        
        driver.findElementByXPath("//div[@class='l0v3m7-6 hIetmX']").click();
        Thread.sleep(2000);
        String target="D:\\irctc dropdown.jpg";
        StringSelection selection = new StringSelection(target);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
        
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        }
}
