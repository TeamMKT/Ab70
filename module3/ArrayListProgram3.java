package module3;

import java.util.ArrayList;

public class ArrayListProgram3 
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
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(200);
		a2.add(300);
		a2.add(400);
		a2.add(500);
		a2.add(600);
		System.out.println(a2);
		
		a1.add(3, 100);
		System.out.println(a1);
		
		a1.addAll(1,a2);
		System.out.println(a1);
		
		boolean b3=	a1.containsAll(a2);
		System.out.println(b3);
		
		a1.removeAll(a2);
		System.out.println("After remove all->"+a1);
		
		boolean b4=	a1.equals(a2);
		System.out.println(b4);
	}
}
