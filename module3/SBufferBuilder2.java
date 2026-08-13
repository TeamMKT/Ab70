package module3;
public class SBufferBuilder2 
{
	public static void main(String[] args) 
	{
	StringBuffer s1=new StringBuffer("Auto");
	s1.append("matic");//there is no contact method here
	System.out.println(s1);
	s1.delete(0, 3);
	
	s1.insert(2, "Testing");
	System.out.println(s1);
	StringBuffer s2=new StringBuffer("Automation");

	s2.replace(0,11 , "Selenium");
	System.out.println(s2);
	
	}
}
