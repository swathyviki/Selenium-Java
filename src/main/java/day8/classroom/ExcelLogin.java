package day8.classroom;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelLogin { 
	@DataProvider
	public String[][] readExcel() throws IOException
	{
		XSSFWorkbook wbook=new XSSFWorkbook("./data/createLead.xlsx");
		XSSFSheet wsheet=wbook.getSheetAt(1);
		int rowCount=wsheet.getLastRowNum();
		int colCount=wsheet.getRow(0).getLastCellNum();
		String[][] data=new String[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = wsheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j]=value;
				System.out.println(value);
				
			}
		}
		return data;
	}
	
			@Test(dataProvider="readExcel")
			public void Login(String uname,String pwd) {
				// Set the property for ChromeDriver
						System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

						// Initiate the ChromeBroswer
						
						ChromeDriver driver = new ChromeDriver();
						// Maximize the browser
						driver.manage().window().maximize();
						driver.get("http://leaftaps.com/opentaps/control/main");
						// Enter the UserName
						WebElement username = driver.findElementById("username");
						username.sendKeys(uname);
						// Enter the Password
						WebElement password = driver.findElementById("password");
						password.sendKeys(pwd);
		}
		
		
	}
	


