package exceptionHandling;

import oops.abstraction.RBI;

public class UnCheckedException {

	public static void main(String[] args) {
		// an exception is an event which occurs during the execution which disrupt the flow of execution 

		int a=0;
		int b=20;
		
		//1. ArithmeticException
		//System.out.println(b/a);
		
		//2. StringIndexOutOfBoundsException
		String name="Aninmesh";
		//System.out.println(name.charAt(8));
		
		//3. ArrayIndexOutOfBoundsException
		String[] arr= {"ANimesh","Sharma"};
		//System.out.println(arr[2]);
		
		//4. NullPointerException
		RBI rbi = null;
		rbi.creditCard();
	}

}
