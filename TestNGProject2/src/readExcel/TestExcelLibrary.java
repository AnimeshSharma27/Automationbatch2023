package readExcel;

import java.io.IOException;

public class TestExcelLibrary {

	public static void main(String[] args) throws IOException {
		
		ExcelFunctionLibrary ef = new ExcelFunctionLibrary ();
		String data1= ef.getCellData("TestData", 1, 1);
		
		System.out.println(data1);
		
        String data2= ef.getCellData("Sheet2", 1, 1);
		
		System.out.println(data2);
		
       String data3= ef.getCellData("Sheet1", 1, 1);
		
		System.out.println(data3);
		
	}

}
