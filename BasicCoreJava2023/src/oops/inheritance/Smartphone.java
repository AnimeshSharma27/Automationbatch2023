package oops.inheritance;

public class Smartphone extends Mobile {
	
	public void videoCalling ()
	{
		System.out.println("Video calling from Smartphone");
	}

	public void calling()
	{
		System.out.println("Calling from Smartphone");
	}
	
	//method overriding : 1. functions with same name in parent and child class 
	// 2. functions with same numbers of parameters 
}
