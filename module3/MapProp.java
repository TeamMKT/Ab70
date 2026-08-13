package module3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapProp 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1=		new HashMap<Integer,String>();//upcasting
		m1.put(1432, "Ankush");
		m1.put(6765, "Govind");
		m1.put(8765, "Praniti");
		m1.put(9897, "Shashank");

		System.out.println(m1);
		
		Set<Integer> s1=	m1.keySet();//it will only give u keys
		System.out.println(s1);
Collection<String> s2= m1.values();//it will only give u values
System.out.println(s2);

	Set<Entry<Integer,String>> i3=	m1.entrySet();//it will give u pair of values
	System.out.println(i3);

		
		
	}
}
