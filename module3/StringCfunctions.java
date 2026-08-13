package module3;
public class StringCfunctions 
{
	public static void main(String[] args) 
	{
		String a="java";//String Pool area
		
		boolean b1=	a.equals("Java");
		System.out.println(b1);
		String b="ram singh verma";//String Pool area

		boolean b2=	b.contains("verma");
		System.out.println(b2);

		/*
		 * WAP to check if the String starts with S or not
		 * 
		 * 
		 */
		String f="school";//String Pool area
		boolean b5=	f.matches("s(.*)");
		System.out.println(b5);

		
		boolean b6=	f.matches("(.*)l");
		System.out.println(b6);
	}
}
