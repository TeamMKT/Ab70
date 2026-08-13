package module3;
//WAP to reverse the String
public class StringReverse 
{
	public static void main(String[] args) 
	{
		String input="java";
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

	}
}
