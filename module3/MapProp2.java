package module3;

import java.util.HashMap;
import java.util.Map;

public class MapProp2 
{
	public static void main(String[] args) 
	{
		Map m1=		new HashMap();//upcasting
		m1.put(1432, "Ankush");
		m1.put(6765, "Govind");
		m1.put(8765, "Praniti");
		m1.put(9897, "Shashank");

		System.out.println(m1);
		
	}
}
