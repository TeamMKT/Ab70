package module3;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorProgram 
{
	public static void main(String[] args) 
	{
		Vector<String> v1=new Vector<String>();
		v1.addElement("Sun");
		v1.addElement("Moon");
		v1.addElement("Pluto");
		v1.addElement("Venus");
		System.out.println(v1);
		
		
		Iterator<String> i1=	v1.iterator();
		
		ListIterator<String> i2=v1.listIterator();
		
		Enumeration<String> i3=	v1.elements();
		/*can do only forward Iteration
		 * Only applicavle fro legacy classes-Vector and Stack
		 * 
		 */
		while(i3.hasMoreElements())
		{
			System.out.println(i3.nextElement());
		}
		
		
	}
}
