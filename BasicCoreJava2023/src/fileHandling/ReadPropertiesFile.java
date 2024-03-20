package fileHandling;

import java.util.Properties;
import java.util.Set;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		System.out.println(System.getProperty("user.dir"));
		
		//Step 1. filepath
		String filepath=System.getProperty("user.dir")+"\\src\\fileHandling\\TestData.properties";
		//D:\BasicCoreJava2023\Automationbatch2023\BasicCoreJava2023\src\fileHandling\TestData.properties
        
		//System.out.println(filepath);
		//Step 2. Create fileinputstream object
		FileInputStream file = new FileInputStream(filepath);
		//Step 3. Create properties class object
		Properties p = new Properties ();
		//Step 4. call load function
		p.load(file);
		
		/*
		 * System.out.println(p.getProperty("name"));
		 * System.out.println(p.getProperty("age"));
		 * System.out.println(p.getProperty("surname"));
		 */
		Set<Object> obj = p.keySet();
		
		for(Object O:obj)
		{
			System.out.println(p.getProperty((String)O));
		}
	}

}

  
