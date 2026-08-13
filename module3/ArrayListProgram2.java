package module3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(90);
		a1.add(67);
		a1.add(95);
		a1.add(95);
		a1.add(76);
		a1.add(98);
		System.out.println(a1);
		int times=	Collections.frequency(a1, 95);
		System.out.println(times);
		Integer max=	Collections.max(a1);
		System.out.println(max);	
		Integer min=	Collections.min(a1);
		System.out.println(min);
		Collections.sort(a1);
			System.out.println(a1);
			Collections.reverse(a1);
			System.out.println(a1);
			
			Collections.shuffle(a1);
			System.out.println("After shuffle-> "+a1);
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Maths");
		a2.add("Sci");
		a2.add("English");
		a2.add("Hindi");
		a2.add("Social");
		String answer=	a2.get(2);
		System.out.println(answer);
		System.out.println(a2);
		
		a2.remove(1);
		System.out.println(a2);
		a2.remove("Social");
		System.out.println(a2);

	}
}
