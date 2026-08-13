package module3;
public class Narrowing 
{
	public static void main(String[] args) 
	{
	//double into int
		
	double a=3.14;
	int b=(int)a;//syntax of narrowing-explicitely
	System.out.println(b);
	
	int q=100;
	double d=q;//this is widenning-implicitely
	System.out.println(d);
	
	double e=(double)q;//this is widenning-explicitely
	System.out.println(e);
	
	
		
	}
}
