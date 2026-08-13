package module1;
import java.util.Scanner;
public class HumanInput 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=	s1.next();
		System.out.println("What is your Age?");
		int age=	s1.nextInt();
		
		s1.close();
	}
}
