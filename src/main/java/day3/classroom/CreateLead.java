package day3.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {

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
		// Click on Create Lead button
		driver.findElementByLinkText("Create Lead").click();
		// Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("Test Leaf");
		
		// Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Swathy");
		String CName="Swathy";
		// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("viki");
		// Click on Create Lead (Submit) button
		driver.findElementByClassName("smallSubmit").click();

		// Verify the Lead is created by checking the Company or First Name
		String ViewLeadCNAme=driver.findElementById("viewLead_firstName_sp").getText();
		if (CName.equals(ViewLeadCNAme))
		{
			System.out.println("Lead is created");
			
		}

	}

}
