package module3;

import java.util.Arrays;

public class ArrayProblemToCheckEquals 
{
	public static void main(String[] args) 
	{
		int [] array1=new int[4];
		array1[0]=12;
		array1[1]=24;
		array1[2]=32;
		array1[3]=3;

		
		int [] array2=new int[array1.length];
		array2[0]=12;
		array2[1]=24;
		array2[2]=32;
		array2[3]=3;
		
		boolean b1=Arrays.equals(array1, array2);
		System.out.println(b1);
		
	}
}
