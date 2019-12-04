package week2.assignment.optional;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartmi {
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

// Initiate the ChromeBroswer

ChromeDriver driver = new ChromeDriver();
// Maximize the browser
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
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
WebElement noofresults = driver.findElementByTagName("a");
System.out.println(noofresults.getSize());
}
}