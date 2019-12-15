package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zoomcar {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	// Initiate the ChromeBroswer
	
	ChromeDriver driver = new ChromeDriver
			();
	// Maximize the browser
	
	driver.get("https://www.zoomcar.com/chennai/search");
	driver.manage().window().maximize();
	driver.findElementByXPath("//div[@class='items'][1]").click();
	driver.findElementByClassName("proceed").click();
	driver.findElementByXPath("//div[@class='day low-price']/div").click();
	Thread.sleep(1000);
	WebElement slider = driver.findElementByXPath("//div[@class='vue-slider']");
	Actions slidermove=new Actions(driver);
	slidermove.clickAndHold(slider);
	slidermove.dragAndDropBy(slider,40,0).build().perform();
	driver.findElementByClassName("proceed").click();
	driver.findElementByXPath("//div[@class='day'][1]/div").click();
	Thread.sleep(2000);
	WebElement slider1 = driver.findElementByXPath("//div[@class='vue-slider']");
	Actions slidermove1=new Actions(driver);
	slidermove1.clickAndHold(slider1);
	slidermove1.dragAndDropBy(slider1,0,40).build().perform();
	driver.findElementByClassName("proceed").click();
	//driver.findElementByXPath("//div[@style='color: rgb(0, 0, 0);'][1]").click();
	Thread.sleep(3000);
	List<WebElement> cardetails = driver.findElementsByXPath("//div[@class='component-car-item']");
	int carcount=cardetails.size();
	System.out.println("Count of cars is"+cardetails.size());
	Map<String,String> carMap=new HashMap<String,String>();
for (int i=1;i<=carcount;i++) {
	

		String carname=driver.findElementByXPath("(//div[@class='details']/h3)["+i+"]").getText();
		String caramount=driver.findElementByXPath("(//div[@class='price'])["+i+"]").getText();
		caramount=caramount.replaceAll(" ","");
		System.out.println(carname+","+caramount);
		
		carMap.put(carname,caramount);
	}
	System.out.println(carMap);
	
	
	

}
}