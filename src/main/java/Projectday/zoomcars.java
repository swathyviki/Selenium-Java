package Projectday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zoomcars {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	// Initiate the ChromeBroswer
	
	ChromeDriver driver = new ChromeDriver();

	//Launch the URL
	driver.get("https://www.zoomcar.com/chennai");
	// Maximize the browser
	driver.manage().window().maximize();
	//Click on the Start your wonderful journey link
	driver.findElementByClassName("search").click();
	//In the Search page, Click on any pick up point under POPULAR PICK-UP
	//	
	driver.findElementByXPath("//div[@class='items'][1]").click();
	//Click on the Next button
	driver.findElementByClassName("proceed").click();
	//Specify the Start Date as tomorrow Date
	driver.findElementByXPath("//div[@class='day'][1]/div").click();
	Thread.sleep(1000);

	//Click on the Next Button
	driver.findElementByClassName("proceed").click();
	//Confirm the Start Date and Click on the Done button
	driver.findElementByXPath("//div[@class='day'][1]/div").click();
	Thread.sleep(2000);
	//Click on Next button 
	driver.findElementByClassName("proceed").click();
	//driver.findElementByXPath("//div[@style='color: rgb(0, 0, 0);'][1]").click();
	Thread.sleep(3000);
	//In the result page, capture the number of results displayed
	List<WebElement> cardetails = driver.findElementsByXPath("//div[@class='component-car-item']");
	int carcount=cardetails.size();
	System.out.println("Count of cars is"+cardetails.size());
	//Find the highest priced car ride
	Map<String,Integer> carMap=new HashMap<String,Integer>();
for (int i=1;i<=carcount;i++) {
	

		String carname=driver.findElementByXPath("(//div[@class='details']/h3)["+i+"]").getText();
		String caramount=driver.findElementByXPath("(//div[@class='price'])["+i+"]").getText();
		caramount=caramount.replaceAll("\\D","");
		int carPrice = Integer.parseInt(caramount);
		System.out.println(carname+","+carPrice);
		
		carMap.put(carname,carPrice);
	}
	System.out.println(carMap);
	
	Set<Entry<String, Integer>> entrySet = carMap.entrySet();
	
	
	List<Integer> listPrice = new ArrayList<>();
	for (Entry<String, Integer> eachEntry : entrySet) {
		Integer value = eachEntry.getValue();
		listPrice.add(value);
		
	}
	System.out.println(listPrice);
	Collections.sort(listPrice);
	Collections.reverse(listPrice);
	
	System.out.println("Price in reverse order is"+listPrice);
	System.out.println("Highest Priced car is"+listPrice.get(0));
	
	//Click on the Book Now button for it.
	for (Entry<String, Integer> entry : entrySet) {
		if(entry.getValue()==listPrice.get(0)) {
			
			String carName=entry.getKey();
			for(int j=1;j<=carcount;j++)
			{
				String carcheck=driver.findElementByXPath("(//div[@class='details']/h3)["+j+"]").getText();
				if(carcheck.equals(carName))
				{
					System.out.println(carcheck+","+j);
				
				driver.findElementByXPath("(//button[@class='book-car'])["+j+"]").click();
				}
			}
		}
		}
	//Close the Browser.
	driver.close();
	}
}

		

