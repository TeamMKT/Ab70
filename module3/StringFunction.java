package module3;
public class StringFunction 
{
	public static void main(String[] args) 
	{
		String a="Java";
		
	System.out.print(a.length());
	System.out.println(a.charAt(2));		
	System.out.println(a.indexOf('j'));
	
	String c=	a.toLowerCase();
	System.out.println(c);
	String b=	a.toUpperCase();
	System.out.println(b);
	
	System.out.println(a.concat(" Programming Language"));
		
	}
}
