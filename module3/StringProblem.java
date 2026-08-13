package module3;
public class StringProblem 
{
	public static void main(String[] args) 
	{
		String a="java";//String Pool area
		/*Memory Efficient
		 * 
		 */
		String c="java";
		
		System.out.println(a==c);//address of 2 are equal
		System.out.println(a.equals(c));
		
		String b=new String("java");//heap memory
		String d=new String("java");//heap memory
		/*
		 * Object-heap memory
		 * Instance Variable-heap memory
		 * Not a Memory Efficient
		 */
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		System.out.println(a==d);
		System.out.println(b==d);

	}
}
