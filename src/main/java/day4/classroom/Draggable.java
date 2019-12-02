package day4.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {
public static void main(String[] args) {
	// Set the property for ChromeDriver
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	// Initiate the ChromeBroswer
	
	ChromeDriver driver = new ChromeDriver();
	// Maximize the browser
	driver.get("http://leafground.com/pages/drag.html");
	driver.manage().window().maximize();
	WebElement drag = driver.findElementById("draggable");
	Actions builder=new Actions(driver);
	builder.dragAndDropBy(drag, 100, 50).perform();
	
}
}
