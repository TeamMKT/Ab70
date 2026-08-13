package module3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputAtRunTime 
{
	public static void main(String[] args) 
	{
		int [] first=new int[3]	;
		first[0]=12;
		first[1]=21;
		first[2]=33;
		System.out.println("Original Array->");
		System.out.println(Arrays.toString(first));
		int [] second=new int[first.length];
	for(int i=0;i<first.length;i++)
	{
		second[i]=	first[i];
	}
	System.out.println("Copied Array->");
		System.out.println(Arrays.toString(second));


	}
}
