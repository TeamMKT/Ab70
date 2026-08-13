package module1;

import java.util.Scanner;

public class TrangleCircumferance
{
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Please eneter the value of A:");
		int a=	s1.nextInt();
		System.out.println("Please eneter the value of B:");
		int b=s1.nextInt();
		System.out.println("Please eneter the value of C:");
		int c=s1.nextInt();
		
		int circumOfCircle=a+b+c;
		
		System.out.println(circumOfCircle);
		s1.close();
	}
}
