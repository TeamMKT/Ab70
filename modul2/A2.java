package modul2;
final class B2
{
	 void login()
	{
		System.out.println("Login using Emailid");
	}
}
public class A2 extends B2
{
	void login()
	{
		System.out.println("Login using MobileNo");
	}
	public static void main(String[] args) 
	{
		
		A2 a1=new A2();
		a1.login();
		//Whether my parent class method will execute, or my child class method will execute, it totally depends at runtime.
		//Not at compile time
		
	/*
			B b1=new B();
			b1.login();
	*/	
		}
}
