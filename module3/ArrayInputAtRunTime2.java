package module3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayInputAtRunTime2 
{
	public static void main(String[] args) 
	{
		try {
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the size of the array");
	
		int [] value=new int[s1.nextInt()]	;
	
		for(int i=0;i<value.length;i++)
		{
			System.out.println("Please enter the value at the index position-> "+i);
		value[i]	=	s1.nextInt();
		}	
		System.out.println("Final Array is ->");
		System.out.println(Arrays.toString(value));
	s1.close();
	}
	
	catch(NegativeArraySizeException q1)
	{
		System.out.println("Size of an Array can never be Negative");
		
	}
	catch(InputMismatchException q1)
	{
			System.out.println("Array size should only be numbers");
			
	}	
	finally
		{
			System.out.println("CLosing the connecting with DB");
			System.out.println("CLosing the connecting with Server");

		}
	}
}
