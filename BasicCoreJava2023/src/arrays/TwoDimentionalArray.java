package arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] data = {{"user1","Password1"},{"user2","Password2"},{"user3","Password3"}};
		
		//System.out.println();
		
         for(int r=0; r<data.length; r++)
		     {
			    for(int c=0; c<data[r].length; c++)
			 {
				System.out.print(data[r][c]+" ");
			}
			    System.out.println();
		}
	}

}
