package constructor;

public class Car {
	
	String colour;
	String type;
	String fuelType;
	
	public static int wheels=4;
	
	public void features()
	{
		System.out.println(colour+" colour "+type+" "+fuelType+ "  Car");
	}


     // constructor name is always class name 
     // constructor does not have return type 
     // every class always has default constructor
	 // Constructor overloading : when we have two or more constructor with same name and different parameters

      public Car ()
      {
    	  
      }
      
      //constructor
      public Car (String colour, String type, String fuelType)
      {  
    	  //Initialization
    	  this.colour=colour;  ///this always point to instance variable 
    	  this.type=type;
    	  this.fuelType=fuelType;
      }
}      