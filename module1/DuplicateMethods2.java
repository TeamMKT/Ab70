package module1;
//Method Overloading:Developing multiple methods with the same name but varition in the argument list
//is called as Method overloading.
//You can overload both sttaic as well as non sttaic method
//What is varition in the argument list mean?
/*
 * 1. Order of argumnets should be different
 * 2. Number of argumnets can also be different
 * 
 */
public class DuplicateMethods2 
{
	static void add(int b,double a)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	static void add(int a,int b,int c,int d,int e,int f)
	{
		int sum=a+b+c+d+e+f;
		System.out.println(sum);
	}
	 void add(double a,int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		add(100,9.9);
		add(10,10,90,70,78,65);
		DuplicateMethods2 d1=new DuplicateMethods2();
		d1.add(12.2,12);
	}
}
