package week2.assignments.mandatory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdOverXpath {
	public static void main(String[] args) throws InterruptedException {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Initiate the ChromeBroswer
		
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		// Enter the UserName
		//WebElement username = driver.findElementById("username");
		//username.sendKeys("DemoSalesManager");
		driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[1]/input").sendKeys("DemoSalesManager");
}
}
