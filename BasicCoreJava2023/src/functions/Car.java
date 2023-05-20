package functions;

public class Car {
	
	//Note: The default value of integer variables is 0, String variables is null
	
	//Instance variables == Non static functions ==> can be called only using object of the class
	public String colour;
	public String type;
	
	//Class variables == static variables ==> can be called using class name ( static variables can be called by objects or class name but 
	//we should always prefer class name)
	public static int wheels;
	
	public void feature()
	{
		System.out.println("My car colour is "+colour+" which has "+wheels+" wheels and its of " +type+ " type");
	}
	

}
