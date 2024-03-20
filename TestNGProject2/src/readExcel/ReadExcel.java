package readExcel;

import java.io.IOException;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

    //Step 1 
		String path ="D:\\BasicCoreJava2023\\Automationbatch2023\\TestNGProject2\\src\\readExcel\\Testdata.xlsx";
	//Step 2 
		FileInputStream file = new FileInputStream (path);
	//Step 3 
		XSSFWorkbook wb = new XSSFWorkbook(file);
	//Step 4
		XSSFSheet sheet = wb.getSheet("TestData");
	//Step 5
		XSSFRow row = sheet.getRow(0);
	//Step 6
		XSSFCell cell = row.getCell(0);
	//Step 7
		String data = cell.getStringCellValue();
		
		System.out.println(data);
	}

}
