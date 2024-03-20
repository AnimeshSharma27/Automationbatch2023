package payment;

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
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Application");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Application");
	}
	
	@BeforeTest
	public void beforePaymentModule()
	{
		System.out.println("Before Payment Module");
	}
	
	@AfterTest
	public void afterPaymentModule()
	{
		System.out.println("After Payment Module");
	}
	
	@BeforeClass
	public void beforeCLass()
	{
		System.out.println("Before Payment module class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After payment module class");
		System.out.println("**********************************************");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method payment module");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method in payment module");
	}
	@Test
	public void test1()
	{
		System.out.println("Test Case 1 of Payment module");
	}
	
	
	
	@Test
	public void test2()
	{
		System.out.println("Test Case 2 of payment module");
		System.out.println(10/0);
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test case 3 of payment module");
	}

}
