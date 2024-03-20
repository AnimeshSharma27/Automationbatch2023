package fundTransfer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
	
	@BeforeTest
	public void beforeFundTransferModule()
	{
		System.out.println("Before Fund Transfer Module");
	}
	
	@AfterTest
	public void afterFundTransferModule()
	{
		System.out.println("After Fund Transfer Module");
	}
	
	@BeforeClass
	public void beforeCLass()
	{
		System.out.println("Before Fund transfer Module class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Fund transfer Module class");
		System.out.println("**********************************************");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method Fund transfer Module");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method Fund transfer Module");
	}
	@Test
	public void test1()
	{
		System.out.println("Test Case 1 of Fund Transfer");
	}
	
	
	
	@Test
	public void test2()
	{
		System.out.println("Test Case 2 of Fund Transfer");
		System.out.println(10/0);
	}

}
