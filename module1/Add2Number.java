package module1;

import java.util.Scanner;

public class Add2Number 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please eneter the value of A:");
		int a=	s1.nextInt();
		System.out.println("Please eneter the value of B:");
		int b=s1.nextInt();
		
		//int sum=	a+b;
		
		int sum=	Math.addExact(a, b);
		System.out.println("The addition of 2 number->"+sum);
		
		s1.close();
	}
}
