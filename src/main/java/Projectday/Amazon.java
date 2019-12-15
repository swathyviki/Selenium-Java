package Projectday;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Initiate the ChromeBroswer
		
		ChromeDriver driver = new ChromeDriver();
		
		//Launch URL
		driver.get("https://www.amazon.in/");
		// Maximize the browser
		driver.manage().window().maximize();
		//Type in searchbox and press Enter
		driver.findElementById("twotabsearchtextbox").sendKeys("oneplus 7 pro mobiles");
				driver.findElementByXPath("//input[@value='Go']").click();
		//Print the price of the first resulting mobile
		String first1PPrice=driver.findElementByXPath("(//span[@aria-hidden='true'])[8]").getText();
		System.out.println("First mobile price is"+first1PPrice);
		//Click on the Mobile (First resulting) image
		driver.findElementByXPath("//div[@class='a-section aok-relative s-image-fixed-height'][1]/img").click();
		Thread.sleep(2000);
		//Switch to the new window
		Set<String> wdw1=driver.getWindowHandles();
		List<String> lstwindowHandles= new ArrayList<String>(wdw1);
		String secondwindow=lstwindowHandles.get(1);
		driver.switchTo().window(secondwindow);
		//Print the number of customer ratings

		String customerRating=driver.findElementByXPath("//span[@id='acrCustomerReviewText']").getText();
		System.out.println("Customer Rating is"+customerRating);
		//Click 'Add to Cart'
		WebElement AddtoCart = driver.findElementById("submit.add-to-cart-announce");
		Actions mouseOver = new Actions(driver);
		mouseOver.moveToElement(AddtoCart).click().perform();
		// Confirm "Added to Cart" text message appeared
		String addtocart=driver.findElementById("huc-v2-order-row-confirm-text").getText();
		System.out.println(addtocart);
		if(addtocart.equals("Added to Cart"))
		{
			System.out.println("Added to cart appeared ");
		}
		else
		{
			System.out.println("Added to cart dint appear");
		}
		//Click to Proceed to Buy
		driver.findElementByXPath("(//span[@class='a-button-inner'])[2]").click();
		//Confirm the title is "Amazon Sign In"
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Amazon Sign In"))
		{
			System.out.println("Reached sign in page");
		}
		else
		{
			System.out.println("Not reached sign in page");
		}
		//Click Continue (without entering mobile number / email)
		driver.findElementById("continue").click();
		//Verify the error message
		String error=driver.findElementByClassName("a-alert-content").getText();
		System.out.println(error);
		//close both the browsers
		driver.quit();
		
	}

}
