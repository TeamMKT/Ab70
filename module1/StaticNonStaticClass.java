package module1;
public class StaticNonStaticClass 
{
	static void add()            //Static Method
	{
		System.out.println("Static Method");
	}
	 void sub()//Non Static Method
	{
			System.out.println("Non Static Method");
	}
	 StaticNonStaticClass()          //Constructor
	 {
			System.out.println("Constructor"); 
	 }
	public static void main(String[] args) //Main Method
	{
		System.out.println("Start of the main method");
		add();
		StaticNonStaticClass s1=new StaticNonStaticClass();
		s1.sub();
		/*
		 * ClassName referanceVariable=new ClassName();
referanceVariable.nonstaticmethod();
		 */
		System.out.println("End of the main method");

	}
}
