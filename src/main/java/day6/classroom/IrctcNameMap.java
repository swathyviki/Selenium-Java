package day6.classroom;

	import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class IrctcNameMap {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			
			  ChromeDriver driver = new ChromeDriver();
			    //Loading a url
			    driver.get("https://erail.in/");
			    driver.manage().window().maximize();
			    WebElement elesource = driver.findElementById("txtStationFrom");
			    elesource.clear();
			    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			    elesource.sendKeys("MAS",Keys.TAB);
			    WebElement eledestiny = driver.findElementById("txtStationTo");
			    eledestiny.clear();
			    eledestiny.sendKeys("BNC",Keys.TAB);
			    Thread.sleep(3000);
			    driver.findElementById("chkSelectDateOnly").click();
			    WebElement noTrains = driver.findElementByXPath("//div[@id='divMain']/div[1]");
			    
			    Map<String,String> TrainMap=new LinkedHashMap<>();
			    List<WebElement> trainno = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[1]");
			    int size=trainno.size();
			    
		for(int i=1;i<=size;i++)
		{
			String TrainNo=driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+i+"]/td/a").getText();
			String TrainName=driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+i+"]/td[2]/a").getText();
					TrainMap.put(TrainNo, TrainName);
			
		}
	
		System.out.println(TrainMap);
					
				
	}
	}







