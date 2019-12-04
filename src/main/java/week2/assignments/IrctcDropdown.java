package week2.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcDropdown {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	// Initiate the ChromeBroswer
	
	ChromeDriver driver = new ChromeDriver();
	// Maximize the browser
	
	driver.get("https://www.irctc.co.in/");
	driver.manage().window().maximize();
	driver.findElementByXPath("//input[@placeholder='From*']").sendKeys("E");
	Thread.sleep(2000);
	driver.findElementByXPath("//div[@class='ui-autocomplete-panel "
			+ "ui-widget-content ui-corner-all ui-shadow']/ul/li[2]/span").click();
	
	}
}
