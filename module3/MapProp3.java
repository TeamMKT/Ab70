package module3;

import java.util.HashMap;
import java.util.Map;

public class MapProp3 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1=		new HashMap<Integer,String>();//upcasting
		m1.put(1432, "Ankush");
		m1.put(6765, "Govind");
		m1.put(8765, "Praniti");
		m1.put(9897, "Shashank");
		
		Map<Integer,String> m2=		new HashMap<Integer,String>();//upcasting
		m2.put(6764, "Ashish");
		m2.put(8762, "Yadav");
		m2.put(8910, "Sanjay");
		m2.put(7620, "Shristi");
		
		m1.putAll(m2);
		
		System.out.println(m1);
		
		m1.putIfAbsent(6666, "Salin");
		System.out.println(m1);

		

		
	}
}
