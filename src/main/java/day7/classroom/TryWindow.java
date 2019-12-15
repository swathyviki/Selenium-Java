package day7.classroom;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Initiate the ChromeBroswer
		
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
		
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[.='Open Multiple Windows']").click();
		// driver.switchTo().window("WindowHandle");
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println("count of opened windows/tab "+windowHandles.size());
		List<String> lstwindowHandles=new ArrayList<String>(windowHandles);
		//String lastwindow=lstwindowHandles.get(lstwindowHandles.size()-1);
		for (String string : lstwindowHandles) {
			WebDriver window = driver.switchTo().window(string);
			System.out.println(window.getTitle());
		}
		driver.quit();
		
	}

}
