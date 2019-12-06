package week2.assignments.mandatory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IrctcSelectDropDown  {

		static int i=0;

		public static void main(String[] args) throws InterruptedException {

			// Launch browser
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			ChromeDriver driver=new ChromeDriver(options);
		
			// load url
			driver.get("https://www.irctc.co.in");
			driver.manage().window().maximize();
			driver.findElementById("loginText").click();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByXPath("//div[@class='multibutton']/a").click();

			// implicitwait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByXPath("//input[@formcontrolname='termCondition']").click();
			driver.findElementByXPath("//(input[@id='sbi'])[1]").click();
			// Identify the element and store
			/*WebElement element=driver.findElementByXPath("//select[@formcontrolname='nationality']");
			
			Thread.sleep(2000);
			// create an object using Select class for an webelement 
			Select dropdown=new Select(element);

			// get collection of webelement and store it in list
			List<WebElement> optionsd=dropdown.getOptions();

			//iterations through each webElement based on condection
			for (WebElement eachoption : optionsd) {
				if (eachoption.getText().startsWith("E")) {
					i++;
					if (i==2) {
						System.out.println(eachoption.getText());
						eachoption.click();
						break;
					}
				}
			}
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
		
			/*Actions builder = new Actions(driver);
			builder.click(checkbox).perform();
			
			
			if(checkbox.isSelected())
			{
				builder.click(checkbox).perform();
				System.out.println("Checkbox is not enabled");
			}*/
			//close browser
			//driver.close();
		}

	}
