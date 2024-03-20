package oops.inheritance;

public class TvUser {

	public static void main(String[] args) {

		SmartTv tv1 = new SmartTv ();
		tv1.channel();
		tv1.hdChannel();
		tv1.ott();
		
		CrtTv tv2 = new CrtTv ();
		tv2.channel();
		
		CrtTv tv3 = new SmartTv ();
		tv3.channel();
		
		
		
		
				
		
				
	}

}
