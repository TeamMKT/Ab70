package module3;
public class StringBuilderProgram 
{
	public static void main(String[] args) 
	{
		StringBuilder s1=new StringBuilder("QA Engineer");
		s1.append(" 2");
		System.out.println(s1);
		s1.insert(2, " Manual");
		System.out.println(s1);

		s1.delete(0, 3);
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("Testing");
		s2.reverse();
		System.out.println(s2);
		
		StringBuilder s3=new StringBuilder("Testing");
		System.out.println(s3.substring(3));
		System.out.println(s3.substring(3,5));


	}
}
