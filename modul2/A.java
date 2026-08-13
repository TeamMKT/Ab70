package modul2;
class B
{
	void login()
	{
		System.out.println("Login using Emailid");
	}
}
public class A extends B
{
	void login()
	{
		System.out.println("Login using MobileNo");
		super.login();
	}
	public static void main(String[] args) 
	{
		
		A a1=new A();
		a1.login();
		//Whether my parent class method will execute, or my child class method will execute, it totally depends at runtime.
		//Not at compile time
		
	/*
			B b1=new B();
			b1.login();
	*/	
		}
}
