package accessModifiers;

public class AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers obj = new AccessModifiers();
		obj.publicFunction();
		obj.privateFunction();
		obj.defaultFunction();
		obj.protectedFunction();

	}
	
	// Public , private ,protected , No access Mod/Default 
	
	// public ==> can be accessed throughout the project 
	//||Class - Y || Package- Y || Project- Y
	
	//Private ==> Can be accessed only within the call
	//||Class - Y || Package- N || Project- N
	
	//Protected ==> can be accessed within the package and can be accessed outside the package by using the child class name
	//||Class - Y || Package- Y || Project- N*
	
	//default ==> Can be accessed within the package.
	//||Class - Y || Package- Y || Project- N
	
	public void publicFunction()
	{
		System.out.println("Public Function");
	}
	
	private void privateFunction()
	{
		System.out.println("Private Function");
		
	}
     void defaultFunction()
     {
    	 System.out.println("No access modifiers function");
     }
     
     protected void protectedFunction()
     {
    	 System.out.println("Protected accessed modifiers ");
     }
}
