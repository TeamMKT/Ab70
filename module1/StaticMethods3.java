package module1;
public class StaticMethods3 
{
	static int a=200;//global varibale
	static int b=100;//global varibale
	static void add()            //Static Method
	{
	
		int sum=a+b;//local varibale
		System.out.println("Answer is ->"+sum);
	}
	static void sub()//
	{

		int c=b-a;
		System.out.println("Answer is ->"+c);	}
	static void mul()//
	{
		
		int c=a*b;
		System.out.println("Answer is ->"+c);	
		}
	static void div()//
	{

		int c=a/b;
		System.out.println("Answer is ->"+c);	
		}
	static void mod()
	{

		int c=a%b;
		System.out.println("Answer is ->"+c);
		}
		public static void main(String[] args) //Main Method
	{
			add();	
			sub();
			mul();
			div();
			mod();
	}
}
