package module1;
//Constructor Overloading:Developing multiple Constructor but varition in the argument list
//is called as Constructor overloading.
//What is varition in the argument list mean?
/*
* 1. Order of argumnets should be different
* 2. Number of argumnets can also be different
* 
*/
public class ConstructorsMethods 
{
	ConstructorsMethods(int a,char b)
	{
		System.out.println("1");
	}
	ConstructorsMethods(String a,char b)
	{
		System.out.println("2");

	}
	ConstructorsMethods(String a,String b)
	{
		System.out.println("3");

	}
	ConstructorsMethods(int a,int b)
	{
		System.out.println("4");

	}
	public static void main(String[] args) 
	{
/*		ConstructorsMethods c1=new ConstructorsMethods(100,'S');
		ConstructorsMethods c2=new ConstructorsMethods("Hello",'S');
		ConstructorsMethods c3=new ConstructorsMethods("UN","PWD");
		ConstructorsMethods c4=new ConstructorsMethods(100,200);
*/
		
		new ConstructorsMethods(100,'S');
		new ConstructorsMethods("Hello",'S');
		new ConstructorsMethods("UN","PWD");
		new ConstructorsMethods(100,200);

	}
}
