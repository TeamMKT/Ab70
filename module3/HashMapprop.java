package module3;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapprop 
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> h1=new HashMap<String,Integer>();
		h1.put("Maths", 90);
		h1.put("Science", 80);
		h1.put("Physcis", 91);
		h1.put("Chemistry", 76);
		h1.put("CS", 76);
		
		System.out.println(h1);
		
		Set<Entry<String,Integer>>	s2=	h1.entrySet();
		
		for(Entry<String,Integer> b1        :        h1.entrySet()      )
		{
			System.out.println(b1);
		}
			
		
		
	}
}
