package day7.classroom;

import org.openqa.selenium.chrome.ChromeDriver;

public class TryFrame {
	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

// Initiate the ChromeBroswer

ChromeDriver driver = new ChromeDriver();
// Maximize the browser

driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
driver.manage().window().maximize();
driver.switchTo().frame("iframeResult");
driver.findElementByXPath("//button[.='Try it']").click();
driver.switchTo().alert().sendKeys("Swathy");

driver.switchTo().alert().accept();
String text = driver.findElementByXPath("//button[.='Try it']/following::p").getText();
if(text.contains("Swathy"))
{
	System.out.println("Name Swathy found in text");
}
else
{
	System.out.println("Name not found in text");
}
driver.switchTo().defaultContent();
driver.close();
}

}