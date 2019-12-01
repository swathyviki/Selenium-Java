package week2.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
	public static void main(String[] args) {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Initiate the ChromeBroswer
		
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		//dropdown by index
		System.out.println("selecting dropdown by using index");
		Select dd= new Select(driver.findElementById("dropdown1"));
		List<WebElement> options=dd.getOptions();
		int option = options.size();
		dd.selectByIndex(option-1);
		//dropdown by text
		Select dd2= new Select(driver.findElementByName("dropdown2"));
		dd2.selectByVisibleText("UFT/QTP");
		//dropdown by value
		Select dd3= new Select(driver.findElementById("dropdown3"));
		dd3.selectByValue("2");
		//dropdown getting number of options
		Select dd4= new Select(driver.findElementByClassName("dropdown"));
		List<WebElement> optionsValue=dd4.getOptions();
		System.out.println("number of options is"+optionsValue.size());
		dd4.selectByValue("1");
		
		//dropdown by sendkeys
		driver.findElementByXPath("/html/body/div/div/div[3]/section/div[5]/select").sendKeys("Appium");

		
		//multiple select in dropdown
		
		Select dd5= new Select(driver.findElementByXPath("/html/body/div/div/div[3]/section/div[6]/select"));
		List<WebElement> optionsmulti=dd5.getOptions();
		int options1= optionsmulti.size();
		for(int i=0;i<=options1-1;i++)
		{
			dd5.selectByIndex(i);
		}
		}

	}


