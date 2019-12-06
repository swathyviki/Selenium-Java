package week2.assignment.optional;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class RedBus {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Initiate the ChromeBroswer
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		// Maximize the browser
	  driver.get("https://www.redbus.in/");
	 
	driver.manage().window().maximize();
	
	  
	    //Loading a url Redbus
	  
	    
	    Thread.sleep(2000);
	    
	    //Enter From station as Chennai
	   
	   WebElement source= driver.findElementByXPath("//input[@data-message='Please enter a source city']");
	   source.sendKeys("Chennai");
	   Thread.sleep(2000);
	   source.sendKeys(Keys.TAB);
	    //Enter To (Trichy) and Tab
	    
	    
	    
	    WebElement destination= driver.findElementByXPath("//input[@data-message='Please enter a destination city']");
	    		destination.sendKeys("Trichy");
	    		Thread.sleep(2000);
	    destination.sendKeys(Keys.TAB);
	    //Entering onward date
	  //select month
	    
	    
	    //select date
	    Thread.sleep(2000);
	    driver.findElementByXPath("//div[@id='rb-calendar_onward_cal']//td[@class='current day']").click();
	    //driver.findElementByXPath("//input[@id='onward_cal']").sendKeys(Keys.TAB);
	   
		Thread.sleep(2000);
		
		//driver.findElementByClassName("Return Date").click();
		driver.findElementByXPath("//span[@class='fl icon-calendar_icon-new icon-return-calendar icon']").click();
		driver.findElementByXPath("//div[@id='rb-calendar_return_cal']//td[@class='wd day']").click();
		
	    
	    
	   
	    Thread.sleep(3000);
	    String text = driver.findElementByXPath("//section[@id='search']//button[@id='search_btn']").getText();
	    System.out.println(text);
	    WebElement searchBuses = driver.findElementByXPath("//section[@id='search']//button[@id='search_btn']");
	    Actions builder=new Actions(driver);
		builder.moveToElement(searchBuses);
		Thread.sleep(2000);
		builder.click(searchBuses).perform();
	 
	    
	    System.out.println("reached search button");
	   
	    Thread.sleep(3000);
	   // Click After 6 PM checkbox 
	    WebElement checkbx = driver.findElementByXPath("//input[@id='dtAfter 6 pm'][1]/following::label");
	    Thread.sleep(1000);
	    checkbx.click();
	   // 9) Click Bus Type (AC) Checkbox 
	    WebElement checkAC = driver.findElementByXPath("//label[@for='bt_AC'][1]");
	    Thread.sleep(2000);
	    checkAC.click();
	   // 10) Print number of buses found
	    WebElement Busescount = driver.findElementByXPath("//span[@class='f-bold busFound']");
	    System.out.println(Busescount.getText()+"Found");
	    driver.close();
	}
}

