package day4.classroom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		
		  ChromeDriver driver = new ChromeDriver();
		    //Loading a url
		    driver.get("https://erail.in/");
		    driver.manage().window().maximize();
		    WebElement elesource = driver.findElementById("txtStationFrom");
		    elesource.clear();
		    elesource.sendKeys("MAS",Keys.TAB);
		    WebElement eledestiny = driver.findElementById("txtStationTo");
		    eledestiny.clear();
		    eledestiny.sendKeys("SBC",Keys.TAB);
		    Thread.sleep(3000);
		    driver.findElementById("chkSelectDateOnly").click();
		    WebElement eletable = driver
		    		.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		    List<WebElement> row = eletable.findElements(By.tagName("tr"));
		    //to print train names
		    /*
		    for (int i = 0; i < row.size(); i++) {
		    	List<WebElement> coldata = row.get(i).findElements(By.tagName("td"));
		    	System.out.println(coldata.get(1).getText());
		    	
				
			}*/
		    //to get all values for 1 column
		    List<WebElement> eleCols = row.get(1).findElements(By.tagName("td"));
		    for (int i = 0; i < eleCols.size(); i++) {
				System.out.println(eleCols.get(i).getText());
		     
		    
	}

}
}



