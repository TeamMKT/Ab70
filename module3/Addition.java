package module3;
public class Addition 
{
	static int add(int a,int b)
	{
		int sum=a+b;
		return sum;
		
	}
	static int sub(int a,int b)
	{
		int c=a-b;
		return c;
		
	}
	static int mul(int a,int b)
	{
		int c=a*b;
		return c;
		
	}
	public static void main(String[] args)
	{
		System.out.println(add(10,20));
		System.out.println(sub(20,30));
		System.out.println(mul(10,50));
	}
}
