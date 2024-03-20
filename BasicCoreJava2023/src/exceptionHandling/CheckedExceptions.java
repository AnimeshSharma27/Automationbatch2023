package exceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("animesh");
		
		//Exception 1: InterruptedExecption
		Thread.sleep(5000);
		System.out.println("Sharma");
		
		
		// Exception 2: FileNotFoundException
		FileInputStream file = new FileInputStream (" ");
		
		Properties p= new Properties();
		
		//exception 3: IOException 
		p.load(file);
	}

}
