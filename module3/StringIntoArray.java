package module3;

import java.util.Arrays;

public class StringIntoArray 
{
	public static void main(String[] args) 
	{
		String a="automation";
		
		char [] c1=	a.toCharArray();
		/*Array follow indexing
		 * store duplicates
		 * store null
		 * only homogenious
		 * they are known for its fixed size	 
		 * 
		 */
		//lets iterate the array
		
		for(int i=0;i<=a.length()-1;i++)
		{
			System.out.println(c1[i]);
		}
		
		
		System.out.println(Arrays.toString(c1));
		
		
	}
}
