package constructor;

public class CarUser {

	public static void main(String[] args) {
		
		
		// Constructor is a method to help initilize the object 
		// object ==> object is an instance of a class
		
		//primitive : int , sort , byte, long , double , float . boolean , char
		// Non primitive : Classes , Arrays , Interfaces 
		
	// data type // object reference // object(instance)	
	/*	Car            car1 =             new Car(); //Non primitive 
		int              a  =             10;        // primitive 
		boolean      status =             true;      // primitive 
		String       name   =             "Animesh"; //Non primitive  
		
		car1.colour="Red";
		car1.type="SUV";
		car1.fuelType="Diesel";
		
		Car.wheels=4;
		car1.features();
		
		
		Car car2 = new Car();
		car2.colour="Blue";
		car2.type="Sedan";
		car2.fuelType="Petrol";
		car2.features();
		
		Car car3 = new Car();
		car3.colour="White";
		car3.type="Hatchback";
		car3.fuelType="CNG";
		car3.features(); */
		
		
		Car car4 = new Car("white", "SUV", "Petrol") ;
		car4.features();
		Car car5 = new Car ();
		car5.features();
	}

}
