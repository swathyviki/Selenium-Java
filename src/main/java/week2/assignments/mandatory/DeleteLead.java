package week2.assignments.mandatory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead {
	@Test
	public void DeleteLead() throws InterruptedException {

	// Set the property for ChromeDriver
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

			// Initiate the ChromeBroswer
			
			ChromeDriver driver = new ChromeDriver();
			// Maximize the browser
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
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
			//Click on Phone
			driver.findElementByXPath("//span[text()='Phone']").click();
			//Enter phone number
			driver.findElementByXPath("//input[@name='phoneCountryCode']").clear();
			driver.findElementByXPath("//input[@name='phoneCountryCode']").sendKeys("+91");
			driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("044");
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("326121");
			
			//Click on find leads button
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(2000);
			
			String leadFName =driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").getText();
			System.out.println("leadID is"+leadFName);
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").click();
			
			String leadID= driver.findElementById("viewLead_companyName_sp").getText();
			String[] leadarray=leadID.split(" ");
			
			
				System.out.println("Lead name with id in ()is "+leadarray[1]);
			
			leadID = leadarray[1].replaceAll("\\p{P}","");
			
			System.out.println("Lead id after removing () is"+leadID);
			
			
			//Click delete
			driver.findElementByLinkText("Delete").click();
			Thread.sleep(2000);
			//Click on Find Leads
			driver.findElementByLinkText("Find Leads").click();
			//Enter the captured lead id
			driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
			//Click on Find Leads button
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			//Verify message no records to display in the lead list.This message confirms successful deletion
			String NoRecords=driver.findElementByClassName("x-paging-info").getText();
			System.out.println(NoRecords);
			if(NoRecords.equals("No records to display"))
					{
				System.out.println("There are no records in the table");
					}
			else
			{
				System.out.println("Record still exists");
					}
			 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			driver.close();
}
}
				

