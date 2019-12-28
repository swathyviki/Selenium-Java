package day8.classroom;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LearnExcel {
	
public  String[][] readExcel(String fname) throws IOException {
	 
	XSSFWorkbook wbook=new XSSFWorkbook("./data/"+fname+".xlsx");
	System.out.println(wbook);
	XSSFSheet wsheet=wbook.getSheetAt(0);
	int rowcount=wsheet.getLastRowNum();
	System.out.println(rowcount);
	int colCount=wsheet.getRow(0).getLastCellNum();
	System.out.println(colCount);
	String[][] data=new String[rowcount][colCount];
	for(int j=1;j<=3;j++) 
	{
		XSSFRow row=wsheet.getRow(j);
		
			for (int i = 0; i < colCount; i++) {
				XSSFCell cell = row.getCell(i);
				String value = cell.getStringCellValue();
				data[j-1][i]=value;
				System.out.println(value + " ");
			}
		System.out.println();
	}
	return data;
}
}
