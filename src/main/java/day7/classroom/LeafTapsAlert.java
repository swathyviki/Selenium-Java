package day7.classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafTapsAlert {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver =  new ChromeDriver();
		
		// Maximize the browser
		
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);	
		driver.findElementByLinkText("Alert Box").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Confirm Box").click();
		driver.switchTo().alert().dismiss();
		driver.findElementByLinkText("Prompt Box").click();
		driver.switchTo().alert().sendKeys("TestLeaf");
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Line Breaks?").click();
		driver.switchTo().alert().accept();
		driver.findElementById("btn").click();
		driver.findElementByLinkText("OK").click();
		
		
		
		
}

}
