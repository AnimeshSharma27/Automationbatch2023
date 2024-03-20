package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws InterruptedException  {
		
		sum(10,20);
		
		//throw new Exception("Testing Exception");
	}
	
	public static void sum( int a , int b ) throws InterruptedException // throws only worked with checked exceptions
	{
		System.out.println(a+b);
		
		Thread.sleep(2000);
	}

}


