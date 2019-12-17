package day7.classroom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Initiate the ChromeBroswer
		
		ChromeDriver driver = new ChromeDriver();
		
		//Launch URL
		driver.get("https://acme-test.uipath.com/account/login");
		// Maximize the browser
		driver.manage().window().maximize();
		//Enter UserName and press TAB
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		//Enter password
		driver.findElementById("password").sendKeys("leaf@12");
		//Click Login
		driver.findElementById("buttonLogin").click();
		//Mouse Over on Vendors
		Thread.sleep(2000);
		
		WebElement VendorButton = driver.findElementByXPath("//button[text()=' Vendors']");
		Actions mouseOver = new Actions(driver);
		mouseOver.moveToElement(VendorButton).click().perform();
		//Click Search Vendor
		driver.findElementByLinkText("Search for Vendor").click();
		//Enter Vendor Name (Blue Lagoon)
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		// Click Search
		Thread.sleep(2000);
		driver.findElementById("buttonSearch").click();
		//Find the Country Name based on the Vendor
		String VendorName=driver.findElementByXPath("//table[@class='table']/tbody/tr[2]/td[1]").getText();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target=new File("./snaps/snap1.png");
		FileUtils.copyFile(source, target);
		
	}
}
