package week2.assignment.optional;

import org.openqa.selenium.WebElement;
import java.util.List;
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
List <WebElement> phonename= driver.findElementsByXPath("//div[@class='col col-7-12']/div[1]");

for (WebElement webElement : phonename) {
	System.out.println(webElement.getText());	
}
	



}
}