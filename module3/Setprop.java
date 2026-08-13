package module3;

import java.util.HashSet;
import java.util.Set;

public class Setprop 
{
	public static void main(String[] args) 
	{
		
        Set<String> s1=        new HashSet<String>();
        s1.add("Salin");
        s1.add("Salin");
        s1.add(null);
        s1.add(null);

        s1.add("Ravati");
        s1.add("Krishna");
        s1.add("Gowtham");
        System.out.println(s1);
        /* indexing-false
         * order of inseertion-false
         * Duplicates-false
         * 
         * 
         * 
         */
	}
}
