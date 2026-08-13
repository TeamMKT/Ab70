package module3;

import java.util.HashMap;
import java.util.Map;

public class MapProp4 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1=		new HashMap<Integer,String>();//upcasting
		m1.put(1432, "Ankush");
		m1.put(6765, "Govind");
		m1.put(8765, "Praniti");
		m1.put(9897, "Shashank");
		m1.put(3443, "Manish");

		Map<Integer,String> m2=		new HashMap<Integer,String>();//upcasting
		m2.put(6764, "Ashish");
		m2.put(8762, "Yadav");
		m2.put(8910, "Sanjay");
		m2.put(7620, "Shristi");
	
		boolean b1=	m1.containsKey(1234);
System.out.println(b1);
boolean b2=	m1.containsValue("MKT");
System.out.println(b2);


		boolean b3=	m1.equals(m2);
		System.out.println(b3);

	/*	m1.clear();
		System.out.println(m1);
		
		boolean b4=	m1.isEmpty();
		System.out.println(b4);
		*/
		
		m1.remove(9897);
		System.out.println(m1);
		m1.remove(3443, "Manish");
		System.out.println(m1);
		
		m1.replace(6765, "Vishnu");
		System.out.println(m1);
m1.replace(1432, "Ankush", "Manikanta");
		System.out.println(m1);
		
		int count=m1.size();
		System.out.println(count);
		
		
		
	}
}
