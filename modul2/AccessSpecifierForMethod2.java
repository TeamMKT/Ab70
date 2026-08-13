package modul2;

public class AccessSpecifierForMethod2 
{
	public  void add()
	{
		System.out.println("Addition");
	}
	protected  void sub()
	{
		System.out.println("Sutraction");
	}
	 void mul()
	{
		System.out.println("Multiplication");
	}
	private  void div()
	{
		System.out.println("Division");
	}
	
	public static void main(String[] args) 
	{
		AccessSpecifierForMethod2 a1=new AccessSpecifierForMethod2();	
			a1.add();
			a1.sub();
		a1.	mul();
		a1.	div();
	}
}
