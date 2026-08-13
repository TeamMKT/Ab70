package module3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListProgram4 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(90);
		a1.add(67);
		a1.add(95);
		a1.add(76);
		a1.add(98);
		System.out.println(a1);
		
		boolean b1=	a1.isEmpty();
		System.out.println(b1);
	//	a1.clear();
		boolean b2=	a1.contains(90);
		System.out.println(b2);
		
		System.out.println(a1.get(1));
		
		System.out.println("Iteration using Iterator(I):");
/*		Iterator<Integer> i=		a1.iterator();//cursors in Java
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		/*next-Object
		 * hasnext-boolean
		 * remove
		 * we can do only forward Iteration
		 * It is applicable to the entire Collection
		 */
		
		
		ListIterator<Integer> i2=	a1.listIterator();//cursors in Java
		/*next-Object
		 * hasnext-boolean
		 * remove
		 * 
		 * previous-Object
		 * hasprevious-boolean
		 * set
		 * This can do iteration in both direction forward and backward
		 * this topic is only applicable to the List and its classes
		 */
/*		System.out.println("Iteration using ListIterator(I) in forward Dircetion:");
		while(i2.hasNext())
		{
			System.out.println();
		}
		System.out.println("Iteration using ListIterator(I) in Backward Direction:");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		
	*/	
		
		
	}
}
