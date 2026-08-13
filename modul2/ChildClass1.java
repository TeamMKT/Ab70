package modul2;
class Grandparent
{
	Grandparent()
	{
		System.out.println("Grandparent Cons");
	}
}
class ParentClass1 extends Grandparent
{
	ParentClass1()
	{    
		super();
		System.out.println("Parent Cons");
	}
}
public class ChildClass1 extends ParentClass1
{
	ChildClass1()
	{
		super();
		System.out.println("Child Cons");
	}
	public static void main(String[] args) 
	{
		new ChildClass1();
	}
}
