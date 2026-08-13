package module1;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) 
	{
				int age=25;
				int b= 19;
				int c=20;
				char gender='F';

				if(age>28 || gender=='M' )
				{
					System.out.println("Statement 1");
				}
				else if (b<=age)
				{
					System.out.println("Statement 2");
				}
				else
				{
					System.out.println("Statement 3");

				}

	}
}
