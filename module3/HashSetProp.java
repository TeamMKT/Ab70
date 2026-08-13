package module3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProp 
{
	public static void main(String[] args) {
		HashSet<String> h1=new HashSet<String> ();
		h1.add("Cat");
		h1.add("donkey");
		h1.add("monkey");
		h1.add("tiger");
		h1.add("pig");
		
		Iterator<String> i1=	h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}
