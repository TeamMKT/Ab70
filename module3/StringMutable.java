package module3;
public class StringMutable 
{
	public static void main(String[] args) 
	{
	String a="Automation";
		a.concat("Testing");
	System.out.println(a);
	//System.out.println(new_a);

	Object o1=	new StringMutable();//upcasting
	
	
	StringMutable s1=(StringMutable)o1;
	System.out.println(s1);
	
	}
}
