package module3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListProgram5 
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
		
		
		
		Iterator<Integer> is=a1.iterator();//cursors in Java
		System.out.println("Iteration using Iterator in forward Iteration:");
		while(is.hasNext())
		{
			System.out.println(is.next());
		}
		
		/*
		is.next()->Object
		is.hasNext()->boolean
		is.remove();
		->You can do forward Iteration
		->This concept is applicbale to the entire Collection
		*/
		
		
		ListIterator<Integer> ts=	a1.listIterator();//cursors in Java
		System.out.println("Iteration using List Iterator in forward direction:");
		while(ts.hasNext())
		{
			System.out.println(ts.next());
		}
		System.out.println("Iteration using List Iterator in backward direction:");

		while(ts.hasPrevious())
		{
			System.out.println(ts.previous());
		}
		
		
		/*
		ts.hasNext()->boolean
		ts.next()->Object
		ts.hasPrevious()->boolean
		ts.previous()->Object
		ts.remove();
		ts.set(null);
		
		->You can do forward Iteration and also backward Iteration
		->This concept is applicbale to the List and its Classes

		
		*/
	}
}
