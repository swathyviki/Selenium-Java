package week2.assignments.mandatory;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	public static void main(String[] args) {
	
	// Set the property for ChromeDriver
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

			// Initiate the ChromeBroswer
			
			ChromeDriver driver = new ChromeDriver();
			// Maximize the browser
			
			driver.get("http://leafground.com/pages/checkbox.html");
			driver.manage().window().maximize();
			driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]//input[1]").click();
			System.out.println(driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]"
					+ "//input[1]").isSelected());
			
}		

}
