package module3;
public class SBufferBuilder 
{
	public static void main(String[] args) 
	{
	StringBuffer s1=new StringBuffer("Auto");
	s1.append("matic");//there is no contact method here
	System.out.println(s1);
	
	StringBuilder s2=new StringBuilder("Manaul");
	s2.append("Testing");
	System.out.println(s2);
	
	}
}
