package modul2;
class K3
{
	K3(int a)
	{
		this();
		System.out.println("6");

	}
	K3()
	{
		System.out.println("5");
	}
}
class K2 extends K3
{
	K2(char a)
	{
		super(100);
		System.out.println("4");
	}
	K2()
	{
		this('D');
		System.out.println("3");
	}
}
public class K1 extends K2
{
	K1(String a)
	{
		this();//Non Parametrized This calling statemnet
		System.out.println("2");
	}
	K1()
	{
		super();
		System.out.println("1");
	}	
	public static void main(String[] args) 
	{
		K1 k=new K1("Automation");
		
	}
}
