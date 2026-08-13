package modul2;
class C3
{
	static void house()
	{
		System.out.println("house");
	}
}
class C2 extends C3
{
	static void car()
	{
		System.out.println("Car");
	}
}
public class C1 extends C2
{
	static void gold()
	{
		System.out.println("Gold");
	}
	
	public static void main(String[] args) 
	{
		car();
		house();
		gold();
	}
}
