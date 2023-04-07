package arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] stds= new String[5];
		
		stds[0]= "animesh";
		stds[1]= "amish";
		stds[2]= "adhiraj";
		stds[3]= "megha";
		stds[4]= "bunny";
		
		//System.out.println(stds[3]);
		//System.out.println(stds.length);
		
		/**for (int i=0; i<stds.length; i++)
		{
			System.out.println(stds[i]);
		}**/
		
		for(int i=stds.length-1; i>=0; i--)
		{
			System.out.println(stds[i]);
		}
		
	}

}
