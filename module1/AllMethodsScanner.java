package module1;
import java.util.Scanner;
public class AllMethodsScanner
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		String name=	s1.next();
		int age=	s1.nextInt();
		int a=	s1.nextByte();
		int b=s1.nextShort();
		long d=s1.nextLong();
		float g=s1.nextFloat();
		double h=s1.nextDouble();
		boolean j=s1.nextBoolean();
		s1.close();
	}
}
