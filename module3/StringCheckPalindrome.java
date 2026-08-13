package module3;
//WAP to reverse the String
public class StringCheckPalindrome 
{
	public static void main(String[] args) 
	{
		String input="madam";
		String output="";
	for(int i=input.length()-1;i>=0;i--)
	{
			char b=input.charAt(i);
			output=output+b;
			/*
			 * output=a;
			 * output=a+v=av
			 * output=av+=ava
			 * output=ava+j=avaj
			 * 
			 */
	}
	System.out.println("This is your input ->"+input);
	System.out.println("This is your output String-> "+output);

	
		if(output.equals(input))
		{
			System.out.println("Given String is a Palindrome");
		}
		else
		{
			System.out.println("Given String is not a Palindrome");
		}
	
	}
}
