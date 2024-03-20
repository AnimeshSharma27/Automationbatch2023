package readExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFunctionLibrary {

	
	public String getCellData (String sheetname, int rowNumber, int columnNumber ) throws IOException
	{
		String path = System.getProperty("user.dir");
	//Step 1 
		String path1 ="D:\\BasicCoreJava2023\\Automationbatch2023\\TestNGProject2\\src\\readExcel\\Testdata.xlsx";
	//Step 2 
		FileInputStream file = new FileInputStream (path1);
	//Step 3 
		XSSFWorkbook wb = new XSSFWorkbook(file);
	//Step 4
		XSSFSheet sheet = wb.getSheet(sheetname);
	//Step 5
		XSSFRow row = sheet.getRow(rowNumber);
	//Step 6
		XSSFCell cell = row.getCell(columnNumber);
	//Step 7
		String data = cell.getStringCellValue();
		
		//System.out.println(data);
		return data;
	}
}
