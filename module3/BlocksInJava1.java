package module3;
public class BlocksInJava1 
{
	{
		System.out.println("This is my IIB 1");
	}
	static
	{
		System.out.println("This is my SIB");
	}
	BlocksInJava1()
	{
		System.out.println("COnstructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("This is my Main Method");
		BlocksInJava1 b1=new BlocksInJava1();
		BlocksInJava1 b2=new BlocksInJava1();

	}
}
