package modul2;
class Grandparent2
{
	Grandparent2(String name,char initial)
	{
		System.out.println("Grandparent Cons");
	}
}
class ParentClass12 extends Grandparent2
{
	ParentClass12()
	{    
		super("ram",'T');
		System.out.println("Parent Cons");
	}
}
public class ChildClass2 extends ParentClass12
{
	ChildClass2()
	{super();
		System.out.println("Child Cons");
	}
	public static void main(String[] args) 
	{
		new ChildClass2();
	}
}
