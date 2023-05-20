package functions;

public class NonStaticFunctions {

	public int age = 32;
	public static String name ="animesh";
	
	public static void main (String[] args) {
	//Thumb rule : static function can only call static methods and variables 
	// To call non static functions and variable  you need to create an object of that class
	                //reference //object
	NonStaticFunctions objref =  new NonStaticFunctions(); // Object creation
	
	int add =objref.sum(10,20);
	System.out.println(objref.age);
	
	message();
	System.out.println(name);
	}

  

public static void message() {
		System.out.println(" your messah");
	}



public  int sum (int a , int b)
   {
	   return a+b;
   }
}
	