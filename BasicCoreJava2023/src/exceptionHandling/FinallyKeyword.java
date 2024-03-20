package exceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		try {
			System.out.println(a/b);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally");
		}
	}

}
