package day7.classroom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsFrame {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Initiate the ChromeBroswer

		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser

		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElementById("Click").click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		WebElement nestedFrame = driver.findElementByXPath("(//div[@id='wrapframe']/iframe)[2]");
		driver.switchTo().frame(nestedFrame);
		driver.switchTo().frame("frame2");
		driver.findElementById("Click1").click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		WebElement nestedFrame2 = driver.findElementByXPath("(//div[@id='wrapframe']/iframe)[3]");
		driver.switchTo().frame(nestedFrame2);
		WebDriver frame = driver.switchTo().frame("frame2");
		
		
		
		
		
}

}
