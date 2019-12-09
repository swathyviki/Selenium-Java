package week2.assignment.optional;

import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment;

public class Flipkartmi {
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

// Initiate the ChromeBroswer

ChromeDriver driver = new ChromeDriver();
// Maximize the browser
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
driver.findElementByXPath("/html/body/div[2]/div/div/button").click();
//Hover the cursor on Electronics

driver.findElementByXPath("//span[text()='Electronics']").click();
//click on Mi
WebElement Mi=driver.findElementByXPath("//a[text()='Mi']");
Actions builder=new Actions(driver);
builder.moveToElement(Mi);
Thread.sleep(2000);
builder.click(Mi).perform();
String title=driver.getTitle();
//Verify title contains Mi phone
System.out.println("Title is"+title);
if(title.contains("Mi Mobile"))
{
	System.out.println(title);
}
else
{
	System.out.println("Title doesnt contain Mi");
	
}
//Print all the phone names
//driver.findElementByXPath("//div[@class='col col-7-12']/div[1]").getText();

int count=0;
List<WebElement> page= driver.findElementsByXPath("//a[contains(@class,'_2Xp0TH')]");
for (WebElement webElement1 : page) {
	
	System.out.println(webElement1.getText());
	if(!(webElement1.isSelected()))
	{
	webElement1.click();
	}
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);Thread.sleep(2000);
	List <WebElement> phonename= driver.findElementsByXPath("//div[@class='col col-7-12']/div[1]");

	for (WebElement webElement2 : phonename) {
		count=count+1;
		System.out.println(webElement2.getText());	
		
	}
	
	System.out.println();
	
	System.out.println("No of redmi phones is"+count);
	}

	

Thread.sleep(1000);


	
driver.close();

}
}