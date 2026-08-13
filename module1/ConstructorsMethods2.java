package module1;
//Constructor Overloading:Developing multiple Constructor but varition in the argument list
//is called as Constructor overloading.
//What is varition in the argument list mean?
/*
* 1. Order of argumnets should be different
* 2. Number of argumnets can also be different
* 
*/
public class ConstructorsMethods2 
{
	ConstructorsMethods2(int a,char b)
	{
		System.out.println("1");
	}
	ConstructorsMethods2(String a,char b)
	{
		this(100,'P');
		
		System.out.println("2");

	}
	ConstructorsMethods2(String a,String b)
	{
		this("Automation",'S');
		System.out.println("3");

	}
	ConstructorsMethods2(int a,int b)
	{
		this("ram","soni");
		System.out.println("4");

	}
	public static void main(String[] args) 
	{
		new ConstructorsMethods2(100,200);

	}
}
