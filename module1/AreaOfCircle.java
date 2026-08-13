package module1;

import java.util.Scanner;

public class AreaOfCircle
{
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Please eneter the value of R:");
		int r=	s1.nextInt();
	
		
		double areaOfCircle=Math.PI*r*r;
		
		System.out.println(areaOfCircle);

		s1.close();
	}
}
