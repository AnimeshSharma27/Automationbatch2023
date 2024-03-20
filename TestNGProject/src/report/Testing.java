package report;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
	
	
	@BeforeTest
	public void beforeReportModule()
	{
		System.out.println("Before Report Module");
	}
	
	@AfterTest
	public void afterReportModule()
	{
		System.out.println("After Report Module");
	}
	
	@BeforeClass
	public void beforeCLass()
	{
		System.out.println("Before Report Module class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Report Module class");
		System.out.println("**********************************************");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method Report Module");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method Report Module");
	}
	@Test
	public void test1()
	{
		System.out.println("Test Case 1 of Report module");
	}
	
	
	
	@Test
	public void test2()
	{
		System.out.println("Test Case 2 of Report module");
		System.out.println(10/0);
	}

}
