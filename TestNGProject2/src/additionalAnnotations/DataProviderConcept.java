package additionalAnnotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import accessModifiers.AccessModifiers;

public class DataProviderConcept {

	@Test(dataProvider="testData")
	public void loginTest(String userName, String password, String pin)
	{
		System.out.println("Enter userName :"+userName);
		System.out.println("Enter password :"+password);
		System.out.println("Enter pin:"+pin);
		System.out.println("Click Login");
		System.out.println("*******************");
		
	AccessModifiers aac = new AccessModifiers ();
	
	}
	
	/*@Test
	public void test1()
	{
		String [][] data = testData();
		for (int r=0; r<data.length; r++)
		{
			for (int c=0; c<data[r].length; c++)
			{
				System.out.print(data[r][c]);
			}
			
			System.out.println();	
		}
	}*/
	
	@DataProvider
	public String[][] testData()
	{
		String [][] data = new String[4][3];
		//Row1
		data[0][0]="Username1";
		data[0][1]="Password1";
		data[0][2]="1234";
		//Row2
		data[1][0]="Username2";
		data[1][1]="Password2";
		data[1][2]="2345";
		//Row3
		data[2][0]="Username3";
		data[2][1]="Password3";
		data[2][2]="3456";
		//Row4
		data[2][0]="Username4";
		data[2][1]="Password4";
		data[2][2]="4567";
		
		return data;
	}
}





















