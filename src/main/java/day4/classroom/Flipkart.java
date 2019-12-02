package day4.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Initiate the ChromeBroswer
		
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("/html/body/div[2]/div/div/button").click();
		driver.findElementByXPath("//span[text()='Electronics']").click();
		WebElement apple=driver.findElementByXPath("//a[text()='Apple']");
		Actions builder=new Actions(driver);
		builder.moveToElement(apple);
		Thread.sleep(2000);
		builder.click(apple).perform();
	}

}
