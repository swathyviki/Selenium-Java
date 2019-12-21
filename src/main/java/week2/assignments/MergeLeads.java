package week2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MergeLeads {
	@Test
	public void mergeLeads() throws InterruptedException {

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
		//Click Merge Leads
		driver.findElementByLinkText("Merge Leads").click();
		//Click on icon near From Lead
		driver.findElementByXPath("//img[@src='/images/fieldlookup.gif']").click();
		//Move to new window
		Set<String> wdw1=driver.getWindowHandles();
		List<String> lstwindowHandles= new ArrayList<String>(wdw1);
		String secondwindow=lstwindowHandles.get(1);
		driver.switchTo().window(secondwindow);
		//Enter Lead Id
		driver.findElementByXPath("//input[@type='text']").sendKeys("10023");
		//Click Find Leads button
		Thread.sleep(2000);
		driver.findElementByXPath("//button[@class='x-btn-text']").click();
		//Click on the first resulting lead id
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		//Switch back to primary window
		driver.switchTo().window(lstwindowHandles.get(0));
		//Click on icon near Tto Lead
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		//Move to New window
		Set<String> wdw2=driver.getWindowHandles();
		List<String> lstwindowHandles1= new ArrayList<String>(wdw2);
		String secondwindow1=lstwindowHandles1.get(1);
		driver.switchTo().window(secondwindow1);
		//Enter Lead Id
		//Enter Lead Id
		driver.findElementByXPath("//input[@type='text']").sendKeys("10026");
		//Click Find Leads button
		Thread.sleep(2000);
		driver.findElementByXPath("//button[@class='x-btn-text']").click();
		//Click on the first resulting lead id
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		//Switch back to primary window
		driver.switchTo().window(lstwindowHandles.get(0));
		//Click Merge
		driver.findElementByLinkText("Merge").click();
		//accept alert
		driver.switchTo().alert().accept();
		//click the find leads link
		driver.findElementByLinkText("Find Leads").click();
		//Enter From Lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys("10023");
		//Click Find Leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Verify message no records to display
		String NoRecords=driver.findElementByClassName("x-paging-info").getText();
		System.out.println(NoRecords);
		Thread.sleep(2000);
		if(NoRecords.equals("No records to display"))
				{
			System.out.println("There are no records in the table");
				}
		else
		{
			System.out.println("Record still exists");
				}
		//Close the browser. Do not logout
		driver.close();
		
		
	}
}
