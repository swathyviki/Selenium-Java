package day8.classroom;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class test001 extends ProjectSpecificMethods{
		
	
	
	@Test(groups="compulsary")
	public void duplicateLead() throws InterruptedException {
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
			 
	
	@BeforeClass(alwaysRun=true)
	public void doFileName()
	{
		excelFileName="createLead";
	}
@Test(dataProvider="getData",groups="compulsary")

	public void createLead(String cname,String fname, String lname) {
	// Click on Login Button
		
	
	driver.findElementByClassName("decorativeSubmit").click();
	System.out.println(driver.findElementByClassName("decorativeSubmit").getAttribute("value"));
	// Click on crm/sfa button
	driver.findElementByLinkText("CRM/SFA").click();
	// Click on Leads
	driver.findElementByLinkText("Leads").click();
	// Click on Create Lead button
	driver.findElementByLinkText("Create Lead").click();
	// Enter Company Name
	driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	
	// Enter First Name
	driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	String CName="Swathy";
	// Enter Last Name
	driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	
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
@Test(groups="compulsary")
public void editLead() throws InterruptedException
{
	
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
}

}

