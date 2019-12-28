package day8.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test(groups="optional",dependsOnGroups="compulsary")
public class test002 extends ProjectSpecificMethods{
	public void mergeLeads() throws InterruptedException {
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
		driver.findElementByXPath("//input[@type='text']").sendKeys("10058");
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
		driver.findElementByXPath("//input[@type='text']").sendKeys("10062");
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
		driver.findElementByXPath("//input[@name='id']").sendKeys("10058");
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

}
@Test(groups="optional",dependsOnGroups="compulsary")
public void DeleteLead() throws InterruptedException {
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
}

}
