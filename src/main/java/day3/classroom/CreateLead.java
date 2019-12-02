package day3.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		
		//Enter First Name(Local)
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Swathy");
		//Enter Last Name(Local)
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("viki");
		//Enter Salutation
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mrs");
		//Choose Source
		Select dd1= new Select(driver.findElementById("createLeadForm_dataSourceId"));
		dd1.selectByValue("LEAD_DIRECTMAIL");
		
		//Enter Title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs");
		//Enter Annual Revenue
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("8000000");
		//Choose Industry
		Select dd2= new Select(driver.findElementById("createLeadForm_industryEnumId"));
		dd2.selectByValue("IND_SOFTWARE");
		//Choose Ownership
		Select dd3= new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		dd3.selectByValue("OWN_CCORP");
		//Enter SIC Code
		
		driver.findElementById("createLeadForm_sicCode").sendKeys("8456");
		//Enter Description
		driver.findElementById("createLeadForm_description").sendKeys("Test Leaf is  a private software cmpany");
		//Enter Important Note
		driver.findElementById("createLeadForm_importantNote").sendKeys("Important:Test Leaf is  a private software cmpany");
		//Enter Country Code
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91");
		//Enter Area Code
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
		//Enter Extension
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("044");
		//EnterDepartment
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("https://testleaf.com/");
		//Choose Preferred Currency
		Select dd4= new Select(driver.findElementById("createLeadForm_currencyUomId"));
		dd4.selectByValue("INR");
		//Enter Number Of Employees
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("75");
		//Enter Ticker Symbol
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("NYSE:A");
		//Enter Person to Ask For
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Babu:890009099");
		
		//Enter To Name
		driver.findElementById("createLeadForm_generalToName").sendKeys("Babu");
		//Enter Address Line 1 and 2
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("House no 101,Bharathidasan Nagar");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Peerkankaranai");
		//Enter City
		driver.findElementById("createLeadForm_generalCity").sendKeys("Conway");
		//Choose State/Province
		Select dd5= new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
		dd5.selectByValue("AR");
		
		//Choose Country
		
		
		
		//Enter Zip/Postal Code
		Select dd6= new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
		dd6.selectByValue("ASM");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("71630");
		//Enter Zip/Postal Code Extension
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("72034-0002");
		
		//Choose Marketing Campaign
		Select dd7= new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		dd7.selectByValue("CATRQ_ROADNTRACK");
		
		//Enter phone number
		
		//Enter email address
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
