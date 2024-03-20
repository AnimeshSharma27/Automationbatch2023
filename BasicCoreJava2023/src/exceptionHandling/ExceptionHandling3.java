package exceptionHandling;

import oops.abstraction.RBI;

public class ExceptionHandling3 {

	public static void main(String[] args) {


		int a=0;
		int b=20;
	try {	
		//1. ArithmeticException
		System.out.println(b/a);  // on failure generate log file 
		
		//2. StringIndexOutOfBoundsException
		String name="Aninmesh";
		System.out.println(name.charAt(8)); //on failure revert the config changes 
		
		//3. ArrayIndexOutOfBoundsException
		String[] arr= {"Animesh","Sharma"};  // on failure remove the error from procedure 
		System.out.println(arr[2]);
		
		//4. NullPointerException
		RBI rbi = null;                   // on failure restart the xyz service 
		rbi.creditCard();
	}catch(ArithmeticException e)
	{
		System.out.println("Recovery Scenrio 1" +e.getMessage());
	}catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("Recovery Scenrio 2" +e.getMessage());
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Recovery Scenrio 3" +e.getMessage());
	}catch(NullPointerException e)
	{
		System.out.println("Recovery Scenrio 4" +e.getMessage());
	}catch(Exception e){
		System.out.println("Unknown exception: "+e.getMessage());
	}

}
}