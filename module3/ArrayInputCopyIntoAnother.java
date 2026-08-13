package module3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputCopyIntoAnother 
{
	public static void main(String[] args) 
	{
		int [] input=new int[6]	;
		input[0]=12;
		input[1]=21;
		input[2]=33;
		input[3]=55;
		input[4]=43;
		input[5]=89;

		System.out.println("Original Array->");
		System.out.println(Arrays.toString(input));
		int [] second=new int[input.length];
	for(int i=0,j=input.length-1;i<input.length;i++,j--)
	{
		second[j]=	input[i];
		/*second[5]=	input[0];
		 * second[4]=	input[1];
		 * second[3]=	input[2];
		 * second[2]=	input[3];
		 * second[1]=	input[4];
		 * second[0]=	input[5];
		 */
	}
	System.out.println("Copied Array->");
		System.out.println(Arrays.toString(second));


	}
}
