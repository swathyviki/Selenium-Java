package day8.classroom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;

	public String excelFileName;
	@BeforeMethod(alwaysRun=true)
	@Parameters({"url","username","password"})
	public void Login(String url,String uname,String pwd) {
		// Set the property for ChromeDriver
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

				// Initiate the ChromeBroswer
				
				driver = new ChromeDriver();
				// Maximize the browser
				driver.manage().window().maximize();
				driver.get(url);
				// Enter the UserName
				WebElement username = driver.findElementById("username");
				username.sendKeys(uname);
				// Enter the Password
				WebElement password = driver.findElementById("password");
				password.sendKeys(pwd);
}
	
	@DataProvider
	public String[][] getData() throws IOException
	{
		/*String[][] data=new String[2][3];
		data[0][0]="TCS";
		data[0][1]="Swathy";
		data[0][2]="viki";
		data[1][0]="Wipro";
		data[1][1]="Preethi";
		data[1][2]="Sylvia";*/
		LearnExcel data=new LearnExcel();
		return data.readExcel(excelFileName);
	
	}
	
	@AfterMethod
	public void logout() {
		driver.quit();
	}
	
	}
