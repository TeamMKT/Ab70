package module3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionProgram 
{
	public static void main(String[] args) throws MalformedURLException, FileNotFoundException 
	{
		
		System.out.println("Hello");
		URL u1=new URL("https://www.google.com");
		FileInputStream fs=new FileInputStream("E:\\MKTProject\\AutomationBatch70\\manish.xlsx");
		System.out.println("Bye");

	}
}
