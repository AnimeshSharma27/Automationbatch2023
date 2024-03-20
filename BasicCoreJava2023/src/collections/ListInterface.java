package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {


		//for String type
		List<String> list = new ArrayList<>();
		
		list.add("Hemant");
		list.add("Prajyot");
		list.add("Vikar");
		list.add("Hemant");
		
		for (String s:list)
		{
			System.out.println(s);
		}
		
		// object is a super class and can add different type of object
		List list1 =new ArrayList<>();
		list1.add(10);
		list1.add("Animesh");
		list1.add(true);
		
		for(Object o:list1)
			
		{
			System.out.println(o);
		}
		
       List<String> list2 = new LinkedList<>();
		
		list2.add("Hemant");
		list2.add("Prajyot");
		list2.add("Vikar");
		list2.add("Hemant");
		
		for (String s:list2)
		{
			System.out.println(s);
		}
		
        
		List<String> list3 = new Vector<>();
		
		list3.add("Hemant");
		list3.add("Prajyot");
		list3.add("Vikar");
		list3.add("Hemant");
		
		for (String s:list3)
		{
			System.out.println(s);
		}
		
		/*
		 * Arraylist : implements dynamic array its better in accessing and storing the
		 * data
		 * 
		 * Linkedlist: doubly linkedlist its better in manipulate 
		 * 
		 * Vector : synchonized ,
		 * legecy class, thread safe Arraylist (grows by 50%) & vector gores by 100%
		 * dynamic array
		 */
	
	}    
}


