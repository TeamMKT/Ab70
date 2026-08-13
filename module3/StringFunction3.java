package module3;
public class StringFunction3 
{
	public static void main(String[] args) 
	{
		String a="Automation";
	String b=	a.replace('A', 'a');
		System.out.println(b);
		String c="java is my fav language";

		String d=	c.replace("java", "JavaScript");
		System.out.println(d);
		//replace all the smaller letters with .
		String e=	a.replaceAll("[a-z]", "");
		System.out.println(e);
		
		//replace all the capital letters with .
		String f=	a.replaceAll("[A-Z]", ".");
		System.out.println(f);
		//replace all the numeric letters with .
		String g="house no 18,5th cross Ganesh layout , koramangala bangalore 560023";

		System.out.println(g.replaceAll("[0-9]", "."));
	}
}