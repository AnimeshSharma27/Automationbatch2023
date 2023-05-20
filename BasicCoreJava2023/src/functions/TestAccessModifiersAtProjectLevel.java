package functions;

import accessModifiers.AccessModifiers;

             //child class                             //Parent class
             // sub class                              // Super class
             // derived class
public class TestAccessModifiersAtProjectLevel extends AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers obj = new AccessModifiers();
		obj.publicFunction();
		
		TestAccessModifiersAtProjectLevel obj2 = new TestAccessModifiersAtProjectLevel ();
		obj2.protectedFunction();
		

	}

}
