package module1;

public class MathProgram 
{
	public static void main(String[] args) 
	{
		
		int a=	Math.addExact(100, 200);
		System.out.println(a);
		
		int b=	Math.subtractExact(400, 100);
		System.out.println(b);
		
		int c=	Math.multiplyExact(52, 10);
		System.out.println(c);
		
		int min=	Math.min(54, 85);
		System.out.println(min);
		int max=	Math.max(450, 12);
		System.out.println(max);
		
		
		int abs=	Math.abs(-90);
		System.out.println(abs);
		
		double a1=	Math.random();
		System.out.println(a1);
		
		System.out.println(Math.PI);
		
		double d=	Math.sqrt(95);
		System.out.println(d);
		
		
		Object o1=	new MathProgram();
	
		
		
	}

}
