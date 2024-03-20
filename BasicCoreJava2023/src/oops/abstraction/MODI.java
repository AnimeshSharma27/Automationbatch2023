package oops.abstraction;

public interface MODI {

	default void demonetization ()
	{
		System.out.println("500 and 1000 currencies are invalid");
	}
}
// through default access modifier we can user concrete method in the abstract class 