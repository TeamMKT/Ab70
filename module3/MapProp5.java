package module3;

import java.util.HashMap;
import java.util.Map;

public class MapProp5 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1=		new HashMap<Integer,String>();//upcasting
		m1.put(1432, "Ankush");
		m1.put(6765, "Govind");
		m1.put(8765, "Praniti");
		m1.put(9897, "Shashank");

		System.out.println(m1);
		
		Map<String,Integer> m2=		new HashMap<String,Integer>();//upcasting
		m2.put("Maths", 90);
		m2.put("Sci", 56);
		m2.put("Hindi", 96);
		m2.put("English", 75);
		m2.put("Social", 89);

		System.out.println(m2);
		
		Map<Character,String> m3=		new HashMap<Character,String>();//upcasting
		m3.put('M', "Male");
		m3.put('F', "Female");
		m3.put('C', "Custom");
		System.out.println(m3);
		
		
		
		
	}
}
