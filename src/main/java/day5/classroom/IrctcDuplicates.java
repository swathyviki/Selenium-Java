package day5.classroom;

	import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class IrctcDuplicates {
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
			    
			    List<WebElement> trainname = driver
			    		.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
			   
			    System.out.println("size oflist is"+trainname.size());
			    Set<String> uniqueTrainName=new HashSet<>();
			    for(int i=0;i<trainname.size();i++)
			    {
			    	String trainlist=trainname.get(i).getText();
			    	uniqueTrainName.add(trainlist);
			    	
			    }
			    System.out.println("size of set is"+uniqueTrainName.size());
			    
			
			   
			   
			    if (trainname.size()!=uniqueTrainName.size())
			    {
			    	System.out.println("train name  contain dupliactes");
			    }
			    
			    
		 List<WebElement> trainno = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[1]");
		 System.out.println("size oflist is"+trainno.size());
		 Set<String> uniquTrainNo=new HashSet<>();
		 for(int i=0;i<trainno.size();i++)
		    {
		    	String strainlist=trainno.get(i).getText();
		    	uniquTrainNo.add(strainlist);
		    	
		    }
		 System.out.println("size of set is"+uniquTrainNo.size());
		   
		if (trainno.size()!=uniquTrainNo.size())
	    {
	    	System.out.println("train number  contain dupliactes");
	    }
		else{
	    	System.out.println("train number doesnt  contain dupliactes");
	    }
			    
		driver.close();	
	}
	}







