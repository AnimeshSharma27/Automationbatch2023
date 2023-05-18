package functions;

public class Function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(10,20);
		sum(30,40);
		sum(50,60);
		message("Animesh",24);
		
	}
	//Access modifiers //Type/Nature //Return type //Name // Parameters 
		public           static        void         sum     (int a , int b )
		{
			
			System.out.println(a+b);
		}
		
		public static void message (String name , int age)
		{
			System.out.println("Your name is " +name+ " and your age is " +age);
		}
	}


