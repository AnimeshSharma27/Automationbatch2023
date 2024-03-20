package stringClass;

public class Testing {

	public static void main(String[] args) {
		
		String name = "Animesh";
		
		//Function 1.
		System.out.println(name.length());
		
		//Function 2: charAT
		System.out.println(name.charAt(3));
		
		//Function 3: equals
		String name2="animesh";
		System.out.println(name.equals(name2));
		
		//Function 4: EqualIgnoreCase
		System.out.println(name.equalsIgnoreCase(name2));
		
		//Function 5: Trim()
        System.out.println(name.trim());		
        
        //Function 6: ToUppperCase
        System.out.println(name.toUpperCase());
        
        //Functions 7: ToLowerCase
        System.out.println(name.toLowerCase());
        
        //Function 8: subString()
        System.out.println(name.substring(3));
        System.out.println(name.substring(3, 5));
        
        //Function 9:Replace 
        System.out.println(name.replace("i", "e"));
        
        //Function 10: split
        String [] str = name.split("n");
        for(String s:str)
        {
        	System.out.println(s);
        }
        
        //Anand
        
        
        
	}

}
