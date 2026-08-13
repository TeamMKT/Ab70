package module3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceProp 
{
	public static void main(String[] args) 
	{
		List<String> l1=	new ArrayList<String>();
		l1.add("Annu");
		l1.add("Gowtham");
		l1.add("Prachi");
		l1.add("Revati");
		l1.add("Manikanta");
		
		System.out.println(l1);
		
		Iterator<String> i2=	l1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		ListIterator<String> i3=	l1.listIterator();
		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}
		while(i3.hasPrevious())
		{
			System.out.println(i3.previous());
		}

	}
}
