package functions;

public class CarUser {

	public static void main(String[] args) {
		
		Car car1= new Car();
		car1.colour="red";
		car1.type="SUV";
		car1.wheels=4;
		car1.feature();
		
		Car car2=new Car();
		Car.wheels=4;
		car2.feature();
		
		Car car3=new Car();
		car3.feature();
		

	}

	
}
