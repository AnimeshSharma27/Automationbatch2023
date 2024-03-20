package eodValidation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing2 {

	@BeforeClass
	public void beforeCLass()
	{
		System.out.println("Before Testing2 class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Testing2 class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method Testing2 class");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method Testing2 class");
	}
	@Test
	public void test1()
	{
		System.out.println("Test Case 1");
	}
	
	
	
	@Test
	public void test2()
	{
		System.out.println("Test Case 2");
		System.out.println(10/0);
	}

}
