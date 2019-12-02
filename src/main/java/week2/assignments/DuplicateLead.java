package week2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Initiate the ChromeBroswer
		
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Enter the UserName
		WebElement username = driver.findElementById("username");
		username.sendKeys("DemoSalesManager");
		// Enter the Password
		WebElement password = driver.findElementById("password");
		password.sendKeys("crmsfa");
		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();
		// Click on Leads
		driver.findElementByLinkText("Leads").click();
		//Click Find leads
		driver.findElementByLinkText("Find Leads").click();
		//Click on Email
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByName("emailAddress").sendKeys("vigneshkandiah@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//capture name of first resuting lead
		Thread.sleep(2000);
		System.out.println(driver.findElementByXPath(("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).getText());
		String fname= driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").getText();
		//Click First Resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").click();
		//Click Duplicate Lead
		driver.findElementByLinkText("Duplicate Lead").click();
		//verify title as duplicate lead

		String title = driver.findElementByXPath("//div[@class='x-panel-header sectionHeaderTitle']").getText();
		System.out.println("verifying duplcate lead title is present"+title);
		//Click Create Lead
		driver.findElementByClassName("smallSubmit").click();
		//Verify captured name and duplicate are same
		String duplicatName=driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println("Duplicate name is"+duplicatName);
		if(fname.equals(duplicatName))
		{
			System.out.println("duplicate lead name is same as captured lead");
		}
			else
			{
				System.out.println("duplicate lead name is not same as captured lead");
			}
				
		}
		 
	   
	    
	}	
		

