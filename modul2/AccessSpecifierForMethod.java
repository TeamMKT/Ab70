package modul2;

public class AccessSpecifierForMethod 
{
	public static int a=100;
	protected static int b=50;
	 static int c=25;
	private static int d=12;

	public static void add()
	{
		System.out.println("Addition");
	}
	protected static void sub()
	{
		System.out.println("Sutraction");
	}
	static void mul()
	{
		System.out.println("Multiplication");
	}
	private static void div()
	{
		System.out.println("Division");
	}
	
	public static void main(String[] args) 
	{
			add();
			sub();
			mul();
			div();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);

	}
}
