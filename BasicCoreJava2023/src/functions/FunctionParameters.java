package functions;

public class FunctionParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(10,20);
		sum(30,40);
		sum(50,60);
		message("Animesh",34);
		
		//10, 20, 30
		sum(10, 20, 30);
	}
	//Access modifiers //Type/Nature //Return type //Name // Parameters 
		public           static        void         sum     (int a , int b )
		{
			
			System.out.println(a+b);
		}
		//Function overloading 
		public            static       void         sum     (int a, int b, int c)
		{
			System.out.println(a+b+c);
		}
		public            static       void         sum      (int a , String name )
		{
			
		}
		public static void sum (String name , int a  )
		{
			
		}
		public static void message (String name , int age)
		{
			System.out.println("Your name is " +name+ " and your age is " +age);
		}
	}


