package module3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionProp 
{
	public static void main(String[] args) 
	{
	
		Collection<Character> c1=	new ArrayList<Character>();
		c1.add('S');
		c1.add('J');
		c1.add('D');
		c1.add('E');
		c1.add('A');
		c1.add('P');
		c1.add('X');
		System.out.println(c1);
		
		
		Iterator<Character> j1=	c1.iterator();
		System.out.println("Iteration using Iterator:4");
		while(j1.hasNext())
		{
			System.out.println(j1.next());
		}
		
		
		
		
	}
}
