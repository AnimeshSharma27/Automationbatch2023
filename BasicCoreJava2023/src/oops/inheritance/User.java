package oops.inheritance;

public class User {

	public static void main(String[] args) {
		
		Smartphone phone = new Smartphone ();
		
		phone.calling();
		phone.texting();
		phone.videoCalling();
		
		Telephone phone2 = new Telephone();
		phone2.calling();
		
		Telephone phone3 = new Smartphone();
		phone3.calling();
		
 // whenever we create the reference of parent class and object of child class
 // then we can call only functions from parent , and overridden function will be called from child class	
		
		//Object - super class of all the classes in java
		//object in oops : instance of a class
	}

}
