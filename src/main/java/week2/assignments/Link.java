package week2.assignments;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
	public static void main(String[] args) {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Initiate the ChromeBroswer
		
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		//driver.findElementByLinkText("Go to Home Page").click();
		//driver.findElementByLinkText("Find where am supposed to go without clicking me?").click();
				//driver.findElementByLinkText("Verify am I broken?").click();
		System.out.println(driver.findElementByLinkText("Go to Home Page").getAttribute("href"));
		
		System.out.println("Second link to home page");
		driver.findElementByXPath("/html/body/div/div/div[3]/section/div[4]/div/div/a").click();
		//driver.findElementByLinkText("How many links are available in this page?").click();
		
		//System.out.println("Last Link enabled?"+driver.findElementByLinkText("How many links are available in this page?").isEnabled());
		//System.out.println("Last Link enabled?"+driver.findElementByXPath("/html/body/div/div/div[3]/section/div[5]/div/div/a").isEnabled());
		
		
	}
}
