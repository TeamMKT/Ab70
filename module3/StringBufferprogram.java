package module3;
public class StringBufferprogram 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("QA Engineer");
		s1.delete(0, 3);
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer("Testing");
		s2.reverse();
		System.out.println(s2);
		
		StringBuffer s3=new StringBuffer("Testing");
		System.out.println(s3.substring(3));
		System.out.println(s3.substring(3,5));


	}
}
