package module3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setprop2 
{
	public static void main(String[] args) 
	{
		
        Set<String> s1=        new HashSet<String>();
        s1.add("Salin");
        s1.add("Salin");
        s1.add("Ravati");
        s1.add("Krishna");
        s1.add("Gowtham");
        s1.add("Manish");

        System.out.println(s1);
        
        
        s1.remove("Manish");
        
        System.out.println(s1);
        System.out.println("Iteration using Iterator:");
        Iterator<String> i2=	s1.iterator();
        while(i2.hasNext())
        {
        	System.out.println(i2.next());
        }
        
        /* indexing-false(HASHCODE VALUE IT Follows)
         * order of inseertion-false
         * Duplicates-false
         * 
         * 
         * 
         */
	}
}
