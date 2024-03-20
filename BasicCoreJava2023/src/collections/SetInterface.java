package collections;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		Set<Integer> ids = new HashSet<>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(2);
		ids.add(4);

		/*
		 * for(int id:ids) { System.out.println(id); }
		 */
		
		Set<String> name = new HashSet<>(); // random data
		name.add("Vikas");
		name.add("Prajyot");
		name.add("Amruta");
		name.add("Abhilasha");
		
		for(String s:name)
		{
			System.out.println(s);
		}
		System.out.println("******************************");
		
		name = new LinkedHashSet<>(); // insertion order 
		name.add("Vikas");
		name.add("Prajyot");
		name.add("Amruta");
		name.add("Abhilasha");
		
		for(String s:name)
		{
			System.out.println(s);
		}
		System.out.println("*******************************");
		
		name = new TreeSet<>();  // alphabetic order
		name.add("Vikas");
		name.add("Prajyot");
		name.add("Amruta");
		name.add("Abhilasha");
		
		for(String s:name)
		{
			System.out.println(s);
		}
	}

}
