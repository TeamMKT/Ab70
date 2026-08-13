package module3;

import java.util.Arrays;

public class AngramWords 
{
	public static void main(String[] args) 
	{
	
		String a="act";//a c t
		String b="cat";//a c t
		
		if(a.length()!=b.length())
		{
			System.out.println("The two given String can never be anagram");
		}
		else
		{
			char [] c1=a.toCharArray();
			char [] c2=b.toCharArray();
			/*sort your array
			 * 
			 * 
			 */
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));

			
			boolean b1=	Arrays.equals(c1, c2);
			if(b1)
			{
				System.out.println("The 2 Given Strings are Angaram ");
			}
			else
			{
				System.out.println("The 2 Given Strings are NOT Angaram ");

			}
		}
		
		
	}
}
