package module1;
public class NonStaticPara 
{
	 void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	 void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	 void mul(double a,double b)
	{
		double c=a*b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		NonStaticPara n1=new NonStaticPara();
		n1.add(100,200);
		n1.sub(300,200);
	n1.mul(12.3,12.6);

	}
}
