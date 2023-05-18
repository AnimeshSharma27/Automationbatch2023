package homeWork;

public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		//Loop to iterate over each row
		for(int i=1;i<=n;i++){
			//Loop to iterate over each column of the ith row
			for(int j=1;j<=i;j++){
				System.out.print(i+ " "); 
			}
			System.out.println();
		}
	}
	}


