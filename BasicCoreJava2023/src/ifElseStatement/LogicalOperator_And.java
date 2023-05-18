package ifElseStatement;

public class LogicalOperator_And {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a>b && a>c)
		{
			System.out.println("a is greatest");
		} else if (b> a && b>c)
		{
			System.out.println("b is greated");
		} else 
		{
			System.out.println("c is greatest");
		}
	}

}
