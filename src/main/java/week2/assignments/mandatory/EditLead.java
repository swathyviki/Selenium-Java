package week2.assignments.mandatory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
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
		//Enter first name
		driver.findElementByXPath("(//div[@class='x-form-element']/input[@name='firstName'])[3]").sendKeys("Swathy");
		//Click on find LEads button button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		//capture name of first resuting lead
		Thread.sleep(2000);
		String fName=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").getText();
		System.out.println("First Name in find leadspage is"+fName);
		
		//Click First Resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").click();
		//Click Edit
		driver.findElementByLinkText("Edit").click();
		//Change Company name
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("TCS");
		//click on Update
		driver.findElementByXPath("//input[@value='Update']").click();
		//check the company name is updated
		String UCompanyName = driver.findElementById("viewLead_companyName_sp").getText();
		if(UCompanyName.contains("TCS"))
		{
			System.out.println("Company name updated succesfully as TCS");
		}
		else
		{
			System.out.println("Company name not updated succesfully ");
		}	
		//Close the broser(Do not Log out)
		driver.close();
	}
	

}
