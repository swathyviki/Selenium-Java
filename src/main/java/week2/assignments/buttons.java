package week2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttons {

	public static void main(String[] args) {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Initiate the ChromeBroswer
		
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		//go to home page button
		//driver.findElementById("home").click();
		System.out.println("getting title "+driver.getTitle());
		System.out.println("getting broswer URL "+driver.getCurrentUrl());
		System.out.println("getting location of position button "+driver.findElementById("position").getLocation());
		System.out.println("Getting CSS value "+driver.findElementById("color").getCssValue("background-color"));
		System.out.println("Getting text "+driver.findElementById("color").getText());
		System.out.println("getting size "+driver.findElementById("size").getSize());
		
}
}
