package ifElseStatement;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// addition , subtraction , multiplication , division 

		int a = 10;
		int b = 20;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		// mode % ( gives us remainder )
		
		System.out.println(a%b);
		System.out.println(b%a);
		
		// Concatenation 
		
		String name = "Animesh";
		String surname = "Sharma";
		
		System.out.println(name+surname);
		System.out.println(a+name+b);
		System.out.println(a+b+name);
		System.out.println(name+a+b);
		System.out.println(name+(a+b));
		System.out.println((a+b)+name);
		
	}

}
