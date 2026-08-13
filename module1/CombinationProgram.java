package module1;
public class CombinationProgram 
{
	int d=100;//global variables
	int p=900;//global variables
	static void a(boolean a,String b)//Local variable-scope will be within the method
	{
		
	}
	static void b(String a,boolean b)//Local variable-scope will be within the method
	{
		
	}
	static void c(double a,int b)//Local variable
	{
		
	}
	static void d(double a,char c)//Local variable
	{
		
	}
	static void e(char a,char b,char c)//Local variable
	{
		
	}
	static void f(String a,String b)//Local variable
	{
		
	}
	public static void main(String[] args) //Local variable
	{
		a(false,"hello");
		b("Bye",true);
		c(1.1,10);
		d(1.1,'X');
	}
}
