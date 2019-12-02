package day4.classroom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	public static void main(String[] args) {
		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Initiate the ChromeBroswer
		
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		WebElement item1 = driver.findElementByXPath("/html/body/div/div/div[2]/div[2]/ol/li[1]");
		WebElement item3 = driver.findElementByXPath("/html/body/div/div/div[2]/div[2]/ol/li[3]");
		WebElement item5= driver.findElementByXPath("/html/body/div/div/div[2]/div[2]/ol/li[5]");
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item1).keyUp(Keys.CONTROL).perform();
		
	}

}
